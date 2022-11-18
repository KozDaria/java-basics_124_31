public class Calculator {
    public int sum(int x, int y){
        return x+y;
    }

    public double sum(double x, double y){
        return x+y;
    }

    public long sum(long x, long y){
        return x+y;
    }

    public int mult(int x, int y){
        return x*y;
    }

    public double mult(double x, double y){
        return x*y;
    }

    public long mult(long x, long y){
        return x*y;
    }

    public int subtr(int x, int y){
        return x-y;
    }

    public double subtr(double x, double y){
        return x-y;
    }

    public long subtr(long x, long y){
        return x-y;
    }

    public double div(int x, int y) {
        if (y != 0) {
            return (double)x / y;
        } else {
           System.err.println("Недопустимая операция");
           return 0;
        }
   }

    public double div(double x, double y) {
        if (y != 0) {
            return x / y;
        } else {
            System.err.println("Недопустимая операция");
            return 0;
        }
    }

    public double div(long x, long y) {
        if (y != 0) {
            return (double)x / y;
        } else {
            System.err.println("Недопустимая операция");
            return 0;
        }
    }
}
