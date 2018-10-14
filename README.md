# Tut-05

## WHAT WE'RE DOING

- Practicing some simple debugging techniques
- Completing drills

---

## DEBUGGING TECHNIQUES

You are reaching the point where the number of run-time errors (blowing up with Exceptions when run, or not giving you the behaviour you want) outnumbers the number of compile-time errors.

Trying to figure out what's going wrong with these type of errors can be tricky (as you've undoubtedly found out).

Your instructor will give you some tips on what to do when these situations arise.

### What to do when you're facing a stack trace

The code in the **DebuggingExample.java** file is supposed to get a word from the user and then print out the unique vowels in that word (or report there are none).

Take the code from DebuggingExample.java and compile it.

Then run it and see what happens. Stack trace city.

1. When you get an exception, read it - there's useful info in there - often enough to figure out the problem right away, or at least point you in the right direction. What useful info do we see in this particular error?
1. If the error message didn't help, then it's on to the stack trace. Look down the stack trace from the top until you hit the first file that **you've** created. (In this case, we only have one file, but the time's coming where you'll be dealing with multiple files.)
1. In that first line of "yours", you'll find the method and line number where things blew up. That's where you're going to head first.
1. If you go to the line and can't see anything wrong, you might need to use a `trace statement` to help you along. A trace statement is just a println of a variable value, hopefully along with a useful description. They're one of the most basic - but most useful - ways of debugging, especially when you are not using a full-blown editor.
1. If you can't see an issue at the current line, then follow it backward - find either the line before the current one, or if you're in a method that was called by another, go back to the caller and continue working backward.

### What to do when you're just not getting the right stuff

These are the worst ones. No syntax errors. No Exceptions with their useful error messages. Just a program that doesn't do what it's supposed to.

The code in the **DebuggingExample2.java** has fixed the run-time error from the previous section...but it still has issues.

Take the code from DebuggingExample2.java and compile it.

Then run it and see what happens...with the word 'owl', for example.

1. In these cases, the process for tracking down the problem is much like before and involves working "backward"...but where to start?
1. I usually suggest starting with the output that's not what you expect - where in your code did that printing occur? That's where you start.
1. In that print statement, there will likely be a variable that has the wrong value - where did that value come from? Find out which line of code provided that value - and keep working backward until you find the root cause of your problem.

---

## YOUR SKILL DRILLS

The following drills are due this Thursday:

- tut-05 : are we there yet?
- tut-05 : while loop pair
