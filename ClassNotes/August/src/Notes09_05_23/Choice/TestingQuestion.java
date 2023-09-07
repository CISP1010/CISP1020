package Notes09_05_23.Choice;
import java.util.Scanner;

public class TestingQuestion{
    public static void main(String[] args) {
        ChoiceQuestion q1 = new ChoiceQuestion();
        q1.setText("What is the capital of France?");
        q1.setAnswer("Paris");
        ChoiceQuestion q2 = new ChoiceQuestion();
        q2.setText("What is the capital of France?");
        q2.setAnswer("Paris");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your Question: ");
        ChoiceQuestion q3 = new ChoiceQuestion();
        String question = in.nextLine();
        System.out.println("Enter your answer: ");
        String answer = in.nextLine();
        q3.setText(question);
        q3.setAnswer(answer);
        System.out.println(q3.equals(q2));
        System.out.println(q1.equals(q2));
        //Rectangle box = new Rectangle(5, 10, 20, 30);
        //System.out.println(q1.equals(box)); -- this will not compile because Rectangle is not a subclass of Question
    }
}
