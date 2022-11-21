public class Tree {
    private String name;
    private int age;
    private boolean alive;

    public Tree(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Tree(String name, int age, boolean alive) {
        this.name = name;
        this.age = age;
        this.alive = alive;
    }

    public Tree() {
        System.out.println("Пустой конструктор без параметров сработал");
    }

    @Override
    public String toString() {
        return "Tree{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", alive=" + alive +
                '}';
    }
}
