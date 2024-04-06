public class Calculator {
    public int addition(int x1, int x2)
    {
        return x1+x2;
    }
    public int subtraction(int x1, int x2)
    {
        return  x1-x2;
    }
    public int multiplication(int x1, int x2)
    {
        return  x1*x2;
    }
    public int division(int x1, int x2)
    {
        return x1/ x2;//asf
    }
    public void operation(char symbol)
    {
        if (symbol == '+')
        {
            //result = calc.addition(x1, x2);
            //System.out.println(result);
            System.out.println("Вы выбрали сложение");
        }
        else if (symbol == '-')
        {
            //result = calc.subtraction(x1, x2);
            //System.out.println(result);
            System.out.println("Вы выбрали вычитание");
        }
        else if (symbol == '*')
        {
            //result = calc.multiplication(x1, x2);
            //System.out.println(result);
            System.out.println("Вы выбрали умножение");
        }
        else if (symbol == '/')
        {
            //result = calc.division(x1, x2);
            //System.out.println(result);
            System.out.println("Вы выбрали деление");
        }

        else {
            System.out.println("Неверно введена операция");
        }
    }
}
