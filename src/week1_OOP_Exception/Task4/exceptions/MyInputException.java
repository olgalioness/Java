package week1_OOP_Exception.Task4.exceptions;

public class MyInputException extends MyBaseException{
    public MyInputException(String errorMessage) {
        super(errorMessage);
    }
    public MyInputException(){                          //конструктор без аргументов
        super("Неправильный формат ввода.");
    }
}
