# Listing_4_16_Project_1412 

This is my Addition Game Markdown

## Introduction:

Lets create a game. The user will be asked a simple math problem in the first round: to add two single digit numbers.
If the user gets this correct, they will be given points and asked a more difficult math problem in round 2, such as adding a pair of two digit numbers.
They will receive more points and be asked more difficult questions in the following round for every correct answer.
Every incorrect answer will be followed by a more simple question. There should be a total of 4 rounds.
At the end of 4 rounds, the code should print the final score. You may need case statements and the random method.

## Java Code

```java
import java.util.Scanner;

public class AdditionGame {
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
```

## Console Output

```
What number is 6 + 5?
11

Your answer was correct.
Your score is now: 10
End of first round.

What number is 91+ 71?
162

Your answer was correct.
Your score is now: 110
End of second round.

What number is 357 + 326?
693

Your answer was incorrect.
The correct answer was: 683
Your difficulty is now: 100
End of third round.

What number is 89 +74?
163

Your answer was correct.
Your score is now: 210
End of fourth round.
Your final score is: 210
```

## Command Prompt History

###### Navigating to my workspace.


```
C:\Users\Cinthia>E:
The device is not ready.

C:\Users\Cinthia>F:

F:\>dir
 Volume in drive F is CINTHIA
 Volume Serial Number is 1C53-480F

 Directory of F:\

08/26/2015  10:16 AM    <DIR>          Computer Science I
09/02/2015  03:56 PM    <DIR>          Computer and Information Access
04/09/2015  07:38 PM    <DIR>          Technology & Society
09/21/2015  12:37 PM    <DIR>          English Comp
11/03/2015  10:58 AM            13,264 Spencer Cole Sanchez.docx
               1 File(s)         13,264 bytes
               4 Dir(s)   7,111,483,392 bytes free

F:\>cd "Computer Science I"

F:\Computer Science I>dir
 Volume in drive F is CINTHIA
 Volume Serial Number is 1C53-480F

 Directory of F:\Computer Science I

09/03/2015  03:55 PM    <DIR>          .
09/03/2015  03:55 PM    <DIR>          ..
08/28/2015  10:17 AM    <DIR>          Section 1412 Workspace
08/31/2015  10:33 AM    <DIR>          Computer Science 1
04/09/2015  07:38 PM    <DIR>          Homework
09/09/2015  09:57 AM    <DIR>          Eclipse
               0 File(s)              0 bytes
               6 Dir(s)   7,111,483,392 bytes free

F:\Computer Science I>cd "Section 1412 Workspace"

F:\Computer Science I\Section 1412 Workspace>dir
 Volume in drive F is CINTHIA
 Volume Serial Number is 1C53-480F

 Directory of F:\Computer Science I\Section 1412 Workspace

09/03/2015  03:55 PM    <DIR>          .
09/03/2015  03:55 PM    <DIR>          ..
08/28/2015  10:26 AM    <DIR>          .metadata
08/28/2015  10:27 AM    <DIR>          HelloWorld
09/09/2015  10:14 AM    <DIR>          Magical
09/10/2015  01:53 PM    <DIR>          RemoteSystemsTempFiles
09/10/2015  02:24 PM    <DIR>          Homework
09/10/2015  03:22 PM    <DIR>          .recommenders
09/23/2015  10:05 AM    <DIR>          GitLocal
10/07/2015  10:10 AM    <DIR>          AdditionGame
10/19/2015  10:18 AM    <DIR>          COMSC,1033,Project,2
10/30/2015  10:19 AM    <DIR>          In Class
11/02/2015  10:28 AM    <DIR>          Listing_4_16_Project_1412
               0 File(s)              0 bytes
              13 Dir(s)   7,111,483,392 bytes free

F:\Computer Science I\Section 1412 Workspace>cd Listing_4_16_Project_1412

F:\Computer Science I\Section 1412 Workspace\Listing_4_16_Project_1412>dir
 Volume in drive F is CINTHIA
 Volume Serial Number is 1C53-480F

 Directory of F:\Computer Science I\Section 1412 Workspace\Listing_4_16_Project_
1412

11/02/2015  10:28 AM    <DIR>          .
11/02/2015  10:28 AM    <DIR>          ..
11/02/2015  10:28 AM               401 .project
11/02/2015  10:28 AM    <DIR>          src
11/02/2015  10:28 AM    <DIR>          bin
11/02/2015  10:28 AM               232 .classpath
11/11/2015  10:20 AM            11,600 Listing_4_16_Project_1412_README.md
11/11/2015  10:53 AM             7,389 Addition_Game_Markdown_README.md
               4 File(s)         19,622 bytes
               4 Dir(s)   7,111,483,392 bytes free
```

###### Linking the local repository and upstream with a new commit.


