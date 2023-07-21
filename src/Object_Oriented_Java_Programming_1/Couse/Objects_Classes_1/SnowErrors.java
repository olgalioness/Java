package Course8_OOP.Circle;
/*
public class SnowErrors {
        public void method1() {
            Circle c;
            System.out.println("What is radius " + c.getRadius());              //при выполнении предложения println переменная c имеет значение null.
            c = new Circle();
        }
    }
*/
/*
public class ShowErrors {
    public static void main(String[] args) {
        ShowErrors t = new ShowErrors(5);                   //пытается создать экземпляр класс с ShowErrors(int), такой конструктор отсутсвует
    }                                                       //апо умолчанию создан конструтор public ShowErrors () {
}
*/
/*
public class ShowErrors {
  public static void main(String[] args) {
    ShowErrors t = new ShowErrors();                                    //по умолчанию создан конструтор public ShowErrors ()
    t.x();                                                              //не является методом конструтора, отсуствует метод в конструторе
  }
}
 */
/*
public class ShowErrors {
  public static void main(String[] args) {
    C c = new C(5.0);                                                   //не соответствует ни одному конструктору класса C
    System.out.println(c.value);
  }
}
                                                                        //в классе C отсутствует конструктор с аргументом типа double.
class C {
  int value = 2;
}
 */