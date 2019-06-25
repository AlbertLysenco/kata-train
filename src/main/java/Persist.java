/**
 * created: User
 * date: 06.06.2019
 */
public class Persist {
    public static int persistence(long n) {


        return countItearions(0, n);
    }

    private static int countItearions(int iteration, long stringNumber) {
        String longInStringValue = String.valueOf(stringNumber);
        int result = iteration;
        if (longInStringValue.length() == 1) {
            return result;
        } else {
            result++;
            long multResult = 1;
            for (int i = 0; i < longInStringValue.length(); i++) {
                multResult *= Integer.valueOf(String.valueOf(longInStringValue.charAt(i)));
            }
            return countItearions(result, multResult);
        }
    }
}
