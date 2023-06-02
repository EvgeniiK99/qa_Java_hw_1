import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner sc = new Scanner(System.in);

        byte byteValue = 127; // Хранит число от -128 до 127, занимает 1 байт памяти
        short shortValue = 32767; // Хранит число от -32768 до 32767, занимает 2 байта памяти
        int intValue = 2147483647; // Хранит число от -2147483648 до 2147483647, занимает 4 байта памяти
        long longValue = 9223372036854775807L; // Хранит целое число от –9 223 372 036 854 775 808 до 9 223 372 036 854 775 807 и занимает 8 байт памяти

        float floatValue = 2.5F; // Хранит число с плавающей точкой от -3.4E+38 до 3.4E+38
        double doubleValue = 2.15; // Хранит число с плавающей точкой от -1.7E+308 до 1.7E+308

        char charValue = 'a'; //Хранит одиночный символ и занимает 2 байта памяти
        String stringValue = "Hello!"; // Строковые переменные, не представляют собой примитивы и хранят в себе целые строки

        System.out.println(++intValue); // Переполнение int
        System.out.println(intValue + intValue);

        System.out.println(byteValue * 5.55);
        System.out.println(doubleValue / 2.14);

        System.out.println("Введите оператор:");
        String operator = sc.nextLine();
        System.out.println("Введите число a:");
        int vulueA = sc.nextInt();
        System.out.println("Введите число b:");
        int vulueB = sc.nextInt();

        switch (operator) {
            case ("+"):
                System.out.println("Резульат: " + calc.sum(vulueA, vulueB));
                break;
            case ("-"):
                System.out.println("Резульат: " + calc.sub(vulueA, vulueB));
                break;
            case ("*"):
                System.out.println("Резульат: " + calc.multiplication(vulueA, vulueB));
                break;
            case ("/"):
                System.out.println("Резульат: " + calc.divide(vulueA, vulueB));
                break;
            default:
                System.out.println("Что-то пошло не так");
        }
    }
}