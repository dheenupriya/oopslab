import java.io.*;
interface stackoperation
{
    public void push(int i);
    public void pop();
}
class Astack implements stackoperation
{
    int stack[]=new int[10];
    int top=-1;
    int i;
    public void push(int item)
    {
        if(top>4)
        {
            System.out.println("Overflow");
        }
        else
        {
            top++;
            stack[top]=item;
            System.out.println("Item pushed"+stack[top]);
        }
    }
    public void pop()
    {
        if(top<0)
        {
            System.out.println("Underflow");
        }
        else
        {
            System.out.println("Item popped"+stack[top]);
            top--;
        }
    }
    public void display()
    {
        if(top<0)
        {
            System.out.println("No element in this stack");
        }
        else
        {
            for(i=0;i<=top;i++)
            {
                System.out.println("Element="+stack[i]);
            }
        }
    }
}
public class Main
{
	public static void main(String[] args)throws IOException
	{
		int ch,c;
		int i;
		Astack s=new Astack();
		DataInputStream in=new DataInputStream(System.in);
		do
		{
		        System.out.println("1.push 2.pop 3.display 4.exit");
		        System.out.println("Enter your choice");
		        ch=Integer.parseInt(in.readLine());
		        switch(ch)
		        {
		            case 1:
		                System.out.println("Enter the element");
		                i=Integer.parseInt(in.readLine());
		                s.push(i);
		                break;
		            case 2:
		                s.pop();
		                break;
		            case 3:
		                s.display();
		                break;
		            case 4:
		                break;
		         }
		 System.out.println("Do you want to continue- 0 to quit and 1 to continue");
		 c=Integer.parseInt(in.readLine());
        }while(c==1);
	}
}
