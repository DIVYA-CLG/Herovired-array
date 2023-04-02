import java.util.*;
class Program4{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();
        int a[]=new int[n];
        int p=0;
        System.out.println("Enter the values of array:");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            int k=0;
            for(int j=2;j<a[i]/2;j++)
            {   
                if(a[i]%j==0)
                {
                    k=1;
                    break;
                }
            }
            if(k==0)
            {
                if(p<a[i])
                {
                    p=a[i];
                }
            }
        }
        if(p==0)
        {
            System.out.println("no prime numbers");
        }
        else
        {
            System.out.println("The Largest Prime number in given array: "+p);
        }
    }
}