package week1_OOP_Exception.Task4.exceptions;

public class MyDivisionByZeroException extends MyBaseException{
    public MyDivisionByZeroException(String errorMessage){
        super(errorMessage);
    }
    public MyDivisionByZeroException(){
        super("Недопустимое деление на 0.");
    }
}
