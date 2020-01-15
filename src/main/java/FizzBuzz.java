
public class FizzBuzz {


    public static String of(int num) {
        String res = "";

        if (isDivided(num, 3)) {
            res += "Fizz";
        }
        if (isDivided(num, 5)) {
            res += "Buzz";
        }
        if (res.isEmpty()) {
            res += num;
        }
        return res;
    }

    private static boolean isDivided(int num, int i) {
        return num % i == 0;
    }
}
