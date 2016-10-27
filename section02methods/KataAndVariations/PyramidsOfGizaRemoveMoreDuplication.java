package org.teachingkidsprogramming.section02methods.KataAndVariations;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;

//-------------------Kata Question---------------------//
public class PyramidsOfGizaRemoveMoreDuplication
{
  public static void main(String[] args) throws Exception
  {
    setUpPyramidLand();
    turnAndMove(-90, 220);
    turnAndMove(135, 100);
    moveDown();
    moveUp();
    moveDown();
    moveUp();
    moveDown();
    turnAndMove(135, 210);
  }
  private static void turnAndMove(int degrees, int length)
  {
    Tortoise.turn(degrees);
    Tortoise.move(length);
  }
  private static void moveUp()
  {
    Tortoise.turn(-90);
    Tortoise.move(100);
  }
  private static void moveDown()
  {
    Tortoise.turn(90);
    Tortoise.move(100);
  }
  private static void setUpPyramidLand()
  {
    // move the tortoise down
    // extract a method and nam
    Tortoise.show();
    Tortoise.setSpeed(10);
    Tortoise.getBackgroundWindow().setBackground(PenColors.Blues.AliceBlue);
    Tortoise.setPenColor(PenColors.Yellows.DarkGoldenrod);
    Tortoise.setPenWidth(2);
    Tortoise.hide();
  }
}
