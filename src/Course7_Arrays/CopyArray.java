package Course7_Arrays;
/*
Копирование массивов, копир
list2 = list1   //копирует не массив а меняет ссылку одного массива на другой, ранее содержимое в list2 становится мусором
 */

public class CopyArray {
    public static void main(String[] args) {
        int[] sourceArray = {2, 3, 1, 5, 10};
        int[] targetArray = new int[sourceArray.length];                //объявление массива по длине предыдущего
        for (int i = 0; i < sourceArray.length; i++) {
            targetArray[i] = sourceArray[i];                            //копирование каждого элемента массива
            System.out.println("массив sourceArray " + targetArray[i]);
        }

        //второй способ копирования
        int[] targetArray1 = new int[5];
        System.arraycopy(sourceArray, 0, targetArray1, 0, sourceArray.length);          //не выделяет область памяти
        System.out.println(targetArray1[0] + " " + targetArray1[1] + " " +  targetArray1[2] + " " + targetArray1[3] + " " + targetArray1[4]);


    }
}
