public class Grade {
    public void grade(double num)
    {
        int n=(int)num/10;
        switch(n)
        {
           case 10:
           case 9:
           case 8:
           System.out.println("A+");
           break;
           case 7:System.out.println("A");
           break;
           case 6:System.out.println("A-");
           break;
           case 5:System.out.println("B");
           break;
           case 4:System.out.println("C");
           break;
           default:System.out.println("F");
           break;
           
        }
    }


    public static void main(String[] args)
    {
        Grade g=new Grade();
        g.grade(90);
        g.grade(70);
        g.grade(60);
        g.grade(50);
        g.grade(40);
        g.grade(30);
    }
}
