//programming by Nur Aina Annysa' bt Ahmat, 52213122412
import java.util.Scanner;
public class Test {
    public static void main (String[] args){
        final int UPPER_LETTER = 2;
        final int LOWER_LETTER = 3;
        int upperCount = 0;
        int lowerCount = 0;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter your password");
        String input=in.nextLine();
        int inputLen=input.length();

        for (int i=0; i<inputLen; i++) {
            char ch= input.charAt(i);
            if (Character.isUpperCase(ch))
                upperCount++;
            else if (Character.isLowerCase(ch))
                lowerCount++;
            }
        if (upperCount>= UPPER_LETTER && lowerCount >=LOWER_LETTER)
            System.out.println("Valid password");
        else {
            System.out.println("Invalid password");
            if (upperCount<UPPER_LETTER)
                System.out.println("lowercase letter");
            if (lowerCount<LOWER_LETTER)
                System.out.println("uppercase letter");
            return;
        }
        int numCorrect = 0;
        char loops = 'Y';
        do {
            System.out.println("Answer the questions");

            Scanner scan = new Scanner(System.in);
            System.out.println("what is the definition of pseudocode? ");
            System.out.println("a.Pseudocode is an artificial and informal language that helps programmers develop algorithms");
            System.out.println("b.Pseudocode is an artificial and informal language that helps programmers develop coding");
            System.out.println("c.Pseudocode is an artificial and formal language that helps programmers develop coding");
            System.out.println("d.Pseudocode is an artificial and formal language that helps programmers develop algorithms");

            String response = scan.nextLine();
            if (response.equals("a")) {
                System.out.println("correct\n");
                numCorrect = +2;
            } else {
                System.out.println("incorrect\n");
            }

            System.out.println("what is flowchart? ");
            System.out.println("a.A flowchart is a essay of the separate steps of a process in sequential order.");
            System.out.println("b.A flowchart is a picture of the separate steps of a process in sequential order");
            System.out.println("c.A flowchart is a picture of the separate steps of a process in formal order. ");
            System.out.println("d.A flowchart is a picture of the steps of a process in sequential order.");

            response = scan.nextLine();
            if (response.equals("b")) {
                System.out.println("correct\n");
                numCorrect = +2;
            } else {
                System.out.println("incorrect\n");
            }

            System.out.println("what is the while statement?");
            System.out.println("a. The while statement provides a looping mechanism that executes statements repeatedly for as long as some condition remains true");
            System.out.println("b. The while statement provides a looping mechanism that executes statements repeatedly for as long as some condition remains false");
            System.out.println("c.  The while statement provides a looping mechanism that executes statements  for as long as some condition remains true.");
            System.out.println("d.The while statement provides a looping mechanism that executes statements repeatedly for as long as some condition remains false.");

            response = scan.nextLine();
            if (response.equals("a")) {
                System.out.println("correct\n");
                numCorrect = +2;
            } else {
                System.out.println("incorrect\n");
            }

            System.out.println(" define sequence");
            System.out.println("a. Sequence is the second programming construct.");
            System.out.println("b. Sequence is the third programming construct.");
            System.out.println("c. Sequence is the first programming construct.");
            System.out.println("d. Sequence is the forth programming construct.");

            response = scan.nextLine();
            if (response.equals("c")) {
                System.out.println("correct\n");
                numCorrect = +2;
            } else {
                System.out.println("incorrect\n");
            }

            System.out.println("what is forth basic computer operation?");
            System.out.println("a.  A computer can receive information");
            System.out.println("b.  A computer can put out information");
            System.out.println("c. A computer can perform arithmetic");
            System.out.println("d.  A computer can assign a value to a variable or memory location");

            response = scan.nextLine();
            if (response.equals("d")) {
                System.out.println("correct\n");
                numCorrect = +2;
            } else {
                System.out.println("incorrect\n");

            }
            System.out.println("do you want to repeat the test?");
            loops = in.next().charAt(0);
        }while (loops=='Y');

        int totalQues=5;
        double score = (100.0*numCorrect/totalQues)*15/100;

        System.out.println("Your score" + score + "%");

        System.out.println("Test attempted");
        }
}

