package week1_OOP_Exception.tryWithResourceExample.customResource;

public class MainTestMyResource {
    public static void main(String[] args) {
        try (MyResource myResource = new MyResource()){                     //создали экземпляр muresource
            myResource.printHello();                                        //вызвали метод из конструктора
        }catch (Exception e){
            System.err.println("Exception!");
        }
    }
}
//
//
//
//
//
//