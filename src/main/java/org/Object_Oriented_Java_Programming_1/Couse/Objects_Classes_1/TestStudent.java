package Course8_OOP.Circle;

public class TestStudent {
    public static void main(String[] args){
        Student student = new Student();
        System.out.println("имя? " + student.name);                     //null
        System.out.println("возраст? " + student.age);                  //0
        System.out.println("несовершеннолетний? " + student.isMinor);   //false
        System.out.println("пол? " + student.gender);                   //символ 5\u0000
    }

    }
