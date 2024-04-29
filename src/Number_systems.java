import java.util.Scanner;

public abstract class Number_systems {
    protected static Scanner scanner = new Scanner(System.in);

    public abstract void change_system();

    public abstract int convertToDecimal(String number, int base);

    public static int numbers(String x, String input) {
        int num = 0;
        boolean isValidInput = false;
        int attempt = 0;
        while (!isValidInput && attempt < 5) {
            try {
                switch (input) {
                    case "1":
                        System.out.println("Вводите число в двоичной системе счисления");
                        num = Integer.parseInt(x, 2);
                        isValidInput = true;
                        break;
                    case "2":
                        System.out.println("Вводите число в восьмеричной системе счисления");
                        num = Integer.parseInt(x, 8);
                        isValidInput = true;
                        break;
                    case "3":
                        System.out.println("Вводите число в десятичной системе счисления");
                        num = Integer.parseInt(x, 10);
                        isValidInput = true;
                        break;
                    case "4":
                        System.out.println("Вводите число в шестнадцатеричной системе счисления");
                        num = Integer.parseInt(x, 16);
                        isValidInput = true;
                        break;
                    default:
                        System.out.println("Неизвестное значение. Пожалуйста, выберите систему счисления (1 - двоичная, 2 - восьмеричная, 3 - десятичная, 4 - шестнадцатеричная):");
                        input = scanner.nextLine();
                        System.out.println("Введите число:");
                        x = scanner.nextLine();
                        continue;
                }
                // Проверка на числа, начинающиеся с "0"
                if (x.startsWith("0") && !input.equals("1")) {
                    System.out.println("Число не должно начинаться с '0' кроме двоичных чисел. Пожалуйста, введите корректное число:");
                    x = scanner.nextLine();
                    attempt++;
                    continue;
                }
            } catch (NumberFormatException e) {
                if (attempt == 4) {
                    System.out.println("Попытки на ввод корректного числа закончились число по умолчанию будет равно 0 введите что либо для продолжения работы");
                    x = scanner.nextLine();
                    attempt++;
                } else {
                    System.out.println("Некорректное число. Пожалуйста, введите число в соответствующей системе счисления:");
                    x = scanner.nextLine();
                    attempt++;
                }
            }
        }
        return num;
    }
}