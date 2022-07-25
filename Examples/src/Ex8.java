/*write a java prgram to implement the following scenario:
 * An application is asking for a quiz question where each question answering has three attempts every time the 
 * user is promted with the question as soon as the user types in the answerit is copared against actual answer
 * if the answer is right for the first attempt the user is given the score of 10 scend attempt score of 6 third
 * attempt score of 3 otherwise 0 will be awarded and user is returned with the score 0 and correct answer for the
 * question will also be returned.if the same question is re attempted by the user after 3 attempts throw an 
 * attempt cannot be given. 
 */
import java.util.Scanner;
class attemptEx extends Exception{
	
	public String toString() {
		return "Sorry you have done maximum attempts";
	}
}
class quiz{
	Scanner sc=new Scanner(System.in);
	void quizQue(){
		int count=0,pts=0,track=0;
		System.out.println("Q.1:What is the name of your college");
		try {
			for(;;) {
				String clg=sc.next();
				count++;
				if(clg.equalsIgnoreCase("SDMCET")&&count<=3) {
					if(count==1) {
						track=1;
						pts=10;
						System.out.println("Congrats!! correct answer");
					    
					}
						
					else if(count==2) {
						track=1;
						pts=6;
						System.out.println("Congrats!! correct answer");
					    
					}
						
					else if(count==3){
						track=1;
						pts=3;
						System.out.println("Congrats!! correct answer");
					    
					}
					else {
						for(;;) {
							System.out.println("Sorry wrong answer!!");
							System.out.println("Do you want to reattempt or go to next question?");
							System.out.print("1-Reattempt\n2-Next Question\n");
							int choice=sc.nextInt();
							if(count>=3) {
								throw new attemptEx();
							}
							else if(choice==1&&count<=3) {
								System.out.println("Enter your answer:");
								break;
							}
							else if(choice==2&&count<=3) {
								track=1;
								break;
							}
							else {
								System.out.println("InvalidChoice");
							}
							
						}
						
					}
				}
				if(track==1) {
					count=0;
					System.out.println("In which sem are you studying:");
					for(;;) {
						int sem =sc.nextInt();
						count++;
						if(sem==3&&count<=3) {
							if(count==1) {
								pts=pts+10;
								System.out.println("Congrats!! correct answer");
								break;
							    
							}
								
							else if(count==2) {
								pts=pts+6;
								System.out.println("Congrats!! correct answer");
								break;
							    
							}
								
							else if(count==3){
								pts=pts+3;
								System.out.println("Congrats!! correct answer");
								break;
							    
							}
							else {
								for(;;) {
									System.out.println("Sorry wrong answer!!");
									System.out.println("Do you want to reattempt question?");
									System.out.print("1-Reattempt");
									int choice=sc.nextInt();
									if(count>=3) {
										throw new attemptEx();
									}
									else if(choice==1&&count<=3) {
										System.out.println("Enter your answer:");
										break;
									}
									else if(choice==2&&count<=3) {
										track=1;
										break;
									}
									else {
										System.out.println("InvalidChoice");
									}
									
								}

							}
						}
					}
				}
				System.out.println("Your total score is:"+pts);
				break;
					
			}
		}catch(attemptEx a1) {
			System.out.println(a1.toString());
		}
	}
}
public class Ex8 {

	public static void main(String[] args) {
		quiz q1=new quiz();
		q1.quizQue();

	}

}
