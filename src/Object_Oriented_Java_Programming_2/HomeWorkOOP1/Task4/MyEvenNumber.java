package HomeWorkOOP1.Task4;

/*
4.	Создать класс MyEvenNumber, который хранит четное число int n. Используя исключения, запретить создание инстанса MyPrimeNumber с нечетным числом.
 */
public class MyEvenNumber {
        private int n;
        public MyEvenNumber(int n) throws Exception{
            if (n % 2 != 0) {
                throw new IllegalArgumentException("Введено нечетное число!");
            } else {
                this.n = n;
            }
        }
        public int getN() {
            return n;
        }
    }