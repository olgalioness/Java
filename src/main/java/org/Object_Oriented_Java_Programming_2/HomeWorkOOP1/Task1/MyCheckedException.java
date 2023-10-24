package HomeWorkOOP1.Task1;

/*
Создать собственное исключение MyCheckedException, являющееся проверяемым.
 */
public class MyCheckedException extends Exception {                         //Наследование от Exception, проверяемое исключение

    public MyCheckedException(String message){                              //конструктор, принимает сообщение и вызывает стринг конструктор у родителя
        super(message);
    }
}


//Проверяемые исключения, унаследованные от Exception и Throwable

