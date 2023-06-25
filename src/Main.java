import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();
        int rndBirthMonthOff = rnd.nextInt(12); //generates random value 0-11
        int rndBirthMonth = rnd.nextInt(12) + 1; // 1-12 by adding one

        int dieOff = rnd.nextInt(6); // generates a random int between 0 and 5
        int die = rnd.nextInt(6); // generates a random int between 1 and 5

        int die1 = rnd.nextInt(6) + 1; // generates random int between 0-5
        int die2 = rnd.nextInt(6) + 1; // generates random int between 1-6
        int crapsRoll = die1 + die2; //Gaussian range from 2 to 12 as in rolling two die


    }
}