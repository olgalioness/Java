package HomeWorkOOP1.Task1;

public class main {
    public static void main(String[] args) {                                    //метод ловит исключение
        try{
            methodZero(0);                                                   //вызов метода первый отработал
            methodZero(1);                                                  //второй метод поймал исключение
        }catch (MyCheckedException e){
            e.printStackTrace();                                                //при поимке вызывает стэк трейс
        }
    }
    public static void methodZero(int num) throws MyCheckedException{
        if (num == 0){
            System.out.println("0");
        } else {
            throw new MyCheckedException("This is not zero!");                  //выбрасывает исключение
        }
    }
}
