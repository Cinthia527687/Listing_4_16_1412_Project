# Listing_4_16_Project_1412 


We are working on Listing 4.16

## Introduction:

We want to write a program that displays a random uppercase letter using the Math.random() method.

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

I tested several cases to verify that my random number range would cover the range of all possible upper case letters.

```
82
The random upper case letter of the day is: R

85
The random upper case letter is: U

77
The random upper case letter is: M

79
The random upper case letter is: O

```
## Command Prompt History

###### Navigate to the project file in your workspace.


```
10/19/2015  10:18 AM    <DIR>          COMSC,1033,Project,2
10/30/2015  10:19 AM    <DIR>          In Class
11/02/2015  10:28 AM    <DIR>          Listing_4_16_Project_1412
               0 File(s)              0 bytes
              13 Dir(s)   7,110,557,696 bytes free

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
               2 File(s)            633 bytes
               4 Dir(s)   7,110,557,696 bytes free
```

###### I echo a README file.


```
F:\Computer Science I\Section 1412 Workspace\Listing_4_16_Project_1412>echo # Li
sting_4_16_Project_1412 >> README.md

F:\Computer Science I\Section 1412 Workspace\Listing_4_16_Project_1412>git init
Reinitialized existing Git repository in F:/Computer Science I/Section 1412 Work
space/Listing_4_16_Project_1412/.git/

F:\Computer Science I\Section 1412 Workspace\Listing_4_16_Project_1412>git add R
EADME.md
```

###### I recommit a first commit after previous failed attempts.


```
F:\Computer Science I\Section 1412 Workspace\Listing_4_16_Project_1412>git commi
t -m "first commit #2"
[master 8e4d9da] first commit #2
 1 file changed, 1 insertion(+), 15 deletions(-)
 rewrite README.md (92%)

F:\Computer Science I\Section 1412 Workspace\Listing_4_16_Project_1412>git remot
e add origin https://github.com/Cinthia527687/Listing_4_16_Project_1412.git
fatal: remote origin already exists.
```

###### This failed because I forgot to add my changes first.


```
F:\Computer Science I\Section 1412 Workspace\Listing_4_16_Project_1412>git add .


F:\Computer Science I\Section 1412 Workspace\Listing_4_16_Project_1412>git commi
t -m "testing"
[master e70452a] testing
 1 file changed, 2 insertions(+)

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

###### I sign into my github account. This allowed me to set the upstream to track the local repository.


```
Username for 'https://github.com': Cinthia527687
Password for 'https://Cinthia527687@github.com':
Counting objects: 29, done.
Delta compression using up to 2 threads.
Compressing objects: 100% (23/23), done.
Writing objects: 100% (29/29), 3.05 KiB | 0 bytes/s, done.
Total 29 (delta 9), reused 0 (delta 0)
To https://github.com/Cinthia527687/Listing_4_16_Project_1412.git
 * [new branch]      master -> master
```

###### I created a dev branch and push my changes to github.


```
F:\Computer Science I\Section 1412 Workspace\Listing_4_16_Project_1412>git check
out -b "dev"
Switched to a new branch 'dev'

F:\Computer Science I\Section 1412 Workspace\Listing_4_16_Project_1412>git add .


F:\Computer Science I\Section 1412 Workspace\Listing_4_16_Project_1412>git commi
t -m "second commit"
[dev f654cb8] second commit
 3 files changed, 70 insertions(+), 4 deletions(-)
 rewrite bin/HW_8_Markdown.class (77%)

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

fatal: The current branch dev has no upstream branch.
To push the current branch and set the remote as upstream, use

    git push --set-upstream origin dev
```

###### It stopped because I needed to add a dev branch on my remote repository.


```
F:\Computer Science I\Section 1412 Workspace\Listing_4_16_Project_1412>git push
--set-upstream origin dev
Username for 'https://github.com': Cinthia527687
Password for 'https://Cinthia527687@github.com':
Counting objects: 7, done.
Delta compression using up to 2 threads.
Compressing objects: 100% (5/5), done.
Writing objects: 100% (7/7), 1.99 KiB | 0 bytes/s, done.
Total 7 (delta 1), reused 0 (delta 0)
To https://github.com/Cinthia527687/Listing_4_16_Project_1412.git
 * [new branch]      dev -> dev
Branch dev set up to track remote branch dev from origin.
```

###### Now we can push our local dev branch to our remote dev branch.


```
F:\Computer Science I\Section 1412 Workspace\Listing_4_16_Project_1412>git add .


F:\Computer Science I\Section 1412 Workspace\Listing_4_16_Project_1412>git commi
t -m "possible final commit"
[dev 7a5b255] possible final commit
 1 file changed, 19 insertions(+), 1 deletion(-)

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

###### It asked me to verify who I am once again.


```
Username for 'https://github.com': Cinthia527687
Password for 'https://Cinthia527687@github.com':
Counting objects: 3, done.
Delta compression using up to 2 threads.
Compressing objects: 100% (3/3), done.
Writing objects: 100% (3/3), 409 bytes | 0 bytes/s, done.
Total 3 (delta 2), reused 0 (delta 0)
To https://github.com/Cinthia527687/Listing_4_16_Project_1412.git
   f654cb8..7a5b255  dev -> dev
```

###### I merge my dev branch to my master branch on the local repository.


```
F:\Computer Science I\Section 1412 Workspace\Listing_4_16_Project_1412>git check
out master
Switched to branch 'master'
Your branch is up-to-date with 'origin/master'.

F:\Computer Science I\Section 1412 Workspace\Listing_4_16_Project_1412>git merge
 dev
Updating e70452a..7a5b255
Fast-forward
 README.md               |  70 +++++++++++++++++++++++++++++++++++++++++++++++-
 bin/HW_8_Markdown.class | Bin 382 -> 1037 bytes
 src/HW_8_Markdown.java  |  22 ++++++++++++---
 3 files changed, 88 insertions(+), 4 deletions(-)
```

###### Checking my status.


```
F:\Computer Science I\Section 1412 Workspace\Listing_4_16_Project_1412>git statu
s
On branch master
Your branch is ahead of 'origin/master' by 2 commits.
  (use "git push" to publish your local commits)
nothing to commit, working directory clean
```

###### Now we push our local master branch to the remote master branch.


```
F:\Computer Science I\Section 1412 Workspace\Listing_4_16_Project_1412>git push
warning: push.default is unset; its implicit value has changed in
Git 2.0 from 'matching' to 'simple'. To squelch this message
and maintain the traditional behavior, use:

Username for 'https://github.com': Cinthia527687
Password for 'https://Cinthia527687@github.com':
Total 0 (delta 0), reused 0 (delta 0)
To https://github.com/Cinthia527687/Listing_4_16_Project_1412.git
   e70452a..7a5b255  master -> master

F:\Computer Science I\Section 1412 Workspace\Listing_4_16_Project_1412>
```

###### Summary

I struggled a lot to get my repository set up and tracking my local repository.
Since markdown was new it was a bit of a challenge. After I got my repository working it was a lot easier from there.
The countless mess-ups and redos were worth it in my opinion. Now I have a better idea of what to do for the next part of this assignment.
It certainly will help furture assignments easier to do. The only thing that would be challenging is writing the code.
Although, I'm sure I can figur it out.