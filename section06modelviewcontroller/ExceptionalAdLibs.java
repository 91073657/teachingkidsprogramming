package org.teachingkidsprogramming.section06modelviewcontroller;

import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class ExceptionalAdLibs
{
  public static void main(String[] args)
  {
    String adverb = askAdverb();
    //MessageBox.showMessage("The adverb is " + adverb);
    String edverb = askAdverb();
    //MessageBox.showMessage("The edVerb is " + edVerb);
    String bodyPart = askBody
  }
  public static String askAdverb()
  {
    String adverb = MessageBox.askForTextInput("What is the adverb");
    if (adverb.isEmpty())
    {
      String bodyPart = MessageBox.askForTextInput("What is the body part?");
      if(bodyPart.isEmpty())
    }
      MessageBox.showMessage("Please enter an edverb");
      edverb = askAdverb();
  }if(bodyPart.matches("[\\d]*")) // that is a regular expression
  {  
     MessageBox.showMessage("No body, no story, pay attention and start over!");
    if ()
  }return adverb;
}
public static String edverb = askAdverb();{
String               edVerb = MessageBox.askForTextInput("What is the -ed verb?");if(adverb.isEmpty())
