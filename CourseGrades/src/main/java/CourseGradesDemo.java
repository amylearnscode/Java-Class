/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author amy
 */
public class  CourseGradesDemo{

    public static void main(String[] args)
	{
		CourseGrades courseGrades = new CourseGrades();
		GradedActivity lab = new GradedActivity(90);
		PassFailExam PassFailExam = new PassFailExam(20, 2, 7);
		GradedActivity essay = new GradedActivity(85);
		FinalExam finalExam = new FinalExam(50,5);
		
		courseGrades.setLab(lab);
		courseGrades.setPassFailExam(PassFailExam);
		courseGrades.setEssay(essay);
		courseGrades.setFinalExam(finalExam);
		System.out.println(courseGrades.toString());
	}
    
}
