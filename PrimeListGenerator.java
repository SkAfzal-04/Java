import java.util.*;
public class PrimeListGenerator{
    int N;
    public int Prime(int num){
        for(int i=2;i<=num/2;i++){
            if (num%i==0)  return 0;
        }
        return 1;
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        PrimeListGenerator ob= new PrimeListGenerator();
        System.out.print("Enter Nth term: ");
        int N=sc.nextInt();
        System.out.println("The Prime Number List : ");
        for (int i=2;i<N;i++){
            if (ob.Prime(i)==1) System.out.print(i+" ");
        }
        sc.close();
    }
}