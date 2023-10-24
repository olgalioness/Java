package week1_OOP_Exception;

public class Sample3 {
    public static void main(String[] args) {
        int result = devision(55,0);
        System.out.println(result);
    }
    public static int devision(int a, int b){
        if (b == 0){
            throw new IllegalArgumentException("Нельзя делить на 0");
        }
        return a/b;
    }
}

//элигал аргумент эксепшнен.Конструктор со стрингом. перейти в метод CTRL
//анчект - java не красит
