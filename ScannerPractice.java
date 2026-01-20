import java.util.Scanner;

class ScannerPractice{

    int Addition(int a, int b) {
        return  a + b;
    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number:");
        int a = sc.nextInt();

        System.out.println("Enter Number");
        int b = sc.nextInt();

        int result = a*b;

        System.out.println("Multiplication:" + result);

        ScannerPractice obj = new ScannerPractice();
        int res = obj.Addition(2,5);

        System.out.println("Addition"+res);

        System.out.println("Addition2"+obj.Addition(7,8) );

        sc.close();

        
        
    };
}