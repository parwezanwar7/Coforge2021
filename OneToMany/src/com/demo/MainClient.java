package com.demo;

import java.util.ArrayList;

import com.demo.pojo.Answer;
import com.demo.pojo.Question;
import com.demo.service.QuizDaoiml;

public class MainClient {

	public static void main(String[] args) {
		QuizDaoiml  quez = new QuizDaoiml();
	      
		 Answer ans1=new Answer();  
		    ans1.setAnswername("Java is a programming language");  
		    ans1.setPostedBy("Ravi Malik");  
		      
		  
		      
		    ArrayList<Answer> list1=new ArrayList<Answer>();  
		    list1.add(ans1);  
	
		      
	
		    Question question1=new Question();  
		    question1.setQname("What is Java?");  
		    question1.setAnswers(list1);
		    
		    quez.createQuestion(question1,ans1);
		      
	 
	
	}

}
