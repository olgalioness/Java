package week1_OOP_Exception;

public class Sample2 {
    public static void main(String[] args) {
        devision(55,11);
    }
    public static int devision(int a, int b){
        throw new RuntimeException();
    }
}
//обернуть во что-то более пригодное и читабельно со своим сообщением
