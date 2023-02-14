package Course7_Arrays;

public class Olik_ObraborkaForArray {
    public static void main(String[] args) {
        //Инициализация массива случайными значениямиdr3
        double[] myList1 = new double[2];
        for (int i =0; i < myList1.length; i++) {
            myList1[i] = Math.random() * 100;
        }
        System.out.println(myList1[0] + " " + myList1[1]);
        //System.out.println(myList1[0] + " " + myList1[1] + myList1[2]);       //ссылка на несуществующий элемент массива

        //Инциализация массива со входными значениями от пользователя
        double[] myList = new double[2];
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("Введите " + myList.length + " значений: ");
        for (int i = 0; i < myList.length; i++)
            myList[i] = input.nextDouble();
        System.out.println("Вы ввели " + myList.length + " значений: ");

    }
}
