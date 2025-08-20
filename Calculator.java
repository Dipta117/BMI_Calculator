public class Calculator
{
    public double addition(double a , double b)
    {
        return a+b;
    }
    public double subtraction(double a , double b)
    {
        return a-b;
    }
    public double multiplication(double a , double b)
    {
        return a*b;
    }
    public double division(double a , double b)
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
    System.out.println(calc.addition(2,3));
    System.out.println(calc.subtraction(2,3));
    System.out.println(calc.multiplication(2,3));
    System.out.println(calc.dividision(2,3));

}
}