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

    public void operation(String оperations,int x1, int x2)
    {

        if (оperations == "addition")
        {
            System.out.println(addition(x1,x2));
        }
        if (оperations == "subtraction")
        {
            System.out.println(subtraction(x1,x2));
        }
        if (оperations == "multiplication")
        {
            System.out.println(multiplication(x1,x2));
        }
        if (оperations == "division")
        {
            System.out.println(division(x1,x2));
        }
    }
}
