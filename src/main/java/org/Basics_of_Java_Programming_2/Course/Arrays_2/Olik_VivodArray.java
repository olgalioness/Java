package Course7_Arrays;

public class Olik_VivodArray {
    public static void main(String[] args) {

        int myList[] = {1 , 2, 3};
        for (int i = 0; i < myList.length; i++) {
            System.out.println(myList[i] + " ");
        }
        char[] city = {'M', 'o', 's', 'c', 'o', 'w'};
        System.out.println(city);

        for (double e: myList) {                        //для каждого элемента e в myList выполните следующие действия
            System.out.println(e);
        }


        //суммирование всех элементов массива
        double list[] = {1, 1, 1};
        double total = 0;
        for (int i = 0; i < list.length; i++) {
            total += list[i];
        }
        System.out.println(total);

        //поиск наибольшего элемента массива
        double max = myList[0];
        for (int i = 1; i < myList.length; i++) {
            if (myList[i] > max)
                max = myList[i];
        }
        System.out.println(max);

        //поиск наименьшего индекса наибольшего элемента массива

        double max1 = myList[0];
        int indexOfMax = 0;
        for (int i = 1; i < myList.length; i++) {
            if (myList[i] > max1) {
                max1 = myList[i];
                indexOfMax = i;
            }
            System.out.println(indexOfMax);
        }
        //Перетасовка элементов массива
        double myList2[] = {1, 1, 1};
        for (int i = 0; i < myList2.length; i++) {
            // Сгенерировать случайный индекс j
            int j = (int)(Math.random() * myList2.length);
            // Переставить myList[i] и myList[j]
            double temp = myList2[i];
            myList2[i] = myList2[j];
            myList2[j] = temp;
            System.out.println(myList2[j] + " ");
        }
        //Сдвиг элементов массива
        double temp = myList2[0]; // Сохраняет первый элемент
            // Сдвинуть элементы влево
        for (int i = 1; i < myList2.length; i++) {
            myList2[i - 1] = myList2[i];
        }
        // Переместить значение первого элемента, чтобы заполнить последнюю позицию
        myList2[myList2.length - 1] = temp;
    }
}
