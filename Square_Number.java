import java.util.Scanner;
class Square
{
  public static void main(String args[])
  {
   int n,i,j,r=1;
   Scanner s=new Scanner(System.in);
   n=s.nextInt();
   for(i=0;;i++)
   {
      for(j=0;;j++)
     {
        if((i*i) + (j*j)==n  )
        {
          System.out.println("True");
          r=0;
          break;
         }
        if((j*j)>=n)
           break;    
       }
       if((i*i) + (j*j)>=n )
       break;
    }
    
    if(r==1)
    System.out.println("False");

    }
}