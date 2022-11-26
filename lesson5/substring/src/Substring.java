import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Substring {
    public static void main(String[] args) {
        String searchingSubstring = "ёж";
        String searchingSubstring2 = "ежонок";
        String text = "ёжик ёж ёж";
        System.out.println(getCountUsingMatcher(searchingSubstring, text));
        System.out.println(getCountWithoutMatcher(searchingSubstring, text));
        System.out.println(getCountUsingMatcher(searchingSubstring2, text));
    }

    private static int getCountWithoutMatcher(String searchingSubstring, String text) {
        return (text.length() - text.replaceAll(searchingSubstring, "").length()) / searchingSubstring.length();
    }

    private static int getCountUsingMatcher(String searchingSubstring, String text) {
        int count = 0;
        Pattern pattern = Pattern.compile(searchingSubstring);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            count++;
        }
        return count;
    }
}