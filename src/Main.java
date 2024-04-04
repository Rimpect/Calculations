import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x1;
        int x2;
        int result;
        char symbol;
        Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.println("Выберите операцию");
        System.out.println("1. Выбор системы счисления");
        System.out.println("2. Просто");
        System.out.println("3. Вычисление");
        String input = scanner.nextLine();

        //System.out.println("Введите какую систему счисления вы хотите использовать:");
        //String number_system = scanner.next();
        //System.out.println("Введите какую операцию вы хотите использовать:");

        //System.out.println("Введите info если нужна доп информация по использованию программы:");
        //String information = scanner.next();
        switch (input.toLowerCase()) {
            case "1":
                System.out.println("Выберите систему счисления");
                break;
            case "2":
                System.out.println("Просто существует");
                break;
            case "3":
                System.out.println("Введите целое число x1:");
                x1 = scanner.nextInt();
                System.out.println("Введите какую операцию вы хотите использовать:");
                symbol = scanner.next().charAt(0);
                System.out.println("Введите целое число x2:");
                x2 = scanner.nextInt();
                calc.operation(symbol);
                break;
            default:
                System.out.println("Неизвестное значение");
        }

    }
    //public int conversion_to_the_number_system(int result, String number_system)
    //{
        //if(number_system == "Double")
        //result = Double.doubleToRawLongBits(result);
        //return result;
    //}
    public enum Operations {
        addition, subtraction, multiplication, division
    }
}