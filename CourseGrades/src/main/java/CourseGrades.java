
public class CourseGrades implements Analyzable {
   private GradedActivity[] grades = new GradedActivity[5];
   
   public CourseGrades()
   {
       
   }

   public void setLab(GradedActivity lab)
   {
       grades[0] = lab;
   }
   public void setPassFailExam(PassFailExam PassFailExam)
   {
       grades[1] = PassFailExam;
   }
   public void setEssay(GradedActivity essay)
   {
       grades[2] = essay;
   }
   public void setFinalExam(FinalExam finalExam)
   {
       grades[3] = finalExam;
   }
   public String toString()
   {
      String str;
      str = "Lab score: " + grades[0].getScore()+
              "\nLab grade: " + grades[0].getGrade() +
              "\nPass/Fail exam: " + grades[1].getScore()+
              "\nGrade: " + grades[1].getGrade()+
              "\nEssay Score: " + grades[2].getScore()+
              "\nGrade: " + grades[2].getGrade()+
              "\nFinal exam: " + grades[3].getScore()+
              "\nGrade: " + grades[3].getGrade()+
              "\nAverage: " + getAverage() +
              "\nHighest grade: " + getHighest().getScore()+
              "\nLowest Grade: " + getLowest().getScore();
      
                    return str;
   }
   public double getAverage(){
        double total=0;
        for(int i=0; i<4; i++){
            total+=grades[i].getScore();
        }
        grades[4] = new GradedActivity(total/4);
        return grades[4].getScore();
    }
    public GradedActivity getHighest(){
        int highest = 0;
        for(int i=0; i<(grades.length-1); i++){
            if(grades[i].getScore() > grades[highest].getScore())
                highest=i;
        }
        return grades[highest];
    }
    public GradedActivity getLowest(){
        int lowest=0;
        for(int i=0; i<(grades.length-1); i++){
            if(grades[i].getScore() < grades[lowest].getScore())
                lowest = i;
        }
        return grades[lowest];
    }
}
