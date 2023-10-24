package week1_OOP_Exception.Task4.exceptions;

public class MyIntOverflowException extends MyBaseException{       //унаследует от MyBaseException
    public MyIntOverflowException(String errorMessage){
        super(errorMessage);
    }
    public MyIntOverflowException(){

        super("Выход за пределы допустимых значений int");
    }
}
