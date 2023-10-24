package week1_OOP_Exception;

public class Sample5 {
    public static void main(String[] args) throws MyMathException {             //добавили в сигнатуру метода
            int result = devision(55, 0);
            System.out.println(result);

    }

    public static int devision(int a, int b) throws MyMathException {
        try {
            return a / b;
        } catch (ArithmeticException e) {                                       //объявляли переменную
            System.err.println("Возникло - ArithmeticException");       //поймали исключение и вывели
            //throw new MyMathException(e);                             //новое исключение прокинули но не обработали
            throw new MyMathException("Произошло деление на 0", e);     //перепаковали экспепшен поймали сцепление      не потеряли  а запокавали
        } finally {
            System.out.println("Hello from finally");
        }
    }
}
//подмена иисключеий - ловили(люработка) один опрокидывали другой
//не произошло сцепление, произошла подмена исключения

