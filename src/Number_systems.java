
public class Number_systems {
    int num;
    public void change_system()
    {
        System.out.println("Выбор системы счисления");
        System.out.println("1 Двоичная");
        System.out.println("2 Восьмиричная");
        System.out.println("3 Десятичная");
        System.out.println("4 Шестнацитиричная");
    }
    public int numbers(String x,String input)
    {

        switch (input)
        {
            case "1":
                System.out.println("Вводите число в двоичной системе счисления");
                num = Integer.parseInt(x, 2);
                break;
            case "2":
                System.out.println("Вводите число в восьмиричной системе счисления");
                num = Integer.parseInt(x, 8);
                break;
            case "3":
                System.out.println("Вводите число в десятичной системе счисления");
                num = Integer.parseInt(x, 10);
                break;
            case "4":
                System.out.println("Вводите число в шестнацитиричной системе счисления");
                num = Integer.parseInt(x, 16);
                break;
            default:
                System.out.println("Неизвестное значение");
        }
        return num;
    }
}
