package week1Exception;

public class SampleExample3 {
    /*Работа с Multiple Exceptio
     */
    public static void main(String[] args) {
        try {
            //toDivideThroeMyMathException(100, 9);
            //someMethodThrowArrayIndexOutBoundsException();                  //анчект
            toDivideThroeMyMathException(100, 9);                           //чект
            simpleThrowRuntimeException();
        }
        //catch(Exception e){
        // System.out.println("Поймано исключение");                       //все дочерние эксепшины можно ловить родителем. но логи будут для всех одинаковые сообщения - не рекомендуется
        catch(MyMathException e){
            System.out.println("LOG: деление на 0 ->" + e.getMessage());
        } catch(ArrayIndexOutOfBoundsException e2){
            System.out.println("LOG: проблема с массивом");                 //попали сюда, первым был массив
        } catch (RuntimeException e3){
            System.out.println("LOG: Рантайм исключение");
        }
        //сatch(Exception e){                                              //в конце женерик поведение и обработка все остальных эксепшинов. обобщенное поведение
            //System.out.println("Поймано исключение");   */

    }
    public static void toDivideThroeMyMathException(int a, int b) throws MyMathException {          //пробросили в сигнатуру метода
        try{
            if (a == 100) throw new MyMathException2("Тест множественной записи");
            System.out.println(a/b);
        }catch (ArithmeticException | MyMathException2 e){
            throw new MyMathException(e.getMessage());
        }
    }
    public static void someMethodThrowArrayIndexOutBoundsException(){                               //выход за пределы массива
        int[] arr = new int[10];
        System.out.println(arr[10]);
    }
    public static void simpleThrowRuntimeException(){
        throw new RuntimeException();
    }
}
//иерархия исключений : 1. дочерние экспешины ловятся первыми. далее по иерархии бизнес эксепшеныы а далее обобщенные
//1.общий родитель (Exception или Throwable) - проблема - одинаковый текст ошибки
//instance of - провеерка - костыль - как запасной вариант решения проблемы

//2 обобщить одинаковая обработка можем использовать множественную запись исключений (catch (E1 | E2 ... ))
//поймали два и обернули в 1
//3 несколько блоков кетч -> более верно. от самого глубого наследника до самого высшего класса и множественная запись