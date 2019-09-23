class Dheenupriya extends Exception
{
    String str1;
    Dheenupriya(String str2)
    {
        str1=str2;
    }
    public String toString()
    {
        return(str1);
    }
}
class Main  
{
    public static void main(String[] args)
    {
        try 
        {
            throw new Dheenupriya("My error");
        }
        catch(Dheenupriya d)
        {
            System.out.println(d);
        }
    }
}
