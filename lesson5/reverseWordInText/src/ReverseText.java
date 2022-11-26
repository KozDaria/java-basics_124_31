public class ReverseText {
    public static void main(String[] args) {
        String text = "This is a test string";
        System.out.println("The given string is: " + text);
        System.out.println("The string reversed word by word is: " + revertString(text));
    }

    private static StringBuilder revertString(String text) {
        String[] words = text.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            result.append(new StringBuilder(word).reverse().append(" "));
        }
        return result;
    }
}