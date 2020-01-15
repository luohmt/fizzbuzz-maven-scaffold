
public class FizzBuzz {

    public static String of(int num) {
        if (isDivided(num, 3) && isDivided(num, 5)) {
            return "FizzBuzz";
        }

        if (isDivided(num, 3)) {
            return "Fizz";
        }
        if (isDivided(num, 5)) {
            return "Buzz";
        }
        return String.valueOf(num);
    }

    private static boolean isDivided(int num, int i) {
        return num % i == 0;
    }
}
