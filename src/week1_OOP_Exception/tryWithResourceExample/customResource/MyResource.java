package week1_OOP_Exception.tryWithResourceExample.customResource;

public class MyResource implements AutoCloseable{

    @Override
    public void close() throws Exception{                       //единственный метод, переопределили close
        System.out.println("Close MyResource!");
    }
    public void printHello(){
        System.out.println("Hello");
    }
}
