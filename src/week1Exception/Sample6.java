package week1Exception;

public class Sample6 {
    public static void main(String[] args) throws MyMathException {             //добавили в сигнатуру метода
            int result = devision(55, 0);
            System.out.println(result);
    }
    public static int devision(int a, int b) throws MyMathException {
        try {
            throw new MyMathException("Произошло деление на 0.");           //чекст эксепшион
        } catch (MyMathException e)  {                                      //поймает исключение
            throw new RuntimeException(e);                                  //кинем ньюрантайм анчект
        } finally {
            throw new IllegalArgumentException("from finally!");            //если в finally кинули экспепшен то происошло перезарание , потеря стак трейся.
            // System.out.println("Hello from finally!");
        }
    }
}
//Перезатирание finally
//Опасно бросать исключния.