```
F:\Computer Science I\Section 1412 Workspace\Listing_4_16_Project_1412>git init
Reinitialized existing Git repository in F:/Computer Science I/Section 1412 Work
space/Listing_4_16_Project_1412/.git/

F:\Computer Science I\Section 1412 Workspace\Listing_4_16_Project_1412>git add .


F:\Computer Science I\Section 1412 Workspace\Listing_4_16_Project_1412>git commi
t -m "Added more titles"
[master a09272f] Added more titles
 1 file changed, 7 insertions(+), 1 deletion(-)

F:\Computer Science I\Section 1412 Workspace\Listing_4_16_Project_1412>git push
warning: push.default is unset; its implicit value has changed in
Git 2.0 from 'matching' to 'simple'. To squelch this message
and maintain the traditional behavior, use:

  git config --global push.default matching

To squelch this message and adopt the new behavior now, use:

  git config --global push.default simple

When push.default is set to 'matching', git will push local branches
to the remote branches that already exist with the same name.

Since Git 2.0, Git defaults to the more conservative 'simple'
behavior, which only pushes the current branch to the corresponding
remote branch that 'git pull' uses to update the current branch.

See 'git help config' and search for 'push.default' for further information.
(the 'simple' mode was introduced in Git 1.7.11. Use the similar mode
'current' instead of 'simple' if you sometimes use older versions of Git)
```

###### This is where GitHub asks me to verify my account.


```
Username for 'https://github.com': Cinthia527687
Password for 'https://Cinthia527687@github.com':
Counting objects: 3, done.
Delta compression using up to 2 threads.
Compressing objects: 100% (3/3), done.
Writing objects: 100% (3/3), 341 bytes | 0 bytes/s, done.
Total 3 (delta 2), reused 0 (delta 0)
To https://github.com/Cinthia527687/Listing_4_16_Project_1412.git
   a409481..a09272f  master -> master
```

###### Added the console output in the outline.


```
F:\Computer Science I\Section 1412 Workspace\Listing_4_16_Project_1412>git add .


F:\Computer Science I\Section 1412 Workspace\Listing_4_16_Project_1412>git commi
t -m "added console output"
[master 9a1f7fb] added console output
 1 file changed, 24 insertions(+)

F:\Computer Science I\Section 1412 Workspace\Listing_4_16_Project_1412>git push
warning: push.default is unset; its implicit value has changed in
Git 2.0 from 'matching' to 'simple'. To squelch this message
and maintain the traditional behavior, use:

  git config --global push.default matching

To squelch this message and adopt the new behavior now, use:

  git config --global push.default simple

When push.default is set to 'matching', git will push local branches
to the remote branches that already exist with the same name.

Since Git 2.0, Git defaults to the more conservative 'simple'
behavior, which only pushes the current branch to the corresponding
remote branch that 'git pull' uses to update the current branch.

See 'git help config' and search for 'push.default' for further information.
(the 'simple' mode was introduced in Git 1.7.11. Use the similar mode
'current' instead of 'simple' if you sometimes use older versions of Git)

Username for 'https://github.com': Cinthia527687
Password for 'https://Cinthia527687@github.com':
Counting objects: 3, done.
Delta compression using up to 2 threads.
Compressing objects: 100% (3/3), done.
Writing objects: 100% (3/3), 489 bytes | 0 bytes/s, done.
Total 3 (delta 2), reused 0 (delta 0)
To https://github.com/Cinthia527687/Listing_4_16_Project_1412.git
   1bb6d7e..9a1f7fb  master -> master

F:\Computer Science I\Section 1412 Workspace\Listing_4_16_Project_1412>
```

###### Checked my status then added the Command Prompt and Summary.


```
F:\Computer Science I\Section 1412 Workspace\Listing_4_16_Project_1412>git statu
s
On branch master
Your branch is up-to-date with 'origin/master'.
Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git checkout -- <file>..." to discard changes in working directory)

        modified:   Addition_Game_Markdown_README.md

no changes added to commit (use "git add" and/or "git commit -a")

F:\Computer Science I\Section 1412 Workspace\Listing_4_16_Project_1412>git add .


F:\Computer Science I\Section 1412 Workspace\Listing_4_16_Project_1412>git commi
t -m "Adding command prompt and summary"
[master 943643d] Adding command prompt and summary
 1 file changed, 199 insertions(+)

F:\Computer Science I\Section 1412 Workspace\Listing_4_16_Project_1412>git push
warning: push.default is unset; its implicit value has changed in
Git 2.0 from 'matching' to 'simple'. To squelch this message
and maintain the traditional behavior, use:

  git config --global push.default matching

To squelch this message and adopt the new behavior now, use:

  git config --global push.default simple

When push.default is set to 'matching', git will push local branches
to the remote branches that already exist with the same name.

Since Git 2.0, Git defaults to the more conservative 'simple'
behavior, which only pushes the current branch to the corresponding
remote branch that 'git pull' uses to update the current branch.

See 'git help config' and search for 'push.default' for further information.
(the 'simple' mode was introduced in Git 1.7.11. Use the similar mode
'current' instead of 'simple' if you sometimes use older versions of Git)

Username for 'https://github.com': Cinthia527687
Password for 'https://Cinthia527687@github.com':
Counting objects: 3, done.
Delta compression using up to 2 threads.
Compressing objects: 100% (3/3), done.
Writing objects: 100% (3/3), 2.32 KiB | 0 bytes/s, done.
Total 3 (delta 2), reused 0 (delta 0)
To https://github.com/Cinthia527687/Listing_4_16_Project_1412.git
   9a1f7fb..943643d  master -> master

F:\Computer Science I\Section 1412 Workspace\Listing_4_16_Project_1412>
```

## Summary

This part of the assignment was much more easier since I stayed up the previous night working on some similar steps.
The more I work on this the easier it gets. It becomes repetitive but it is good muscle memory for myself and future git users.