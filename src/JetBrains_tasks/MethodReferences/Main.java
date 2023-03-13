package JetBrains_tasks.MethodReferences;

import java.util.Locale;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        //Customer customer = new Customer("Paul", "Morris");
        //  Function <Customer, String> customer2 = customer::getFirstName;


    }
}


class Seven {
    public static SeptenaryStringFunction fun = new SeptenaryStringFunction() {
        @Override
        public String apply(String s1, String s2, String s3, String s4, String s5, String s6, String s7) {
            return (s1+s2+s3+s4+s5+s6+s7).toUpperCase();
        }
    };
}

@FunctionalInterface
interface SeptenaryStringFunction {
    String apply(String s1, String s2, String s3, String s4, String s5, String s6, String s7);
}

class Customer {

    String firstName;
    String lastName;

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}

class Predicate {
    public static  TernaryIntPredicate ALL_DIFFERENT = (a, b, c) -> a != b && a != c;

    @FunctionalInterface
    public interface TernaryIntPredicate {
        Boolean test(int a, int b, int c);
    }
}