package org.Basics_of_Java_Programming_1.Course.Mathematical_Functions_Symbols_Strings_5;

public class CeilFloorRintRound {
    public static void main(String[] args) {
        //округляющие методы
        //ceil(x)   x округляется в большую сторону до ближайшего целого числа.
        //          Это целое число возвращается как значение типа double.
        //floor(x)  x округляется в меньшую сторону до ближайшего целого числа.
        //          Это целое число возвращается как значение типа double.
        //rint(x)   x округляется до ближайшего целого числа.
        //          Если x равноудален от двух целых чисел, то четное из них возвращается как значение типа double.
        //round(x)  Если x типа float, то возвращается (int)Math.floor(x + 0.5).
        //          Если x типа double, то возвращается (long)Math.floor(x + 0.5).
        System.out.println("1. " + Math.ceil(2.1));             //3.0 округляется в большую сторону
        System.out.println("2. " + Math.ceil(2.0));             //2.0
        System.out.println("3. " + Math.ceil(-2.0));            //-2.0
        System.out.println("4. " + Math.ceil(-2.1) );           //-2.0
        System.out.println("5. " + Math.floor(2.1));            //2.0 округляется в меньшую сторону
        System.out.println("6. " + Math.floor(2.0));            //2.0
        System.out.println("7. " + Math.floor(-2.0));           //-2.0
        System.out.println("8. " + Math.floor(-2.1));           //-3.0
        System.out.println("9. " + Math.rint(2.1));             //2.0 округляется до ближайшего целого числа
        System.out.println("10. " + Math.rint(-2.0));           //-2.0
        System.out.println("11. " + Math.rint(-2.1));           //-2.0
        System.out.println("12. " + Math.rint(2.5));            //2.0
        System.out.println("13. " + Math.rint(4.5));            //4.0
        System.out.println("14. " + Math.rint(-2.5));           //-2.0
        System.out.println("15. " + Math.round(2.6f));          //3 Возвращает значение типа int
        System.out.println("16. " + Math.round(2.0));           //2 Возвращает значение типа long
        System.out.println("17. " + Math.round(-2.0f) );        //-2 Возвращает значение типа int
        System.out.println("18. " + Math.round(-2.6));          //-3 Возвращает значение типа long
        System.out.println("19. " + Math.round(-2.4));          //-2 Возвращает значение типа long

    }
}
