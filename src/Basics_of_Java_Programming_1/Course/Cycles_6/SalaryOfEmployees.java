package Course6_Cycles;

public class SalaryOfEmployees {
    public static void main(String[] args) {
        /*
        int count_emp = 0;                      //пока не отработан ни один сотрудник
        while (count_emp < 7) {                  //проверка значения count_emp
            System.out.println("Введите отработанные часы: ");
            Scanner input = new Scanner(System.in);
            double hours = input.nextDouble();
            System.out.println("Введите часовую ставку в рублях: ");
            double rate = input.nextDouble();
            double pay = hours * rate;
            System.out.println("Зарплата равна " + pay + " руб.");
            ++count_emp;
        }
        System.out.println("\nВсе сотрудники обработаны.\n");               //count_emp = 7 , условие = false
        */

        int i = 0;
        while (i <= 5){
            System.out.println(i + " " + (10 - i));
            ++ i;
        }

        int even = 0;
        int n = 8;
        while (even < n) {
            System.out.println(even);
            even += 2;
        }

        int number = 0;
        int count = 1;
        while (number <= 6){
            System.out.println(number + " " + count);
            ++ number;
            count *= 2;
        }
    }
}
