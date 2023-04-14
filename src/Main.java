import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        System.out.println(inputNumber());
        task2();
        inputString();

        // 3.Дан следующий код, исправьте его там, где требуется
// (задание 3 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)

        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = {1, 2};
            abc[3] = 9;
        } catch (ArithmeticException ex) {
            System.out.println("На ноль делить нельзя!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }

    //1. Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
// и возвращает введенное значение. Ввод текста вместо числа не должно приводить
// к падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.
    public static float inputNumber() {
        Scanner iScanner = new Scanner(System.in);
        while (true) {
            System.out.println("введите дробное число: ");
            String value = iScanner.next();
            try {
                Float number = Float.valueOf(value);
                return number;
            } catch (NumberFormatException e) {
                System.out.println("вводите как положено " + e.getMessage());
            }
        }
    }

    // 2. Если необходимо, исправьте данный код
// (задание 2 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)
    public static void task2() {
        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }

    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }
    //  4.Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
// Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
    public static void inputString(){
        Scanner iScanner = new Scanner(System.in);
        try{
            System.out.println("введите строку: ");
            String value = iScanner.nextLine();
            if (value == null){
                throw new RuntimeException();
            }
            System.out.println("вы ввели: " + value);
        } catch (RuntimeException e) {
        System.out.println("пустая строка не считается " );
        }
    }
}