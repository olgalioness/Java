package Course7_Arrays;

public class TestArray1 {

    public static void main(String[] args) {
        double[] r = new double[10];

        for (int i = 0; i < r.length; i++)
            r[i] = Math.random() * 100;
        System.out.println(r);
    }
}
//Строчка №3: неправильное объявление массива. Должно быть double[]. Перед использованием массива его необходимо создать, например, new double[10].
//Строчка №5: В конце заголовка цикла for необходимо удалить точку с запятой (;).
//Строчка №5: r.length() должно быть r.length.
//Строчка №6: random должно быть random().
//Строчка №6: r(i) должно быть r[i].