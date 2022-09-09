public class BooleanComparison {
    public static void main(String[] args) {
        int chemistryGrade = 95;
        int biologyGrade = 75;
        int englishGrade = 75;
       
        System.out.println(englishGrade > biologyGrade);
        System.out.println(englishGrade >= biologyGrade);
        System.out.println(englishGrade == biologyGrade);
        System.out.println(englishGrade != biologyGrade);
        System.out.println(englishGrade != chemistryGrade);

// Never use == or  != for string but use equals or !equals

    String sentence = "I love this course!";
    String sentence2 = "I love this course!";

    System.out.println(sentence.equals(sentence2));
    System.out.println(!sentence.equals(sentence2));

    }

}
