/**
 * created: User
 * date: 25.06.2019
 */
public class SquareDigit {

    public int squareDigits(int n) {
        String stringValue = String.valueOf(n);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < stringValue.length(); i++) {
            int intValue = Integer.parseInt(String.valueOf(stringValue.charAt(i)));
            sb.append(((Double) Math.pow(intValue, 2)).intValue());
        }
        return Integer.valueOf(sb.toString());
    }
}
