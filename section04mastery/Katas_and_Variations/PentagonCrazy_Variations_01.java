package org.teachingkidsprogramming.section04mastery.Katas_and_Variations;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.ColorWheel;
import org.teachingextensions.logo.utils.ColorUtils.PenColors.Blues;
import org.teachingextensions.logo.utils.ColorUtils.PenColors.Greens;
import org.teachingextensions.logo.utils.ColorUtils.PenColors.Reds;

public class PentagonCrazy_Variations_01
{
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    //
    createColorPalette();
    //
    //
    drawPentagon();
  }
  private static void drawPentagon()
  {
    for (int i = 0; i < 250; i++)
    {
      adjustPen();
      Tortoise.move(i);
      Tortoise.turn(350 / 9);
      Tortoise.turn(350 / 2);
    }
  }
  private static void adjustPen()
  {
    Tortoise.setPenColor(ColorWheel.getNextColor());
    Tortoise.setPenWidth(Tortoise.getPenWidth() + 1);
    if (Tortoise.getPenWidth() > 6)
    {
      Tortoise.setPenWidth(1);
    }
  }
  private static void createColorPalette()
  {
    ColorWheel.addColor(Blues.SteelBlue);
    ColorWheel.addColor(Reds.LightSalmon);
    ColorWheel.addColor(Greens.LightGreen);
    ColorWheel.addColor(Blues.Teal);
    ColorWheel.addColor(Reds.OrangeRed);
  }
}
