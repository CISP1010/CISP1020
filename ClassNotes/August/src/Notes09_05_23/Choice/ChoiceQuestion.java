package Notes09_05_23.Choice;

import java.util.ArrayList;

/**
   A question with multiple choices.
*/
public class ChoiceQuestion extends Question
{
   private final ArrayList<String> choices;

   /**
      Constructs a choice question with no choices. -- remember need to initialize the arraylist in the constructor
   */
   public ChoiceQuestion()
   {
      choices = new ArrayList<>();
   }

   /**
     * Adds an answer choice to this question.
     * @param choice the choice to add
     * @param correct true if this is the correct choice, false otherwise
   */
   public void addChoice(String choice, boolean correct)
   {
      choices.add(choice);
      if (correct) 
      {
         // Convert choices.size() to string
         String choiceString = "" + choices.size();
         setAnswer(choiceString);
         //need to use setanswer because answer is not available from the question class
         
      }
   }
   public void display()
   {
      // Display the question text - adding the super.display() calls the stuff from the superclass
      // if you want completely different behavior, you can leave this out
      super.display();
      // Display the answer choices
      for (int i = 0; i < choices.size(); i++)
      {
         int choiceNumber = i + 1;
         System.out.println(choiceNumber + ": " + choices.get(i));     
      }
   }
}

