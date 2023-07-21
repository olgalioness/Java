package week1_OOP_Exception;

import java.io.IOException;

public class Sample4 {
    public static void main(String[] args) {                        //throws IOException рутова точка вызова
        try {
            int result = devision(55, 0);
            System.out.println(result);
        } catch (Exception ex) {                                         //ловим все верхнеуровневые эксепшены  Exception  и все  унаследованные эксепшены
            //ex, exceprion название переменной в бблоке кода catch
            //System.out.println(ex.getMessage());                      //у каждого есть метод getmessage унаслодованный от throwable, возвращается string
            System.err.println(ex.getMessage());                        //return сообщение пробросили ниже
            //out - буфер накапивает сообщения. error вывел в поток ошибок
        }
    }

    public static int devision(int a, int b) throws IOException {                           //пробросить исключение выше
        if (b == 0) {
            throw new IOException("Нельзя делить на 0");              //пробросить в методе или выше или кинуть отдельно и обернуть
        }
        return a / b;
    }
}
//лучше не ловить все эксепшины. ниже может возниктут эксепшин с выводом лога. а на данный эксепшем мы можем поставить заглушку и не вывести лог
//Чект Инпут аут эксепшен - красит unhandled -
//если кинуть в методе покрасит и подчеркнет что unhandled эксепшен не обработанный
//add exception to metod signature
//обработка исключений в вызывающем методе. метод, который инициалирует исключение
//выбросить выше обернуть в один эксепшинен или запаковать.
//Не рекомендуется все обертывать в верхнеуровеные ексепциош. Т.к. возможность поставить заглушку и не поймать исключение которое необходимо выбросить в лог.


