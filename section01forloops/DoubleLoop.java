package org.teachingkidsprogramming.section01forloops;

import java.awt.Color;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.ColorWheel;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
import org.teachingextensions.virtualproctor.VirtualProctor;

public class DoubleLoop
{
  private static final Color Pen = null;
  public static void main(String[] args)
  {
    VirtualProctor.setClassName("Palm Digital");
    VirtualProctor.setName("Antavius and Andrew");
    Tortoise.show();
    Tortoise.setX(225);
    Tortoise.setY(150);
    Tortoise.setSpeed(10);
    //  
    ColorWheel.addColor(PenColors.Reds.Crimson);
    ColorWheel.addColor(PenColors.Reds.DarkRed);
    ColorWheel.addColor(PenColors.Reds.FireBrick);
    for (int i = 0; i < 6; i++)
    {
      Tortoise.setPenColor(ColorWheel.getNextColor());
      Tortoise.move(i * 4);
      Tortoise.turn(360 / -6);
      // 
      for (int j = 0; j < 15; j++)
      {
        Tortoise.setPenWidth(17);
        Tortoise.move(i * 8);
        Tortoise.turn(360 / 5);
      }
      //  
      Tortoise.hide();
      Tortoise.getBackgroundWindow().setBackground(PenColors.Yellows.PeachPuff);
    }
    //    Set the tortoise x position to 300 --#15.1
    //    Set the tortoise y position to 200 --#15.2
    for (int i = 0; i < 5; i++)
    {
      //        Change the pen color of the line the tortoise draws to black --#14
      Tortoise.setPenColor(Pen);
      Tortoise.move(25);
      Tortoise.turn(360 / 5);
    }
    //  
  }
}
