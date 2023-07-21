package HomeWorkOOP3.Task4;

import java.util.ArrayList;
import java.util.List;

/*
	Написать метод, который с помощью рефлексии получит все интерфейсы класса, включая интерфейсы от классов-родителей и интерфейсов-родителей
 */
public class Main {
    public static void main(String[] args) {
        List<Class<?>> allInterfaces = getAllInterfaces2(Z.class);
        for (Class<?> value : allInterfaces) {
            System.out.println(value);
        }
    }


    public static List<Class<?>> getAllInterfaces(Class<?> cls) {
        List<Class<?>> interfaces = new ArrayList<>();                  //формируем финальный лист
        while (cls != Object.class){                                    //пока класс не равен
            for(Class<?> anInterface : cls.getInterfaces()){            //получаем все классы от исходного
                interfaces.add(anInterface);                            //добавляем в лист
                Class<?>[] arrayInterface = anInterface.getInterfaces();//создаем массив
                while (arrayInterface.length > 0){                      //пока массив не станет равен 0 собираем все интерфейсы в массив
                    for (Class<?> elementInterface : arrayInterface) {
                        anInterface = elementInterface;
                        interfaces.add(anInterface);
                        arrayInterface = anInterface.getInterfaces();
                    }
                }
            }
            cls = cls.getSuperclass();
        }
        return interfaces;
    }


    public static List<Class<?>> getAllInterfaces2(Class<?> cls) {
        if (cls == null) {                                                          //проверка на класс, если на вхход приходит null и выдать ошибку
            return null;
        } else {
            List<Class<?>> interfaces = new ArrayList<>();
            getAllInterfacesOfParents(cls, interfaces);
            return interfaces;
        }
    }


    private static void getAllInterfacesOfParents(Class<?> cls, List<Class<?>> interfacesFound) {               //рекурсия
        while (cls != null) {
            Class<?>[] interfaces = cls.getInterfaces();
            for (Class<?> anInterface : interfaces) {
                if (!interfacesFound.contains(anInterface)) {
                    interfacesFound.add(anInterface);
                    getAllInterfacesOfParents(anInterface, interfacesFound);
                }
            }
            cls = cls.getSuperclass();
        }
    }
}

//получить все интерфейсы класса