package week1_OOP_Exception.Task4.exceptions;


public class MyBaseException extends RuntimeException {
    public MyBaseException(String errorMessage) {                            //конструктор
        super(errorMessage);
        System.out.println("LOG: " + errorMessage);
    }
}

//родительский класс уналедованный от рантайм эксепшен
