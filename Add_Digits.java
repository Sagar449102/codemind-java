import java.util.*;
class A
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int d,k,r;
        while(true)
        { 
        d=(int)Math.log10(n)+1;
   
        if(d==1)
        {
            System.out.println(n);
            break;
        }
        if(d>1)
        {
            r=0;
            while(n!=0)
            {
                k=n%10;
                r=r+k;
                n=n/10;
            }
            n=r;
        }
        
        
        }
    }
}