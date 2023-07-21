package week1_OOP_Exception.Task4.exceptions;

public class MyWrongOperatorException extends MyBaseException{
    public MyWrongOperatorException(String errorMessage){
        super(errorMessage);
    }
    public MyWrongOperatorException(){
        super("Недопустимый оператор для калькулятора");
    }
}
