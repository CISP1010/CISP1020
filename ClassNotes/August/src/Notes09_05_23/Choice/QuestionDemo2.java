package Notes09_05_23.Choice;
import java.util.Scanner;

/**
   This program shows a simple quiz with two choice questions.
*/
//the PowerPoint for 9 has helpful UML for this
public class QuestionDemo2
{
   public static void main(String[] args)
   {
      ChoiceQuestion first = new ChoiceQuestion();
      first.setText("What was the original name of the Java language?");
      first.addChoice("*7", false);
      first.addChoice("Duke", false);
      first.addChoice("Oak", true);
      first.addChoice("Gosling", false);

      ChoiceQuestion second = new ChoiceQuestion();
      second.setText("In which country was the inventor of Java born?");
      second.addChoice("Australia", false);
      second.addChoice("Canada", true);
      second.addChoice("Denmark", false);
      second.addChoice("United States", false);

      presentQuestion(first);
      presentQuestion(second);
      
      Question q1 = new Question();
      q1.setText("In which country was the inventor of Java born?");
      q1.setAnswer("Canada");
      presentQuestion(q1);
      
      ChoiceQuestion q2 = new ChoiceQuestion();
      Question q4 = new ChoiceQuestion();
      q2.setText("quest1");
      q2.setAnswer("Answer1");
      
      q4.setText("quest2");
      q4.setAnswer("Answer2");
       System.out.println(q1);
       System.out.println(first);
       System.out.println(q2.equals(q4));
   }

   /**
      Presents a question to the user and checks the response.
      @param q the question  - even though the param is object 'question'
    the method will accept any object of the subclasses of the superclass
   */
   public static void presentQuestion(Question q)
   {
      q.display();
      System.out.print("Your answer: ");
      Scanner in = new Scanner(System.in);
      String response = in.nextLine();
      System.out.println(q.checkAnswer(response));
   }
}

