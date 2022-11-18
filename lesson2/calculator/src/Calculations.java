public class Calculations {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        System.out.println("Сумма:");
        System.out.println(calculator.sum(2, 2));
        System.out.println(calculator.sum(2, 2.5));
        System.out.println(calculator.sum(2, 2_000_000L));
        System.out.println("Вычитание:");
        System.out.println(calculator.subtr(2, 2));
        System.out.println(calculator.subtr(2, 2.5));
        System.out.println(calculator.subtr(2, 2_000_000L));
        System.out.println("Умножение:");
        System.out.println(calculator.mult(2, 2));
        System.out.println(calculator.mult(2, 2.5));
        System.out.println(calculator.mult(2, 2_000_000L));
        System.out.println("Деление:");
        System.out.println(calculator.div(3, 2));
        System.out.println(calculator.div(3, 2.0));
        System.out.println(calculator.div(2_000_000L, 2));

    }
}