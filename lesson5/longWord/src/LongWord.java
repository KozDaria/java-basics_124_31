public class LongWord {
    public static void main(String[] args) {
        String text = "Returns a new String composed of copies of the CharSequence elements joined together with a copy of the specified delimiter.\n" +
                "For example,\n" +
                " String message = String.join(\"-\", \"Java\", \"is\", \"cool\");  // message returned is: \"Java-is-cool\"\n" +
                "Note that if an element is null, then \"null\" is added.\n" +
                "Params:\n" +
                "delimiter – the delimiter that separates each element elements – the elements to join together.\n" +
                "Returns:\n" +
                "a new String that is composed of the elements separated by the delimiter\n" +
                "Throws:\n" +
                "NullPointerException – If delimiter or elements is null\n" +
                "Since:\n" +
                "1.8\n" +
                "See Also:\n" +
                "StringJoiner";
        System.out.println(findLongWord(text));
    }

    private static String findLongWord(String text) {
        String[] words = text.split("\\P{Alnum}+");
        String longWord = words[0];
        for (int i = 1; i < words.length; i++) {
            if (words[i].length() > longWord.length()) {
                longWord = words[i];
            }

        }
        return longWord;
    }
}