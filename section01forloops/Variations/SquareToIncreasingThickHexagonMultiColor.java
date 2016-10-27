package org.teachingkidsprogramming.section01forloops.Variations;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
import org.teachingextensions.virtualproctor.VirtualProctor;

public class SquareToIncreasingThickHexagonMultiColor
{
  //------Kata Question------
  // How would you make an equilateral hexagon?
  // with 20 pixel thick sides?
  // with multi-colored lines
  // and with lengths of 25 that increase by 2 times??
  // Write out steps in English
  // Then translate the steps into code
  // Make sure to run after each line
  public static void main(String[] args) throws Exception
  {
    VirtualProctor.setClassName("PalmDigital");
    VirtualProctor.setName("Antavius and Andrew");
    Tortoise.show();
    Tortoise.setSpeed(10);
    Tortoise.setPenWidth(20);
    //change number of sides to 6
    int sides = 6;
    for (int i = 0; i < sides; i++)
    {
      // Change the color of the line to MultiColor
      Tortoise.setPenColor(PenColors.getRandomColor());
      // Start side length at 25 pixels
      int length = 25 * 2;
      // every time through the loop double length
      Tortoise.move(length * 2);
      Tortoise.turn(360 / sides);
    }
  }
}