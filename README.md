# Listing_4_16_Project_1412 


We are working on Listing 4.16.

## Introduction:

We want to write a prgram that displays a random uppercase letter using the Math.random() method.

## Outline

1. Set up a new Java project called Listing_4_16_Project_1412.
2. Set up a git repository, and go to the test branch.
3. Play around with some code using methods to get something that works.
``` java
	// Call a method to generate a random number in the range of a character.
	// Make the number into a char
	// Print the number
```
4. Merge working code into the Dev branch.
5. Tidy up the README.md file

## Java Code

``` java
public class HW_8_Markdown {
	public static void main(String[] args) {
		// Call a method to generate a random number in the range of a character.
        int randomUpperCaseLetterNumber = makeRandomUpperLetter();

        // Note that (char) in front of our variable recasts it as 
        System.out.println("The random upper case letter is: " + (char)randomUpperCaseLetterNumber);
    }
    public static int makeRandomUpperLetter(){
        // Range of Character values, page 125, table 4.4
        //Characters ('A' to 'Z'), Code Value in Decimal (65 to 90)

        // How to use a random number Page 122, bottom of the page, 4.2.5 The random Method
        // Also use the example on page 87.

        int lowerLimit = 65;
        int upperLimit = 90;
        int Range = upperLimit-lowerLimit + 1;
        int randomUpperCaseLetterNumber = lowerLimit + (int)(Math.random()*Range);
        System.out.println(randomUpperCaseLetterNumber);
        return randomUpperCaseLetterNumber;
    }
}
```

## Console Output

I teste several cases to verify that my random number range would cover the range of all possible upper case letters.
