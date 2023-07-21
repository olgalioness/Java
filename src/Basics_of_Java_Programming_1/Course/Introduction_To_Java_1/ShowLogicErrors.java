package Course1_IntroductionToJava;

public class ShowLogicErrors {
    public static void main(String[] args) {
        System.out.print("35 градусов по шкале Цельсия равняются по шкале Фаренгейта: ");
        System.out.println((9.0 / 5) * 35 + 32);
        //при делении 9/5 усекается дробная часть. правильно делить 9.0/5 при делении
    }
}
