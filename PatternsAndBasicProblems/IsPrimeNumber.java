import java.util.Scanner;

public class IsPrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number do you want check prime Number or not : ");
        int number = sc.nextInt();
        prime(number);
        sc.close();
    }

    public static void prime(int n) {
        int factorialCount = 0;
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                factorialCount++;
            }
        }
        if(factorialCount == 2) 
            System.out.println(n + " is a Prime Number");
        else
            System.out.println(n + " is Not a Prime Number");
    }
}
