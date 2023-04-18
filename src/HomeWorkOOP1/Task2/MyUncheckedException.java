package HomeWorkOOP1.Task2;
/*
Создать собственное исключение MyUncheckedException, являющееся непроверяемым.
 */
public class MyUncheckedException extends RuntimeException{                 //наследование от ран тайм
    //extends RuntimeExeption - unchecked

    public MyUncheckedException(String message){                              //конструктор, принимает сообщение и вызывает стринг конструктор у родителя
        super(message);
    }
}