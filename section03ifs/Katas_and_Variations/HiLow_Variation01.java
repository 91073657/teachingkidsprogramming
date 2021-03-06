package org.teachingkidsprogramming.section03ifs.Katas_and_Variations;

import org.teachingextensions.approvals.lite.util.NumberUtils;
import org.teachingextensions.logo.Sound;
import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class HiLow_Variation01
{
  public static void main(String[] args)
  {
    int Answer = NumberUtils.getRandomInt(1, 100);
    for (int i = 0; i < 8; i++)
    {
      int guess = MessageBox.askForNumericalInput("Guess an integer between 1 and 100");
      if (guess == Answer)
      {
        Sound.playBeep();
        MessageBox.showMessage("You win!");
        System.exit(0);
      }
      else if (guess > Answer)
      {
        MessageBox.showMessage("Too High!");
      }
      else
      {
        MessageBox.showMessage("Too low!");
      }
    }
    MessageBox.showMessage("You Lost!");
  }
}
