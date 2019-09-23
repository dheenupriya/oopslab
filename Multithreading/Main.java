import java.util.*;
class even implements Runnable
{
    int x;
    public even(int x)
    {
        this.x=x;
    }
    public void run()
    {
        System.out.println("cube of x is "+ (x*x*x));
    }
}
class odd implements Runnable
{
    int x;
    public odd(int x)
    {
        this.x=x;
    }
    public void run()
    {
        System.out.println("Cube of x is"+ (x*x*x));
    }
}
class A extends Thread
{
    public void run()
    {
       
        int num=0;
        try
        {
            for(int i=0;i<5;i++)
            {
                num=i;
                if(num%2==0)
                {
                    Thread t1 = new Thread(new even(num));
                    t1.start();
                }
                else
                {
                    Thread t2= new Thread(new odd(num));
                    t2.start();
                }
                Thread.sleep(2000);
              
            }
      
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}
public class Main{
    public static void main(String[] args)
    {
        A a = new A();
        a.start();
    }
}
