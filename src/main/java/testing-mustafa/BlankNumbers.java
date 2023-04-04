import java.util.Random;

class BlankNumbers{
    public static void main(String[] args) {
        Random random = new Random();

        // Generate a random number between 4401 and 440100
        int randomNumber = random.nextInt(435700) + 4401;

        // Print the random number
        System.out.println("Random number: " + randomNumber);
    }
}