package org.teachingkidsprogramming.section01forloops.Variations;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;

public class CompleteSquare
{
  // Use the tortoise to draw a red square with a width and a height of 40 pixels 
  //Write each of the English line comments (use at least 6 line comments)
  //Number each comment line at the end , so your user knows the correct order to translate the code
  //Verify - step one - Translate EACH comment line into Java code
  //Verify - step two - Run your code after each line
  public static void main(String[] args)
  {
    //TODO: write comments and then code here  
    // Show the tortoise --#1
    Tortoise.show();
    // Repeat 4 times--#3.1
    for (int i = 0; i < 4; i++)
    {
      //     Change the pen color to red--#2
      Tortoise.setPenColor(PenColors.Reds.Red);
      //     Move 40 pixels--#4
      Tortoise.move(40);
      //     Turn right 90 degrees--#5
      Tortoise.turn(90);
      // Repeat--#3.2
    }
  }
}