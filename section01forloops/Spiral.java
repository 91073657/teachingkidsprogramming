package org.teachingkidsprogramming.section01forloops;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.ColorWheel;
import org.teachingextensions.logo.utils.ColorUtils.PenColors.Purples;
import org.teachingextensions.logo.utils.EventUtils.MessageBox;
import org.teachingextensions.virtualproctor.VirtualProctor;

public class Spiral
{
  public static void main(String[] args)
  {
    VirtualProctor.setClassName("Palm Digital");
    VirtualProctor.setName("Antavius and Andrew");
    Tortoise.show();
    Tortoise.setSpeed(10);
    ColorWheel.addColor(Purples.BlueViolet);
    ColorWheel.addColor(Purples.Violet);
    ColorWheel.addColor(Purples.Purple);
    for (int i = 0; i < 75; i++)
    {
      try
      {
        Tortoise.setPenColor(ColorWheel.getNextColor());
        Tortoise.move(5 * i);
        Tortoise.turn(360 / 3);
      }
      catch (RuntimeException re)
      {
        MessageBox.showMessage("Hold up: " + re);
      }
    }
  }
}
