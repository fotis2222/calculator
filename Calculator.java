import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("(1) claculator\nconversions coming soon...");
        int mode = sc.nextInt();
        if (mode == 1) {
            System.out.println("operation:\n(1) add\n(2) subtract\n(3) multiply\n(4) divide");
            int oper = sc.nextInt();
            if (oper == 1) {
                System.out.println("first");
                int a = sc.nextInt();
                System.out.println("second");
                int b = sc.nextInt();
                sc.nextLine();
                System.out.println("result: " + (a + b));
                exit();
            } else if (oper == 2) {
                System.out.println("first");
                int a = sc.nextInt();
                System.out.println("second");
                int b = sc.nextInt();
                sc.nextLine();
                System.out.println("result: " + (a - b));
                exit();
            } else if (oper == 3) {
                System.out.println("first");
                int a = sc.nextInt();
                System.out.println("second");
                int b = sc.nextInt();
                sc.nextLine();
                System.out.println("result: " + (a * b));
                exit();
            } else if (oper == 4) {
                System.out.println("first");
                int a = sc.nextInt();
                System.out.println("second");
                int b = sc.nextInt();
                sc.nextLine();
                System.out.println("result: " + (a / b));
                exit();
            } else {
                explain();
            }
        } else {
            explain();
        }
        sc.close();
    }

    static void exit() {
        Scanner sc = new Scanner(System.in);
        System.out.println("press enter to exit");
        sc.nextLine();
        sc.close();
        System.exit(0);
    }

    static void explain() {
        System.out.println("next time enter the number next to the parentheses ok?");
        exit();
    }
}