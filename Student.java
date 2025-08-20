public class student
{
     private String name;
     private int roll;



public student(String name, int roll)
{
    this.name=name;
    this.roll=roll;

}

public String getname()
{
    return name;
}
public void setname(String name)
{
    this.name= name;
}

public int getroll()
{
return roll;
}

public void setroll(int roll)
{
    this.roll=roll;
}

public static void main(String[] args)
{
    student std=new student("Rahim",38);
    System.out.println(std.getname());
    System.out.println(std.getroll());

    std.setname("karim");
    std.setroll(49);

      System.out.println(std.getname());
    System.out.println(std.getroll());


}
}