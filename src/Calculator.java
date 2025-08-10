import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Calculator {
    public static final Supplier<Calculator> instance = Calculator::new;BinaryOperator<Integer> plus = (x, y) -> x + y;
    public static final BinaryOperator<Integer> minus = (x, y) -> x - y;
    public static final BinaryOperator<Integer> multiply = (x, y) -> x * y;
    public static final BinaryOperator<Integer> devide = (x, y) -> x / y;
    public static final UnaryOperator<Integer> pow = x -> x * x;
    public static final UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;
    public static final Predicate<Integer> isPositive = x -> x > 0;
    public static final Consumer<Integer> println = System.out::println;
}
