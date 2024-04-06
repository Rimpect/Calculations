
public class Number_systems {

    public void change_system(String input)
    {
        System.out.println("Выбор системы счисления");
        System.out.println("1 Двоичная");
        System.out.println("2 Восьмиричная");
        System.out.println("3 Десятичная");
        System.out.println("4 Шестнацитиричная");

        switch (input)
        {
            case "1":
                System.out.println("Вводите число в двоичной системе счисления");
                //int x1 = Integer.parseInt(str1, 2);
                //int x2 = Integer.parseInt(str2, 2);
                break;
            case "2":
                System.out.println("Вводите число в восьмиричной системе счисления");
                break;
            case "3":
                System.out.println("Вводите число в десятичной системе счисления");
                break;
            case "4":
                System.out.println("Вводите число в шестнацитиричной системе счисления");
                break;
            default:
                System.out.println("Неизвестное значение");
        }


    }
}
