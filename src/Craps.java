import java.util.Random;
public class Craps {
    public static void main(String[] args) {
        Random rnd = new Random();
        int rndBirthMonthOff = rnd.nextInt(12); //generates random value 0-11
        int rndBirthMonth = rnd.nextInt(12) + 1; // 1-12 by adding one

        int dieOff = rnd.nextInt(6); // generates a random int between 0 and 5
        int die = rnd.nextInt(6) + 1; // generates a random int between 1 and 5

        int die1 = rnd.nextInt(6) + 1; // generates random int between 0-5
        int die2 = rnd.nextInt(6) + 1; // generates random int between 1-6
        int crapsRoll = die1 + die2; //Gaussian range from 2 to 12 as in rolling two die

        int die3 = rnd.nextInt(6) + 1; // second roll
        int die4 = rnd.nextInt(6) + 1; // second roll
        int crapsRoll2 = die3 + die4; //second roll total
        String playAgain = ""; //prompt user to play?

        System.out.println("Do you want to play? Input Yes or No");

            do {
                System.out.println("Die 1: " + die1);
                System.out.println("Die 2: " + die2);
                System.out.println("Total value of roll: " + crapsRoll);

                if(crapsRoll = 2 | 3 | 12)
                {
                    System.out.println("You have 'craps'! You have 'crapped out'! The game is over. You lost.);
                } else if(crapsRoll = 7 | 11) {
                    System.out.println("Your roll was a 'natural'! You win! Good job!");
                } else {
                    System.out.println("The point is: " + crapsRoll + "Keep rolling.");
                    if(crapsRoll2 = crapsRoll)
                    {
                        System.out.println("You rolled: " + crapsRoll2 + "You made the point! You win!");
                    } else if(crapsRoll2 = 7){
                        System.out.println("You rolled a 7! You lose.");
                    } else {
                        System.out.println("You rolled: " + crapsRoll2 + "Keep rolling.");
                    }
                }
            } while(playAgain.equalsIgnoreCase("yes"));

        System.out.println("Thanks for playing!");
    }
}