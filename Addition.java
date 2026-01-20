import java.util.Scanner;

class Addition {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter 10 numbers:");

        for (int i = 1; i <= 10; i++) {
            System.out.print("Number " + i + ": ");
            sum = sum + sc.nextInt();
        }

        System.out.println("Sum of 10 numbers = " + sum);

        sc.close();
    }
}
