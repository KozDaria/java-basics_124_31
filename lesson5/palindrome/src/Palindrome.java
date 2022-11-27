public class Palindrome {
    public static void main(String[] args) {
        String word = "нежен";
        String phrase = "искать такси";
        System.out.println((revertWord(word)));
        System.out.println(revertPhrase(phrase));
    }

    private static boolean revertWord(String word) {
        StringBuilder word2 = new StringBuilder();
        for (int i = word.length() - 1; i >= 0; i--) {
            word2.append(word.charAt(i));
        }
        return word.equalsIgnoreCase(word2.toString());
    }

    private static boolean revertPhrase(String phrase) {
        StringBuilder builder = new StringBuilder(phrase.replaceAll("\\s", "")).reverse();
        return builder.toString().equalsIgnoreCase(phrase.replaceAll("\\s", ""));
    }
}