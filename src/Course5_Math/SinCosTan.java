package Course5_Math;

public class SinCosTan {
    public static void main(String[] args) {
        //Тригометрические методы
        //константы типа double, Math.PI  (число π) и Math.E (число e — основание натуральных логарифмов)
        //Возвращаемым значением для методов asin() и atan() является угол в радианах в диапазоне между — π/2 и π/2,
        // а для метода acos() — между 0 и π. Один градус равен π/180 радианов, 90 градусов равны π/2 радианов, 30 градусов равны π/6 радианов.
        System.out.println("1. " + Math.toDegrees(Math.PI / 2));        //90.0 Преобразует геометрический угол из радианов в градусы.
        System.out.println("2. " + Math.toRadians(35));                 //0.5236 (эквивалентно π/6) Преобразует геометрический угол из градусов в радианы.
        System.out.println("3. " + Math.sin(35));                        //0.0 Возвращает тригонометрический синус угла в радианах.
        System.out.println("4. " + Math.sin(Math.toRadians(30)));      //-1.0
        System.out.println("5. " + Math.sin(Math.PI / 6));              //0.5
        System.out.println("6. " + Math.sin(Math.PI / 2));              //1.0
        System.out.println("7. " + Math.cos(0));                        //1.0 Возвращает тригонометрический косинус угла в радианах.
        System.out.println("8. " + Math.cos(Math.PI / 6));              //0.866
        System.out.println("9. " + Math.cos(Math.PI / 2));              //0
        System.out.println("10. " + Math.asin(0.5));                    //0.523598333 (эквивалентно π/6) Возвращает угол в радианах для арксинуса.
        System.out.println("10. " + Math.toRadians(30));
        System.out.println("11. " + Math.acos(0.5));                    //1.0472 (эквивалентно π/3) Возвращает угол в радианах для арккосинуса.
        System.out.println("12. " + Math.atan(1.0));                    //0.785398 (эквивалентно π/4) Возвращает угол в радианах для арктангенса.
        System.out.println("13. " + Math.tan(0));                       //0.0 Возвращает тригонометрический тангенс угла в радианах.
        System.out.println("10. " + Math.floor(3.6));
    }
}
