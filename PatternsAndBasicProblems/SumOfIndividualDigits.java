import java.util.Scanner;

public class SumOfIndividualDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number do you want to sum of individual digits : ");
        int number = sc.nextInt();
        int sum = sumOfDigits(number);
        System.out.println("The Sum of Individual Digits of a Number is : " + sum);
    }

    public static int sumOfDigits(int number) {
        int sum = 0;
        while(number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
