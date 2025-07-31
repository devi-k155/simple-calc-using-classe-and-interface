interface hi
{
   int add(int i, int j);
   int sub(int i,int j);
   int mul(int i ,int j);
}
class a implements hi
{
    public int add(int n1, int n2)
    {
        return n1+n2;

    }
    public int sub(int n1,int n2)
    {
        return n1-n2;

    }
    public int mul(int n1, int n2)
    {
        return n1*n2;

    }
}
public class level
{
    public static void main(String[] args)
     {
        a obj = new a();
        int r1 = obj.add(2,3);
      int  r2 = obj.mul(4,3);
      int  r3 = obj.sub(9,5);
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);

        
    }
}

