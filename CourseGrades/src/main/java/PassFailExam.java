/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author amy
 */
public class PassFailExam extends PassFailActivity
{
  
   private int numQuestions;
   private double pointsEach;
   private int numMissed;
   
  
   public PassFailExam(int questions, int missed, 
                       double minPassing)
   {
      super(minPassing);
      double numericScore;
      numQuestions = questions;
      numMissed = missed;
      pointsEach = 100.0 / questions;
      numericScore = 100.0 - (missed * pointsEach);
      setScore(numericScore);
   }
   public double getPointsEach()
   {
      return pointsEach;
   }
   public int getNumMissed()
   {
      return numMissed;
   }
}
      
    

