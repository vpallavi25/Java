
import java.util.*;

public class Admit {
	
	public static void main(String[] args) {
		 Scanner kb = new Scanner(System.in);
	     start(kb); 
	}

	public static void start(Scanner kb){
		description();
		double fin1,fin2;
		//You must ask the user how many times he/she wants to use the app
		System.out.print("How many times you want to use the software?");
	      int n=kb.nextInt();
	      for(int i=1;i<=n;i++)
	      {
	    	  description();
	    	  System.out.println("Information for applicant #1:");
	    	  System.out.print("do you have 1) SAT scores or 2) ACT scores?");
	    	  int num=kb.nextInt();
	    	  if(num==1){
	    	  	    	  
	    		double satscore1=AskSAT(kb);
	    		double gpascore1=AskGPA(kb);
	    		
	    		fin1=satscore1+gpascore1;
	    		 
	    	  }
	    	  else{
	    		double actscore1=AskACT(kb);
	    		double gpascore11=AskGPA(kb);
	    		fin1=actscore1+gpascore11;
	    	}
	    	  System.out.println();
	    	  System.out.println("Information for applicant #2:");
	    	  System.out.print("do you have 1) SAT scores or 2) ACT scores?"); 
	    	  int number=kb.nextInt();
	    	
	    	  if(number==1){
	    		  double satscore2=AskSAT(kb);
	    		  double gpascore2=AskGPA(kb);
	    		  fin2=satscore2+gpascore2;
	    	  }
	    	  else{
	    		  double actscore2=AskACT(kb);
	    		double gpascore22=AskGPA(kb);
	    		fin2=actscore2+gpascore22;
	    	  }
	    	 output(fin1,fin2);
	    }    
	    
	} 
	
	public static void description(){
		System.out.println("This program compares two applicants to");
		System.out.println("determine which one seems like the stronger");
		System.out.println("applicant. For each candidate I will need");
		System.out.println("either SAT or ACT scores plus a weighted GPA.");
	}	
	
	public static double AskSAT(Scanner kb){
	  System.out.print("SAT math?");
  	  int m=kb.nextInt();
  	  System.out.print("SAT critical reading?");
  	  int r=kb.nextInt();
  	  System.out.print("SAT writing?");
  	  int w=kb.nextInt();	
  	  double satscore= SATScore(m,r,w);
  	  System.out.println("exam score=" + String.format("%.2f", satscore));
  	 	return satscore;
	}
	
	public static double AskACT(Scanner kb){

	  System.out.print("ACT English?");
  	  int e=kb.nextInt();
  	  System.out.print("ACT math?");
  	  int m=kb.nextInt();
  	  System.out.print("ACT reading?");
  	  int r=kb.nextInt();	
  	  System.out.print("ACT science?");
  	  int s=kb.nextInt();
  	  
  	  double actscore = ACTScore(e,m,r,s);
  	  System.out.println("exam score="+String.format("%.2f", actscore));
  	   return actscore;
	}
	
	public static double AskGPA(Scanner kb){
  	  
  	  System.out.print("Overall GPA?");
  	  double gpa=kb.nextDouble();
  	  System.out.print("max GPA?");
  	  double mgpa=kb.nextDouble();
  	  System.out.print("Transcript Multiplier?");
  	  double tran=kb.nextDouble();
  	  
  	  double gpascore= GPAScore(gpa,mgpa,tran);
  	  System.out.println("GPA score="+ String.format("%.2f",gpascore)); 
  	  return gpascore;
	}
	
	public static double SATScore(int m, int r, int w){
		double score =((2*m)+ r+ w)/32;
		return score;
	} 
	
	public static double ACTScore(int e, int m,int r,int s){
		double ascore =(e+2*m+r+s)/1.8;
		return ascore;
	}
	public static double GPAScore(double gpa, double mgpa, double tran){
		double gscore= (gpa/mgpa)* 100* tran;
		return gscore;
	}
	
	public static void output(double applicant1, double applicant2){

		System.out.println();
		
		System.out.println("First applicant overall score="+String.format("%.2f",applicant1));
		System.out.println("second applicant overall score="+String.format("%.2f",applicant2));
		if(applicant1>applicant2){
			  System.out.println("The first applicant seems to be better");
		}else if(applicant1<applicant2){
			  System.out.println("The second applicant seems to be better");
		}else{
			 System.out.println("The two applicants seem to be equal");
		}
		System.out.println();
	}
	
}
