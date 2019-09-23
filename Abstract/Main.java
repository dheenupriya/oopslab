import java.util.*;
abstract class shape
{
    int a,b;
    abstract public void printarea();
}
class rectangle extends shape
{
    public int area_rect;
    public void printarea()
    {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the length and breadth of rectangle");
        a=s.nextInt();
        b=s.nextInt();
        area_rect=a*b;
        System.out.println("Area of the rectangle"+area_rect);
    }
}
class triangle extends shape
{
    public double area_tri;
    public void printarea()
    {
        Scanner s= new Scanner(System.in);
        System.out.println("ENter the height and base of the triangle");
        a=s.nextInt();
        b=s.nextInt();
        area_tri=((0.5)*(a*b));
        System.out.println("Area of the triangle"+area_tri);
    }
}
public class Main
{
    public static void main(String[] args)
    {
        rectangle r=new rectangle();
        r.printarea();
        triangle t=new triangle();
        t.printarea();
    }
}
