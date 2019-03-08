
// Alysia Wong
// 3-4-19

import java.util.Scanner;
import java.util.Random;

public class SlotMachineSimulation
{
   public static void main(String[]args)
   {
      Scanner kb = new Scanner(System.in);
      String playAgain = "";
      float totalBet = 0;
      float totalWon = 0;

      System.out.println("Welcome to the Slot Machine Simulation.");
      for (int dollarSign = 0 ; dollarSign < 39 ; dollarSign++)
         System.out.print("$");
      System.out.println();

      do
      {
         System.out.print("\nEnter the amount you would like to bet: $");
         float amountBet = kb.nextFloat();
         totalBet += amountBet;
         String blank = kb.nextLine();
         float amountWon;
         System.out.println();

         Random randomWord = new Random();
         final int word1 = randomWord.nextInt(6);
         final int word2 = randomWord.nextInt(6);
         final int word3 = randomWord.nextInt(6);
         String str1 = "" , str2 = "", str3 = "";
         switch (word1)
         {
            case 0:
               str1 = "Cherries";
               break;
            case 1:
               str1 = "Oranges";
               break;
            case 2:
               str1 = "Plums";
               break;
            case 3:
               str1 = "Bells";
               break;
            case 4:
               str1 = "Melons";
               break;
            case 5:
               str1 = "Bars";
               break;
         }
         switch (word2)
         {
            case 0:
               str2 = "Cherries";
               break;
            case 1:
               str2 = "Oranges";
               break;
            case 2:
               str2 = "Plums";
               break;
            case 3:
               str2 = "Bells";
               break;
            case 4:
               str2 = "Melons";
               break;
            case 5:
               str2 = "Bars";
               break;
         }
         switch (word3)
         {
            case 0:
               str3 = "Cherries";
               break;
            case 1:
               str3 = "Oranges";
               break;
            case 2:
               str3 = "Plums";
               break;
            case 3:
               str3 = "Bells";
               break;
            case 4:
               str3 = "Melons";
               break;
            case 5:
               str3 = "Bars";
               break;
         }
         System.out.printf("- %s -- %s -- %s -\n\n",str1,str2,str3);
         if (word1 != word2 &&  word1 != word3 &&  word2 != word3)
         {
            System.out.println("Sorry, None match...");
            amountWon = 0;
            System.out.printf("You win $%,.2f\n", amountWon);
         }
         if (word1 == word2 && word1 == word3 && word2 == word3)
         {
            System.out.println("Wow! All three match! \n"
                               +"That triples your bet!");
            amountWon = amountBet * 3;
            totalWon += amountWon;
            System.out.printf("You win $%,.2f\n", amountWon);
         }
         if ((word1 == word2 && word1 != word3)
              || (word1 == word3 && word1 != word2)
              || (word2 == word3 && word2 != word1))
         {
            System.out.println("Great! Two match.\n"
                               +"That doubles your bet!");
            amountWon = amountBet * 2;
            totalWon += amountWon;
            System.out.printf("You win $%,.2f\n",amountWon);
         }
         System.out.println("\nWould you like to play again?");
         System.out.print("Enter Y for yes or N for no: ");
         playAgain = kb.nextLine();
         if (playAgain.equalsIgnoreCase("n"))
         {
            System.out.println();
            System.out.printf("You bet a total of $%,.2f\n", totalBet);
            System.out.printf("You won a total of $%,.2f\n", totalWon);
         }

         while (!playAgain.equalsIgnoreCase("y")
                && !playAgain.equalsIgnoreCase("n"))
         {
            System.out.print("Invalid value, input again: ");
            playAgain = kb.nextLine();

         }
      }
      while (playAgain.equalsIgnoreCase("y"));
   }
}
