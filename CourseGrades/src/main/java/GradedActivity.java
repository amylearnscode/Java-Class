
public class GradedActivity 
{
 
    private double score; 
    public GradedActivity(){
        
    }
  


    public void setScore(double s)
    {
        score = s;
     }


    public double getScore()
     {
        return score;
     }
    public GradedActivity(double score)
	{
		setScore(score);
		
	}

    public char getGrade()
    {        char letterGrade;

        if (score >= 90)
           letterGrade = 'A';
        else if (score >= 80)
           letterGrade = 'B';
       else if (score >= 70)
          letterGrade = 'C';
       else if (score >= 60)
          letterGrade = 'D';
       else
          letterGrade = 'F';

       return letterGrade;
     }
  }
    

