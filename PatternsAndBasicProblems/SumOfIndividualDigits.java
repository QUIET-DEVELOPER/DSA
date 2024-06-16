import java.util.Scanner;

public class SumOfIndividualDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number do you want to sum of individual digits : ");
        int number = sc.nextInt();
        int sum = 0;
        while(number != 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }
        System.out.println("The Sum of Individual Digits of a Number is : " + sum);
    }
}
