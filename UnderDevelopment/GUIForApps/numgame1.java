int number = 1 + (int)(100
* Math.random());

// Given K trials
//System.out.println("How many guesses do you need: ");
int K = 10;
//K = sc.nextInt();
int i = 0; 
int guess = 0;

System.out.println
(
"A number is chosen"
+ " between 1 to 100."
+ "Guess the number."
);

// Iterate over K Trials
for (i = 0; i < K; i++) 
{

System.out.println(
"Guess the number: ");

// Take input for guessing
guess = sc.nextInt();

// If the number is guessed
if (number == guess) {
System.out.println(
" Congratulations!"
+ " \nYou guessed the number.");
break;
}
if(guess > number - 5 && guess < number + 5 && i!= K-1)
{
System.out.println("You are extremely near the number.");
}
else if (guess > number - 10 && guess < number + 10
&& i != K - 1) {
System.out.println(
" You are near it");
}
else if(number > guess && i!=K - 1)
{
System.out.println("The number is greater than your guess");
}
else if(number<guess && i!=K)
{
System.out.println("The number is smaller than your guess");
}
}

if (i == K) 
{
System.out.println(
"You have exhausted"
+ " K trials.");

System.out.println(
"The number was " + number);
}
}