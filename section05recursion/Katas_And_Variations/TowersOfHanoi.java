package org.teachingkidsprogramming.section05recursion.Katas_And_Variations;

public class TowersOfHanoi
{
  //fields
  public static void main(String[] args)
  {
    // create some constant variables (final means they can't change after initialization)
    final int NUM_DISCS = 3; // number of discs to move
    final int FROM_PEG = 1; // initial 'from' peg
    final int TO_PEG = 3; // initial 'to' peg
    final int TEMP_PEG = 2; // initial 'temp' peg
    // Play game
  }
  private static void moveDiscs(int num, int fromPeg, int toPeg, int tempPeg)
  {
    if (num > 0)
    {
      moveDiscs(num - 1, fromPeg, tempPeg, toPeg);
      index++;
      System.out.println(index + ". Move a disc from peg " + fromPeg + " to peg " + toPeg);
      moveDiscs(num - 1, tempPeg, to Peg, fromPeg);
    }



}