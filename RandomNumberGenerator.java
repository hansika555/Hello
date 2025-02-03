import java.util.Random;

public class RandomNumberGenerator {
    public static void main(String[] args) {
        Random random = new Random();
        
        // Generate a random integer between 1and 100
        int randomNumber = random.nextInt(100) + 1;
        
        System.out.println("Generated Random Number: " + randomNumber);
    }
}
