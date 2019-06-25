import java.util.Arrays;

/**
 * created: User
 * date: 06.06.2019
 */
public class DescendingOrder {
    public static int sortDesc(final int num) {
        String numStringValue = String.valueOf(num);
        StringBuilder sb = new StringBuilder(numStringValue.length());
        char[] chars = numStringValue.toCharArray();
        Arrays.sort(chars);

        for (char ch : chars) {
            sb.append(ch);
        }
        return new Integer(sb.reverse().toString());
    }
}
