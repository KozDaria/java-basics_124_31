import java.util.Scanner;

public class Person {
    int age = 0;
    String name;

    public int getAge() {
        setAge();
        return age;
    }

    public void setAge() {
        Scanner scanner = new Scanner(System.in);
        int inputAge = getInputAge(scanner);
        while (inputAge < 1 || inputAge > 126) {
            System.out.println("Вы ввели неправильный возраст");
            inputAge = getInputAge(scanner);
        }
        this.age = inputAge;
    }

    private static int getInputAge(Scanner scanner) {
        System.out.println("Введите возраст");
        return scanner.nextInt();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

}

