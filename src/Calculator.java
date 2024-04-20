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
        return x1/ x2;
    }
    public int operation(String оperations,int x1, int x2,int otvet)
    {

        if (оperations == "addition")
        {
            otvet = addition(x1,x2);
        }
        if (оperations == "subtraction")
        {
            otvet = subtraction(x1,x2);
        }
        if (оperations == "multiplication")
        {
            otvet = multiplication(x1,x2);
        }
        if (оperations == "division")
        {
            otvet = division(x1,x2);
        }
        return otvet;
    }
}
