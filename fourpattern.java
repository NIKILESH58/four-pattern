import java.util.Scanner;
public class fourpattern
{
    public static void main(String[] args) 

    {
        Scanner sc = new Scanner(System.in);      
        int n = sc.nextInt();  
        int a=1;
         for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
             a=a*4;
            System.out.print(a+" ");
            }
            System.out.println();
            a=1;
        }
    }
}