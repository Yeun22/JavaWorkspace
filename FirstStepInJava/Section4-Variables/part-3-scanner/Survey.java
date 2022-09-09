import java.util.Locale;
import java.util.Scanner;

public class Survey {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.ENGLISH);
        int counter = 0;

        System.out.println("Welcome, thank for taking the survey.");
        
        System.out.println("\n Whats your name ?");
        String name = scan.nextLine();
        counter++;
        
        System.out.println("\n How much money do you spend on coffee ?");
        double coffePrice = scan.nextDouble();
        counter++;
        
        System.out.println("\n How much money do you spend on fastfood ?");
        double fastFoodPrice = scan.nextDouble();
        counter++;
        
        System.out.println("\n How many times a week do you buy coffee ??");
        int coffeeAmount = scan.nextInt();
        counter++;
        System.out.println("\n How many times a week do you buy fast-food ??");
        int ffAmount = scan.nextInt();
        counter++;

        scan.close();

        System.out.println("\n Thank you, "+name+" for answering all "+counter+" questions");
        System.out.println("\n Your Fast-food expenses are $"+ (fastFoodPrice*ffAmount)+" dollars !");
        System.out.println("\n Your coffee expenses are $"+ (coffePrice*coffeeAmount)+" dollars !");
    }
}