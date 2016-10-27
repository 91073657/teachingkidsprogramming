package org.teachingkidsprogramming.section02methods.KataAndVariations;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
//------------FourSquare Kata---------------//

//  Use the Tortoise to draw four squares, each with a width and height of 50 pixels
// Write out the steps in English
// Then translate the steps into code
// Make sure to run after each line
public class CompleteFourSquare
{
  public static void main(String[] args)
  {
    System.out.println("be sure to complete the main method to start");
    //TODO: write comments and then code here
    // Show the tortoise #1
    Tortoise.show();
    // Change the pen color of the line to a random color #3
    Tortoise.setPenColor(PenColors.getRandomColor());
    // Move the tortoise as fast as possible # 8
    Tortoise.setSpeed(10);
    // repeat 4 times #6.1
    for (int i = 0; i < 4; i++)
    {
      // Repeat 4 times #5.1
      for (int j = 0; j < 4; j++)
      {
        // Move the tortoise 50 pixels #2
        Tortoise.move(50);
        // Turn the tortoise 90 degrees to the right #4
        Tortoise.turn(90);
        //Repeat #5.2
      }
      // Turn 90 degrees to the right #7
      Tortoise.turn(90);
      //Repeat #6.2
    }
  }
}