import java.util.Scanner;
class NegativeAmntException extends Exception
{
    NegativeAmntException(String msg)
    {
        super(msg);
    }
}
public class Main
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter amount");
        int a= s.nextInt();
        try 
        {
            if(a<0)
            {
                throw new NegativeAmntException("Invalid amount");
            }
            System.out.println("Amount deposited");
        }
        catch(NegativeAmntException e)
        {
            System.out.println(e);
        }
    }
}