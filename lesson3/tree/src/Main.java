public class Main {
    public static void main(String[] args) {
        Tree spruce = new Tree();
        Tree oak = new Tree("Oak",100);
        Tree linden = new Tree("Linden", 30, true);
        System.out.println(spruce.toString());
        System.out.println(oak.toString());
        System.out.println(linden.toString());
    }
}