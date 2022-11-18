public class Calculations {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        System.out.println("Сумма:");
        System.out.println(calculator.Sum(2, 2));
        System.out.println(calculator.Sum(2, 2.5));
        System.out.println(calculator.Sum(2, 2_000_000L));
        System.out.println("Вычитание:");
        System.out.println(calculator.Subtr(2, 2));
        System.out.println(calculator.Subtr(2, 2.5));
        System.out.println(calculator.Subtr(2, 2_000_000L));
        System.out.println("Умножение:");
        System.out.println(calculator.Mult(2, 2));
        System.out.println(calculator.Mult(2, 2.5));
        System.out.println(calculator.Mult(2, 2_000_000L));
        System.out.println("Деление:");
        System.out.println(calculator.Div(2, 2));
        System.out.println(calculator.Div(2, 2.5));
        System.out.println(calculator.Div(2_000_000L, 2));

    }
}