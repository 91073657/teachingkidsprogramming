package org.teachingkidsprogramming.section02methods.KataAndVariations;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
//-------------------Kata Question---------------------//

//Be aware: this is an example of too much refactoring
public class PyramidsOfGizaRemoveEvenMoreDuplication04
{
  public static void main(String[] args) throws Exception
  {
    setUpPyramidLand();
    //bad refactoring
    int[][] degreesAndLength = {{-90, 220},
                                {135, 100},
                                {90, 100},
                                {-90, 100},
                                {90, 100},
                                {-90, 100},
                                {90, 100},
                                {135, 210}};
    for (int[] i : degreesAndLength)
    {
      Tortoise.turn(i[0]);
      Tortoise.move(i[1]);
    }
    //    turnAndMove(-90, 220);
    //    turnAndMove(135, 100);
    //    moveDown();
    //    moveUp(); // -90 and 100
    //    moveDown(); // 90 and 100
    //    moveUp();
    //    moveDown();
    //    turnAndMove(135, 210);
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
