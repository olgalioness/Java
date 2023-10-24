package week7home.task2;
/*
Реализовать класс “Термометр”.
Необходимо иметь возможность создавать инстанс класса с текущей температурой
и получать значение в фаренгейте и в цельсии.
 */

public class Thermometer {
    private double tempCelsius;
    private double tempFahrenheit;

    public Thermometer(double currentTemp, String tempType) {        //текущая температура, тип температуры в цельсиях или фаренгейт)
        if (tempType.equals("C")) {
            this.tempCelsius = currentTemp;
            this.tempFahrenheit = convertCelsiusToFahrenheit(currentTemp);                        //как верно вводить стрингу
            //                                                        //по ветке else может в стрингу засунут и присвоить фарингейт
        } else if (tempType.equals("F")) {                           //else if проверит точно ли передается фаренгейт
            this.tempFahrenheit = currentTemp;
            this.tempCelsius = convertFahrenheitToCelsius(currentTemp);
        } else {
            System.out.println("ERROR");                            //else не то не тругое то error
            throw new UnsupportedOperationException("Пожалуйста, ввердите корретное значение");         //исключение new создать экземпляр. ловят и отразабывает
        }
    }

    public double getTempCelsius() {        //get получить температуру в цельсии и вернуть температуру в цельсии
        return tempCelsius;
    }

    public double getTempFahrenheit() {
        return tempFahrenheit;
    }

    private double convertCelsiusToFahrenheit(double currentTemp) {
        return currentTemp * 1.8 + 32;
    }
    private double convertFahrenheitToCelsius(double currentTemp) {

        return (currentTemp - 32) / 1.8;
    }
}