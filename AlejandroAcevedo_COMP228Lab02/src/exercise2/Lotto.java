package exercise2;

import java.security.SecureRandom;

public class Lotto {
    private int[] numbers = new int[3];
    SecureRandom random = new SecureRandom();

    public Lotto() {
        for (int i=0; i<numbers.length; i++) {
            // secure random
            numbers[i] = random.nextInt(1,9);
        }
    }

    // getters and setters
    public int[] getNumbers() {
        return numbers;
    }

    // methods

    
}
