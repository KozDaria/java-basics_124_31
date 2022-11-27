public class Censorship {
    public static void main(String[] args) {
        String text = "I love бякапоросяка that бяка Java";
        String badString = "бяка";
        String censorship = "[вырезано цензурой] ";
        System.out.println(setCensorship(text, badString, censorship));
    }

    private static String setCensorship(String text, String badString, String censorship) {
        return text.replaceAll("(?<!\\S)" + badString + "(\\s)", censorship);
    }
}