package Midness;

import java.util.Random;

public class Utils {
    public static int getRandomNumber(int min, int max) {
        var random = new Random();
        return random.nextInt(min, max + 1);
    }

    public static <T> int getLength(T[] arr){
        int count = 0;
        for(T el : arr)
            if (el != null)
                ++count;
        return count;
    }

    public static <T> T getFirstNotNullValue(T[] arr){
        for(T el : arr)
            if (el != null)
                return el;
        return null;
    }
}
