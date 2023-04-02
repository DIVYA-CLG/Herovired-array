import java.util.Scanner;
public class Program2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the array size:");
        int n=sc.nextInt();
        int array[]=new int[n];
        System.out.println("Enter the array elements:");
        for(int i=0; i<n; i++){
          array[i]=sc.nextInt();
        }
        System.out.println("The elements in reverse order - ");
        for(int i=n-1; i>=0; i--){
            System.out.print(array[i]+",");
        }
    }
}
