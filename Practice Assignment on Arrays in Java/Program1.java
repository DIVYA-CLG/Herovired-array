import java.util.Scanner;
import java.util.Arrays;;
class Program1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      System.out.print("Enter the array length:");
      int n=sc.nextInt();
      int array[]=new int[n];
      int total=0;
      System.out.println("Enter the elements");
      for(int i=0; i<n; i++){
        array[i]=sc.nextInt();
        total+=array[i];
      }
      Arrays.sort(array);
      System.out.println("1.The element with the Minimum value: "+array[0]);
      System.out.println("2.The element with the Maximum value: "+array[n-1]);
      System.out.println("3.Average of all array elements: "+total/n);
      System.out.println("4.Total number of array elements: "+n);
    }
}