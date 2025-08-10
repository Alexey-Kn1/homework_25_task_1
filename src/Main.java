public class Main {
    public static void main(String[] args) throws Exception {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);

        // int c = calc.devide.apply(a, b); //Ошибка возникала из-за деления на ноль
        //
        // calc.println.accept(c);

        // Исправленный вариант:
        if (b == 0) {
            System.out.println("Калькулятор не умеет делить на ноль!");
        } else {
            int c = calc.devide.apply(a, b);

            calc.println.accept(c);
        }

        // Можно обработать ошибку и так:
        // try {
        //     int c = calc.devide.apply(a, b);

        //     calc.println.accept(c);
        // } catch (ArithmeticException ex) {
        //     System.out.println("Калькулятор не умеет делить на ноль!");
        // }
    }
}
