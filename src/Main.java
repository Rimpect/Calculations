import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String x1;
        String x2;
        int num1;
        int num2;
        int result;
        char symbol = '+';
        String input;
        String оperations;
        Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator();
        Number_systems num_systems = new Number_systems();
        Сhoosing_an_operation choosing_an_operation = new Сhoosing_an_operation();


        System.out.println("Выберите систему счисления для первого числа ");
        num_systems.change_system();
        input = scanner.nextLine();
        System.out.println("Введите первое число");
        x1 = scanner.nextLine();
        num1 = num_systems.numbers(x1, input);
        System.out.println("Выберите систему счисления для второго числа");
        num_systems.change_system();
        System.out.println("Введите второе число");
        input = scanner.nextLine();
        x2 = scanner.nextLine();
        num2 = num_systems.numbers(x2, input);
        System.out.println("Выберите операцию");
        symbol = scanner.next().charAt(0);
        оperations = choosing_an_operation.choice(symbol);
        calc.operation(оperations,num1,num2);





    }


}