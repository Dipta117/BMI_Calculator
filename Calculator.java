public class Calculator
{
    public double add(double a , double b)
    {
        return a+b;
    }
    public double subtract(double a , double b)
    {
        return a-b;
    }
    public double multiply(double a , double b)
    {
        return a*b;
    }
    public double divide(double a , double b)
    {
        if(b!=0)
        return a/b;
        else
        {System.out.println("Cannot divide by 0");
        return 0;
        }

    }


public static void main(String[] args)
{
    Calculator calc = new Calculator();
    System.out.println(calc.add(2,3));
    System.out.println(calc.subtract(2,3));
    System.out.println(calc.multiply(2,3));
    System.out.println(calc.divide(2,3));
    
}
}