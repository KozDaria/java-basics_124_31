import java.util.Scanner;

public class Person {
    int age = 0;
    String name;
    Scanner scanner = new Scanner(System.in);

    public int setAge() {
        System.out.println("Введите возраст");
        int inputAge = scanner.nextInt();
       while (inputAge < 1 || inputAge > 126) {
           System.out.println("Вы ввели неправильный возраст");
           inputAge = getInputAge(scanner);
       }
       return this.age = inputAge;
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

