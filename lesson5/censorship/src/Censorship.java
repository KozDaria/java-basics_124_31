public class Censorship {
    public static void main(String[] args) {
        String text ="I love бякапоросяка that бяка Java";
        System.out.println(text.replaceAll("(?<!\\S)бяка(?<!\\S)","[вырезано цензурой]"));
    }
}