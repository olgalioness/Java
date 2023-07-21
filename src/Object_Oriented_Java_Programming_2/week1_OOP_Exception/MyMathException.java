package week1_OOP_Exception;

public class MyMathException extends Exception{                 //checked унаследован от класа Throwable и есть конструктор со стрингом
    //extends Arifmetic exceprion unchecked

    public MyMathException(){
        //дефолтное сообщение которое не будет упирать на super, передаем сообщение об ошибки, если она одна и таже
        //super("Произошло деление на 0")
    }
    public MyMathException(String message){                 //просто принимал стринг и вызывал конструктор родительского класа
        super(message);                                     //можно перепаковывать экспепшины  друг друга у конструтора фробл есть котруктор который принимает фробл
    }
    // public MyMathException (Throwable throwable){           //
   //    super (throwable);
    //}
    public MyMathException (String message, Throwable throwable){           //
        super (throwable);
    }
}

//унаследовали клас от Exception, можно было унаслевать от Arifmetic exceprion
//Ctrl на public class ArithmeticException extends RuntimeException
//Унаследован от РайнТаймэксепшен. А он Unchectked, а мы хотели бы работать с чект
//Унаследовать можно и от Thowable суперкласс, когда идет паковка и распаковка эксепшинов.  и детектица причина исключения от Throwable
//У него имеется конструктор. Можно переделать сообщения и  один эксепшин Couse. любой эксепцин можно засунут в Фробл и как матрешку вкладывать.
//Couse buy причина возникшая. Когда большой стрект трейс на 300 строчек. причина пакуется через Throwable. Можно запаковатьи узнать причину исключения

//    конструктор со стрингом Exception . поработать с нашим сообщение
//super(message);   переданное сообщение присваивается родительскому супер классу Throwable
//public Throwable(String message){
//    fillInStackTrace();
//    detailMessage = message;

//   public Exception(Throwable cause) {                    //принимает Throwable
//        super(cause);
//    public Throwable(Throwable cause) {
//        fillInStackTrace();                                                   //и происходит фил стректрейс
//        detailMessage = (cause==null ? null : cause.toString());              //если есть cause в него записывается
//        this.cause = cause;