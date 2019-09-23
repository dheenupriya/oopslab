class Myclass<T extends Comparable<T>>
{
    T[] val;
    Myclass(T[] o)
    {
        val=o;
    }
    public T min()
    {
        T v= val[0];
        for(int i=1;i<val.length;i++)
        {
            if(val[i].compareTo(v)<0)
            {
                v=val[i];
            }
        }
        return v;
    }
    public T max()
    {
        T v= val[0];
        for(int i=1;i<val.length;i++)
        {
            if(val[i].compareTo(v)>0)
            {
                v=val[i];
            }
        }
        return v;
    }
}
class Main
    {
        public static void main(String[] args)
        {
            int i;
            Integer inum[]={14,2,3,4,20,1};
            Character ch[]={'a','y','l','m','n'};
            Myclass<Integer> in=new Myclass<Integer>(inum);
            Myclass<Character> c= new Myclass<Character>(ch);
            System.out.println(in.max());
            System.out.println(c.min());
        }
    }