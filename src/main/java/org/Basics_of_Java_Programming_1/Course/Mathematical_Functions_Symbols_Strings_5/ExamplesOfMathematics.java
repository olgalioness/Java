package org.Basics_of_Java_Programming_1.Course.Mathematical_Functions_Symbols_Strings_5;

public class ExamplesOfMathematics {
    public static void main(String[] args) {
        System.out.println("1. " + Math.sqrt(4));                       //2.0
        System.out.println("2. " + Math.sin(2 * Math.PI));              //
        System.out.println("3. " + Math.cos(2 * Math.PI));              //1.0
        System.out.println("4. " + Math.pow(2, 2));                     //4.0
        System.out.println("5. " + Math.log(Math.E));                   //1.0
        System.out.println("6. " + Math.exp(1));                        //
        System.out.println("7. " + Math.max(2, Math.min(3, 4)));        //3
        System.out.println("8. " + Math.rint(-2.5));                    //-2.0
        System.out.println("9. " + Math.ceil(-2.5));                    //-2.0
        System.out.println("10. " + Math.floor(-2.5));                  //-3.0
        System.out.println("11. " + Math.round(-2.5f));                 //-2
        System.out.println("12. " + Math.round(-2.5));                  //-2
        System.out.println("13. " + Math.rint(2.5));                    //2.0
        System.out.println("14. " + Math.ceil(2.5));                    //3.0
        System.out.println("15. " + Math.floor(2.5));                   //2.0
        System.out.println("16. " + Math.round(2.5f));                  //3
        System.out.println("17. " + Math.round(2.5));                   //3
        System.out.println("18. " + Math.round(-2.6));                  //-3
        System.out.println("19. " + Math.round(Math.abs(-2.5)));        //3

        double radians = Math.toRadians(47);                            //преобразует 47 градусов в радианы
        System.out.println(radians);

        double degree = Math.toDegrees(Math.PI / 7);                    //преобразует π/7 в угол в градусах
        System.out.println(degree);

        System.out.println(34 + (int)(Math.random() * (55 - 34)));      //генерирует случайное целое число от 34 до 55 (не включая 55)
        System.out.println((int)(Math.random() * 1000));                // генерирует случайное целое число от 0 до 999.
        System.out.println(5.5 + (Math.random() * (55.5 - 5.5)));       // генерирует случайное число от 5.5 до 55.5 (не включая 55.5), не округляет до сотых
    }
}
