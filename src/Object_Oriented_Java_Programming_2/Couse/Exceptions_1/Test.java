package Course9_OOP2;

public class Test {

    public static void main(String[] args) {
        try {
            int value = 30;
            if (value < 40)
                throw new Exception("слишком маленькое значение");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("Продолжить после блока catch");
    }
}

