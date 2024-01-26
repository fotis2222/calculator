import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("(1) calculator\n(2) converter\nconversions coming soon...");
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
        } else if (mode == 2) {
            System.out.println("(1) kg to lbs\n(2) lbs to kgs");
            int conversion = sc.nextInt();
            if (conversion == 1) {
                System.out.println("kg:");
                double kg = sc.nextDouble();
                System.out.println((kg * 2.2) + " lbs");
                sc.nextLine();
                exit();
            } else if (conversion == 2) {
                System.out.println("lbs:");
                double lbs = sc.nextDouble();
                System.out.println((lbs / 2.2) + " kg");
                sc.nextLine();
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