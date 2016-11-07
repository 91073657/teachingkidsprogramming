package org.teachingkidsprogramming.section03ifs;

import java.awt.Color;

import org.teachingextensions.approvals.lite.util.ThreadUtils;
import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class ChooseYourOwnAdventure02
{
  public static void main(String[] args)
  {
    startStory();
  }
  private static void startStory()
  {
    tellMoreStory("One night Anthony was walking in the park");
    animateStartStory();
    String action = askAQuestion("Do you want to keep 'walking' or 'leave'?");
    if ("leave".equalsIgnoreCase(action))
    {
      leavePark();
    }
    else if ("walking".equalsIgnoreCase(action))
    {
      explorePark();
    }
    else
    {
      endStory();
    }
  }
  private static void endStory()
  {
    MessageBox.showMessage("You don't know how to read directions. You can't play this game. The end.");
  }
  private static void explorePark()
  {
    MessageBox.showMessage("You keep walking and find a strange note on the ground.");
    String input = askAQuestion("Do you want to 'read' the note or 'throw away'?");
    if ("read".equalsIgnoreCase(input))
    {
      readNote();
    }
    else if ("throw away".equalsIgnoreCase(input))
    {
      throwAwayNote();
    }
    else
    {
      endStory();
    }
  }
  private static void throwAwayNote()
  {
    MessageBox
        .showMessage("You throw the note away into the trash can and finish your walk in the park. The End.");
  }
  private static void readNote()
  {
    MessageBox.showMessage(
        "You read the note and it says I have your dog at the warehouse. Bring $10,000 if you want him back.");
    String input = askAQuestion("Do you want to go to the 'warehouse' or call the 'police'?");
    if ("warehouse".equalsIgnoreCase(input))
    {
      MessageBox.showMessage(
          "You go to the the warehouse and beat up the guy who stole your dog. Then you and your dog go back and you live happliy ever after.");
    }
    else if ("police".equalsIgnoreCase(input))
    {
      MessageBox.showMessage(
          "The police go to the warehouse and arrest the man that stole your dog and give you dog back. You then live happily ever after with your dog.");
    }
    else
    {
      endStory();
    }
  }
  private static void leavePark()
  {
    MessageBox.showMessage("You go back home and go to bed. The End.");
  }
  private static void animateStartStory()
  {
    Tortoise.show();
    Color color = PenColors.Grays.Black;
    for (int i = 0; i < 25; i++)
    {
      Tortoise.getBackgroundWindow().setColor(color);
      color = PenColors.lighten(color);
      ThreadUtils.sleep(100);
    }
  }
  private static void tellMoreStory(String message)
  {
    MessageBox.showMessage(message);
  }
  private static String askAQuestion(String question)
  {
    String answer = MessageBox.askForTextInput(question);
    return answer;
  }
}
