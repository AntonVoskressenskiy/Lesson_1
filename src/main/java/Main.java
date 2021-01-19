public class Main { /* 1. объявление метода main */
    public static void main(String[] args) {
//        2. создание переменных типов
        byte biteType; /* знаковое целое число 8 бит */
        short shortType; /* знаковое целое число 16 бит */
        int intType; /* знаковое целое число 32 бит */
        long longType; /* знаковое целое число 64 бит */
        float floatType; /* 32-х битное знаковое число с плавающей запятой одинарной точности*/
        double doubleType; /* 32-х битное знаковое число с плавающей запятой двойной точности*/
        char charType; /* тип данных, предназначенный для хранения символов в кодировке Unicode */
        boolean booleanType; /* логический тип данных */


    }
//        3. метод вычисляющий выражение a * (b + (c / d))

    public static float calculate() {
        float a = 10.54f;
        float b = 8.35f;
        float c = 2.44f;
        float d = 1.56f;
        return a * (b + (c / d));

    }
    /* 4. метод проверяющий сумму 2-х чисел на принажлежность
    приделу от 10 до 20 включительно и возвращающий логическое значение
     */

    public static boolean task10And20() {
        int a = 10;
        int b = 5;
        int c = a + b;
        boolean d;

        if ((c >= 10) && (c <= 20)) {
            d = true;
        } else {
            d = false;
        }

        return true;
    }

    // 6. метод проверяющий положительное число или отрицательное
    public static void task6() {
        int a = 5;
        if (a >= 0) {
            System.out.println("Число не отрицательное");
        }
        if (a < 0) {
            System.out.println("Число отрицательное");
        }
    }

    // 7. Метод выводящий строку с именем.
    public static void greeting (String name){
        String stringName = "Егор";
                System.out.println("Привет" + stringName);
    }
}
