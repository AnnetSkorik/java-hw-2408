import java.util.Scanner;

public class homework2408 {
    public static void main(String[] args) {
        String str = "I study Basic Java!";
        System.out.println(str);
        System.out.println(str.charAt(17));
        System.out.println(str.contains("Java"));
        System.out.println(str.substring(14,18));

        str = str.replace('a','o');
        System.out.println(str);

        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
//__________
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Введите целое число: ");
        int myInt1 = myScanner.nextInt();
        System.out.println("Введите целое число: ");
        int myInt2 = myScanner.nextInt();

        System.out.println(myInt1*myInt2);
        System.out.println(myInt1/myInt2);
        System.out.println(myInt1+myInt2);
        System.out.println(myInt1-myInt2);
    }
}

//        № 1
//        Создайте строку через new - I study Basic Java!
//        Распечатать пред-последний символ строки. Используем метод String.charAt().
//        Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
//        Вырезать строку Java c помощью метода String.substring().
//        Заменить все символы “а” на “о”.
//        Преобразуйте строку к верхнему регистру.
//        Преобразуйте строку к нижнему регистру.
//
//        № 2
//        Создайте программу, в которой нужно ввести 2 параметра,
//        сделайте  операции с математическими операциями +, -, *, /
//        Результат распечатайте в консоль
