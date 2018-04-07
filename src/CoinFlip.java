//********************************************************************
//  CoinFlip.java       Author: Karim Boyd
//
//  Flips a coin n times and displays the results.
//********************************************************************

import java.util.Scanner;
import java.util.Random;
import java.lang.Math;

public class CoinFlip

{

private static Scanner scan;

public static void main(String[] args)
   {
      scan = new Scanner(System.in);
      Random rand = new Random(); 
      
      //Promt the user
      System.out.println("I will simulate a coin being tossed multiple times.");
      System.out.println("How many times would you like me to flip the coin?");
      int tosses = scan.nextInt();
      scan.nextLine();
      
      //toss the coin the desired amount of times and save results to an array.
      int[] results = new int[tosses];
      
         // Testing array
         //System.out.println(Arrays.toString(results));

      for (int i=0; i < tosses; i++)
      {
         int flip = rand.nextInt(2);
         results[i] = flip;
      }
      
      // Reformat the results into functional information.
      for (int n = 0; n < tosses; n++)
      {
         if (results[n] == 1)
            System.out.print("H ");
         else
            System.out.print ("T ");
      }
      System.out.println();
      //System.out.println(Arrays.toString(results));
      
      
      // Count the amount of heads and tails and calculate the percents of both 
      int heads = 0;
      int tails = 0;
      double total = 0.0;
      
      for (int ind3 = 0; ind3 < tosses; ind3++)
      {
         if (results[ind3] == 1)
            heads++;
         if (results[ind3] == 0)
            tails++;
      }
      System.out.println("There are " + heads + " heads and " + tails + " tails.");
      
      total = heads + tails;
      double percH = (heads/total) * 100;
      double percT = (tails/total) * 100;
      double hp = (double) Math.round(percH * 100.0) / 100.0;
      double tp = (double) Math.round(percT * 100.0) / 100.0;
      //System.out.println(hp + " " + tp);
      System.out.println("Heads appeared " + hp + "% of the time.");
      System.out.println("Tails appeared " + tp + "% of the time.");
   }
}