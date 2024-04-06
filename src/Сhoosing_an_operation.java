public class Сhoosing_an_operation {
    String оperations;
    public String choice(char symbol)
    {
        if (symbol == '+')
        {
            оperations = "addition";
            System.out.println("Вы выбрали сложение");
        }
        else if (symbol == '-')
        {
            оperations = "subtraction";
            System.out.println("Вы выбрали вычитание");
        }
        else if (symbol == '*')
        {
            оperations = "multiplication";
            System.out.println("Вы выбрали умножение");
        }
        else if (symbol == '/')
        {
            оperations = "division";
            System.out.println("Вы выбрали деление");
        }

        else {
            System.out.println("Неверно введена операция");
        }
        return оperations;
    }
}
