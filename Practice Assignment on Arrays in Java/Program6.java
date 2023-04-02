import java.util.*;

class Program6{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of first array:");
        int n=sc.nextInt();
        int array[]=new int[n];
        System.out.println("Enter the values of fisrt array:");
        for(int i=0;i<n;i++)
        {
            array[i]=sc.nextInt();
        }
        System.out.println("Enter the size of second array:");
        int x=sc.nextInt();
        Set<Integer> s = new HashSet<>();
        System.out.println("Enter the values of second array:");
        for (int i=0;i<x;i++) {
            s.add(sc.nextInt());
        }
        Map<Integer, Integer> m = new HashMap<>();
        for (int num : array) {
            if (s.contains(num)) {
                m.put(num, m.getOrDefault(num, 0) + 1);
            }
        }
        for (int num : s) {
            System.out.println("Frequency of " + num + ": " + m.getOrDefault(num, 0));
        }
    }
}

