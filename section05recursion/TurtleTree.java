package org.teachingkidsprogramming.section05recursion;

import java.awt.Color;
import java.util.HashMap;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;

public class TurtleTree
{
  @SuppressWarnings("unused")
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    //    Turn the background black  --#21
    int branch = 60;
    drawBranch(branch);
  }
  private static void drawBranch(int branch)
  {
    if (branch > 0)
    {
      //        adjustColor (recipe below)--#15.1
      //        ------------- Recipe for adjustColor --#15.2
      HashMap<Integer, Color> colors = new HashMap<Integer, Color>();
      //            A 10 pixel long branch is lime --#20
      //            A 20 pixel long branch is forest green --#19
      //            A 30 pixel long branch is dark green --#18
      //            A 40 pixel long branch is olive --#17
      //            A 50 pixel long branch is sienna --#14
      colors.put(50, PenColors.Browns.Sienna);
      colors.put(60, PenColors.Browns.SaddleBrown);
      //            Get the value of the branch length from the 'colors' HashMap and use that to set the pen color --#21
      //        ------------- End of adjustColor --#15.3
      //
      Tortoise.move(branch);
      drawLowerBranches(branch);
    }
  }
  private static void drawLowerBranches(int branch)
  {
    Tortoise.turn(30);
    drawShorterBranch(branch);
    Tortoise.turn(-60);
    drawShorterBranch(branch);
    Tortoise.turn(30);
    //            adjustColor --#16
    Tortoise.move(-branch);
  }
  private static void drawShorterBranch(int branch)
  {
    drawBranch(branch - 10);
  }
}