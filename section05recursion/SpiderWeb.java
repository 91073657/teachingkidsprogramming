package org.teachingkidsprogramming.section05recursion;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.Turtle.Animals;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;

public class SpiderWeb
{
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    Tortoise.setPenWidth(1);
    Tortoise.setAnimal(Animals.Spider);
    Tortoise.setPenColor(PenColors.Reds.Red);
    Tortoise.getBackgroundWindow().setBackground(PenColors.Grays.Black);
    double line = 10.5;
    double zoom = 1.1;
    for (int i = 0; i < 10; i++)
    {
      line = weaveOneLayer(line, zoom);
      zoom = zoom * 1.3;
    }
  }
  private static double weaveOneLayer(double line, double zoom)
  {
    for (int i = 0; i < 6; i++)
    {
      drawTriangle(line);
      Tortoise.turn(360 / 6);
      line = line + zoom;
    }
    return line;
  }
  private static void drawTriangle(double line)
  {
    //
    for (int i = 0; i < 3; i++)
    {
      Tortoise.move(line);
      Tortoise.turn(360 / 3);
    }
  }
}
