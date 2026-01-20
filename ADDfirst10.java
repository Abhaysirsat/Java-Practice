import java.util.Scanner;

class ADDfirst10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int sum = 0;

        System.out.print("Enter starting number: ");
        int a = sc.nextInt();   

        for (int i = a; i <= 10; i++) {

            sum = sum + i;

        }

        System.out.println("Sum of first 10 numbers = " + sum);

        sc.close();
    }
}
