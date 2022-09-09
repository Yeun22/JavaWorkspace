import java.util.Scanner;

public class Delimiters {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter two integers on the same line");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        System.out.println("Enter two very big integers on the same line");
        long bigNumb1 = scan.nextLong();
        long bigNumb2 = scan.nextLong();

        System.out.println("Enter two decimals  on the same line");
        double decimal1 = scan.nextDouble();
        double decimal2 = scan.nextDouble();
        
        System.out.println("Enter two text values  on the same line");
        String text1 = scan.next();
        String text2 = scan.next();

        scan.close();

        System.out.println("\t Integers : " + num1 + " " + num2);
        System.out.println("\t Big num : " + bigNumb1 + " " + bigNumb2);
        System.out.println("\t Decimals : " + decimal1 + " " + decimal2);
        System.out.println("\t Text : " + text1 + " " + text2);
    }
}
