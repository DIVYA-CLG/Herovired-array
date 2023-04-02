import java.util.Scanner;
import java.util.Arrays;
class Program5{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the array size:");
        int n=sc.nextInt();
        int array[]=new int[n];
        int count=0,j=0;
        System.out.println("Enter the array elements:");
        for(int i=0; i<n; i++){
            int temp=sc.nextInt();
            if(temp==1){
                count+=1;
            }
            else{
          array[j]=temp;
          j+=1;
            }
        }
        System.out.println("Array elements after moving ones to end: ");
        for(int i=0; i<count; i++){
            array[j]=1;
            j+=1;
        }
        for(int i=0; i<n; i++){
            System.out.print(array[i]+",");
        }
    }
}