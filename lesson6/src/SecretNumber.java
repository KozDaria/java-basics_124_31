import java.util.Scanner;

public class SecretNumber {
    int number = 0;

    public int getNumber() {
        setNumber();
        return number;
    }
    public void setNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите секретное число");
        this.number = scanner.nextInt();
    }
}
