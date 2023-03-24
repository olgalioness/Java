package week7home.task1;
/*
Реализовать класс “Лампа”.
Методы:
- включить лампу                                    //создать лампу, создать выключатель
- выключить лампу
- получить текущее состояние
 */
public class Bulb {
    private boolean toggle;                             //this имеено к этой перменной

    //public Bulb(boolean toggle) {
        //toggle = toggle;                                //принимает toggle и присваивает тогл к тоглу
    //    this.toggle = toggle;                               //поле классу выше присвоить toggle которые получили на вход конструтору

        public Bulb(){}                                     //конструтор по умолчанию

        public void turnOn(){
            this.toggle = true;                         //this к текущему укземпляру класса
        }


        public void turnOff(){
            this.toggle = false;
        }
        public boolean isShining(){                             //геттер
            return this.toggle;
        }
    }


/*
public class Bulb {                                 //создать класса
    private boolean toggle;                             //обычно входные параменты обзывают также как и поле класса

    public Bulb(boolean toggle) {                       //конструктор не обязаны прописывать по умолчанию есть
        //toggle = toggle;                              //тоглу присвоить тогл не совсем корректно
        this.toggle = toggle;                           //присвоить тогл который получить на вход конструкторв
    }
    //инденцифицировали конструктор
    public void turnOn(){                               //включить лампу
        this.toggle = true;
    }

    public void turnOff(){                              //выключить лампу
        this.toggle = false;
    }
    public boolean isShining() {                       //получить состояние лампы, написали геттер
        return this.toggle;
    }
}*/
//toggle = true;                this.toggle = true;    обращаемся имеенно к этой переменной
// this лучше всегда указывать, обращаемся к текущему состоянию класса
//экземпляр класа это инстанс класа, конкретная ссылка созданная на класс.
//мы присваиваем