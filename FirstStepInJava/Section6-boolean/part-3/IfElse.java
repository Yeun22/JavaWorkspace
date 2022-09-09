public class IfElse {
    public static void main(String[] args) {
        int grade = 65;
        
        if(grade >= 80){
            System.out.println("You Got an A");
        }
        else if (grade >= 70){
            System.out.println("You Got an b");
        }
        else if (grade >= 60){
            System.out.println("You Got an C");
        }
        else if (grade >= 50){
            System.out.println("You Got an D");
        }
        else if (grade >= 40){
            System.out.println("You Got an E");
        }
        else {
            System.out.println("You are a nooby dude !");
        }
    }
}
