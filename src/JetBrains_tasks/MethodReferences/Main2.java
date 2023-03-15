package JetBrains_tasks.MethodReferences;

import java.util.*;
import java.util.function.*;


public class Main2 {

    public static <T> void applyFunction(T[] array, Function<T, T> func) {
        // write your code here
        for (int i = 0; i < array.length; i++) {
            array[i] = func.apply(array[i]);
        }
    }

    // do not change code below
    public static void main(String[] args) {

        for (long i = 5; i <= 15; i++) {
            //
            // x *= i;
        }

        Scanner scanner = new Scanner(System.in);
        String method = scanner.nextLine();
        String[] array = scanner.nextLine().split(" ");
        applyFunction(array,
                "lower".equals(method) ? String::toLowerCase :
                        "upper".equals(method) ? String::toUpperCase :
                                "new".equals(method) ? String::new :
                                        "trim".equals(method) ? String::trim : String::intern);
        Arrays.stream(array).forEach(e -> System.out.print(e + " "));
    }
}

class PrefixSuffixOperator {

    public static final String PREFIX = "__pref__";
    public static final String SUFFIX = "__suff__";

    public static UnaryOperator<String> operator = str -> {
        str = str.trim();
        return PREFIX + str + SUFFIX;
    };// write your code here
}

class Operator {

    public static int a = 10;
    public static int b = 20;
    public static int c = 30;

    public static DoubleUnaryOperator unaryOperator = x -> a * (x * x) + (b * x) + c;
    ;// Write your code here
}

class Operator2 {

    public static LongBinaryOperator binaryOperator = (x, y) -> {
        if (x == y)
            return y;
        for (long i = x; i < y; i++) {
            x += i;
        }
        return x;
    };
}


