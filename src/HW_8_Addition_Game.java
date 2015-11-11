import java.util.Scanner;

public class HW_8_Addition_Game {
	public static void main(String[] args) {
		//Cinthia's Addition Game
				//Master 1412 branch
				
				//Outline for addition problem.
					int score = 0;
					int hardness = 10;
				
			//Round 1
					
				// Generate 2 Random numbers
					int number1 = (int)(Math.random() * hardness);
					int number2 = (int)(Math.random() * hardness);
					int correctAnswer = number1 + number2;
					
				// Ask the user to add these two numbers together
					System.out.println("What number is " + number1 + " + " + number2 + "?");
					
				// Read in their response
					Scanner input = new Scanner(System.in);
					int studentAnswer = input.nextInt();
					
				// Check if the answer was correct
					if(studentAnswer == correctAnswer){
						
						// IF correct
						
							// Tell them it was correct
								System.out.println("Your answer was correct.");
								
							// Give them points
								score += hardness;
								System.out.println("Your score is now: " + score);
				
							// Make next question harder
								hardness *= 10;
						
					}else{
						// IF incorrect
								
							// Tell them they are incorrect
								System.out.println("Your answer was incorrect.");
								
							// Tell them the correct answer
								System.out.println("The correct answer was: " + correctAnswer);
								
							// Don't give points
								score += 0;
								
								
							// Make next question easier
								if(hardness >= 10){
									
									hardness /= 10;
									System.out.println("Your difficulty is now: " + hardness);	
									
							}else{
										
									System.out.println("Your difficulty is at the lowest level");
									System.out.println("Your difficulty is now: " + hardness);
								}
								
					}
					
					System.out.println("End of first round.");

			//Round 2
					
				// Generate 2 Random numbers
					int number3 = (int)(Math.random() * hardness);
					int number4 = (int)(Math.random() * hardness);
					int correctAnswer2 = number3 + number4;
						
				// Ask the user to add these two numbers together
					System.out.println("What number is " + number3 +  "+ " + number4 + "?");
						
				// Read in their response
					Scanner input2 = new Scanner(System.in);
					int studentAnswer2 = input.nextInt();
						
				// Check if the answer was correct
					if(studentAnswer2 == correctAnswer2){
							
						// IF correct
							
							// Tell them it was correct
								System.out.println("Your answer was correct.");
									
							// Give them points
								score += hardness;
								System.out.println("Your score is now: " + score);
					
							// Make next question harder
								hardness *= 10;
						
					}else{
						// IF incorrect
									
							// Tell them they are incorrect
								System.out.println("Your answer was incorrect.");
									
							// Tell them the correct answer
								System.out.println("The correct answer was: " + correctAnswer2);
									
							// Don't give points
								score += 0;
									
							// Make next question easier
								if(hardness>10){
										
									hardness /= 10;
									System.out.println("Your difficulty is now: " + hardness);
										
								}else{
											
									System.out.println("Your difficulty is at the lowest level");
									System.out.println("Your difficulty is now: " + hardness);
								}
									
					}
						
					System.out.println("End of second round.");
						
			//Round 3
					
				// Generate 2 Random numbers
					int number5 = (int)(Math.random() * hardness);
					int number6 = (int)(Math.random() * hardness);
					int correctAnswer3 = number5 + number6;
							
				// Ask the user to add these two numbers together
					System.out.println("What number is " + number5 + " + " + number6 + "?");
							
				// Read in their response
					Scanner input3 = new Scanner(System.in);
					int studentAnswer3 = input.nextInt();
							
				// Check if the answer was correct
					if(studentAnswer3 == correctAnswer3){
								
						// IF correct
								
							// Tell them it was correct
								System.out.println("Your answer was correct.");
										
							// Give them points
								score += hardness;
								System.out.println("Your score is now: " + score);
						
							// Make next question harder
								hardness *= 10;
						
					}else{		
						// IF incorrect
										
							// Tell them they are incorrect
								System.out.println("Your answer was incorrect.");
										
							// Tell them the correct answer
								System.out.println("The correct answer was: " + correctAnswer3);
										
							// Don't give points
								score += 0;
										
							// Make next question easier
								if(hardness>10){
											
									hardness /= 10;
									System.out.println("Your difficulty is now: " + hardness);
											
								}else{
												
									System.out.println("Your difficulty is at the lowest level");
									System.out.println("Your difficulty is now: " + hardness);
								}
										
					}
							
					System.out.println("End of third round.");
							
			//Round 4
					
				// Generate 2 Random numbers
					int number7 = (int)(Math.random() * hardness);
					int number8 = (int)(Math.random() * hardness);
					int correctAnswer4 = number7 + number8;
							
				// Ask the user to add these two numbers together
					System.out.println("What number is " + number7 + " +"  + number8 + "?");
							
				// Read in their response
					Scanner input4 = new Scanner(System.in);
					int studentAnswer4 = input.nextInt();
							
				// Check if the answer was correct
					if(studentAnswer4 == correctAnswer4){
								
						// IF correct
								
							// Tell them it was correct
								System.out.println("Your answer was correct.");
										
							// Give them points
								score += hardness;
								System.out.println("Your score is now: " + score);
						
							// Make next question harder
								hardness *= 10;
					}else{		
						// IF incorrect
										
							// Tell them they are incorrect
								System.out.println("Your answer was incorrect.");
										
							// Tell them the correct answer
								System.out.println("The correct answer was: " + correctAnswer4);
										
							// Don't give points
								score += 0;
										
							// Make next question easier
								if(hardness>10){
											
									hardness /= 10;
									System.out.println("Your difficulty is now: " + hardness);
											
								}else{
												
									System.out.println("Your difficulty is at the lowest level");
									System.out.println("Your difficulty is now: " + hardness);
								}
										
					}
							
					System.out.println("End of fourth round.");
					System.out.println("Your final score is: " + score);
							

			}

		}
