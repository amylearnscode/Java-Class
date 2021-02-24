/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author amy
 */
public class PassFailActivity extends GradedActivity
{
    private double minPassingScore;
    
    public PassFailActivity(double mps)
   {
      minPassingScore = mps;   
   }
    public char getGrade()
    {
       char letterGrade;

       if (super.getScore() >= minPassingScore)
          letterGrade = 'P';
       else
          letterGrade = 'F';

       return letterGrade;
    }
}
