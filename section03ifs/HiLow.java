package org.teachingkidsprogramming.section03ifs;

import org.teachingextensions.approvals.lite.util.NumberUtils;
import org.teachingextensions.logo.Sound;
import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class HiLow
{
  public static void main(String[] args)
  {
    int Answer = NumberUtils.getRandomInt(1, 100);
    for (int i = 0; i < 8; i++)
    {
      int guess = MessageBox.askForNumericalInput("What is your guess?");
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
