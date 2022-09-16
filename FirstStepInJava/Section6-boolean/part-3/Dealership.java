import java.util.Scanner;

public class Dealership {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the Java Dealership !");
        System.out.println("- Select option 'a' to buy a car ");
        System.out.println("- Select option 'b' to sell a car \n");

        String option = scan .nextLine();

        switch (option) {
            case "a":
                System.out.println("What is your budget ?");
                int budget = scan.nextInt();
                if(budget >=10000){
                    System.out.println("Great ! A Nissan Altima is available");
                    System.out.println("\n Do you have insurrance ? (yes/no)");
                    scan.nextLine();
                    String insurance = scan.nextLine();
                    System.out.println("\nDo you have a license ? (yes/no)");
                    String license = scan.nextLine();
                    System.out.println("\nWhat is your credit score ?");
                    int creditScore = scan.nextInt();
                    if(insurance.equals("yes") && license.equals("yes") && creditScore >= 660){
                        System.out.println("Sold ! Pleasure doing business with you !");
                    } else {
                        System.out.println("We're sorry, you're not eligible !");
                    }

                } else {
                    System.out.println("Sorry we don't sell car under $10,000 !");
                }
                break;
            case "b":
                System.out.println("\nWhat is your car value at ?");
                int value = scan.nextInt();
                System.out.println("\nWhat is your selling price ?");
                int price = scan.nextInt();

                if(value > price && price < 30000){
                    System.out.println("\nWe will buy your car if you don't lie about value of it");
                }else {
                    System.out.println("\nSorry we can't buy your car ! We're not interested !");
                }

                break;
        
            default: System.out.println("Invalid options !");
                break;
        }

        scan.close();

    }
}
