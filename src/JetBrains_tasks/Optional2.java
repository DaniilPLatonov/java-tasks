package JetBrains_tasks;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Optional2 {
    public static void main(String[] args) {
        ValueProvider provider = new ValueProvider();

    }
}

class ValueProvider {
    private List<Optional<Integer>> opts; // cache to provide reproducing method invocation

    public List<Optional<Integer>> getValues() {
        if (opts != null) {
            return opts;
        }

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int number = scanner.nextInt();
        opts = java.util.stream.IntStream
                .rangeClosed(1, number)
                .mapToObj(n -> {
                    String val = scanner.next();
                    return "null".equals(val) ?
                            Optional.<Integer>empty() :
                            Optional.of(Integer.valueOf(val));
                })
                .collect(java.util.stream.Collectors.toList());

        return opts;
    }
}

class person implements Comparable<person> {
    private String name;
    private int age;
    private int height;
    private int weight;

    public person(String name, int age, int height, int weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWeight() {
        return this.weight;
    }

    @Override
    public int compareTo(person otherPerson) {
        int res = getName().compareTo(otherPerson.getName());
        if (res == 0) {
            return Integer.compare(getAge(), otherPerson.getAge());
        } else {
            return res;
        }
    }
}

class StockItem {
    private String name;
    private double pricePerUnit;
    private int quantity;

    public StockItem(String name, double pricePerUnit, int quantity) {
        this.name = name;
        this.pricePerUnit = pricePerUnit;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return name + ": " + pricePerUnit + ", " + quantity + ";";
    }

    public String getName() {
        return name;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public int getQuantity() {
        return quantity;
    }
}

class Utils {
    public static List<StockItem> sort(List<StockItem> stockItems) {
        stockItems.sort(new Comparator<StockItem>() {
             @Override
             public int compare(StockItem o2, StockItem o1) {
                 double a = o1.getQuantity() * o1.getPricePerUnit();
                 double b = o2.getQuantity() * o2.getPricePerUnit();
                 return Double.compare(a,b);
             }
         });
        return stockItems;
    }
/*        Comparator<StockItem> stockItemComparator = (st1,st2) ->{
            int a1 = (int) (st1.getQuantity()* st1.getPricePerUnit());
            int a2 = (int) (st2.getQuantity()* st2.getPricePerUnit());

        }*/


}


class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + "=" + age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class Utils2 {

    public static void sortUsers(List<User> users) {
        // Integer.compare(User::getAge)
        //  .thenComparing(User::getName, Comparator.reverseOrder());
    }
}

class Utils3 {

    public static void main(String[] args) {

        System.out.println(sortOddEven(new ArrayList<Integer>(Arrays.asList(0, 1, 2, 3, 4, 5))));
    }

    public static void sortStrings(List<String> strings) {
        Collections.reverse(strings);
    }

    public static List<Integer> sortOddEven(List<Integer> numbers) {
        List<Integer> list = numbers.stream().filter(a -> a % 2 == 0).collect(Collectors.toList());
        List<Integer> list2 = numbers.stream().filter(a -> a % 2 != 0).collect(Collectors.toList());

        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1,o2);
            }
        });
        list2.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o2,o1);
            }
        });
        list2.addAll(list);
        return list2;
    }
}



class Main5 {

    /**
     * Prints each element from a given stream except first 2 elements.
     *
     * @param stream the input stream of integers
     */
    public static void printStream(Stream<Integer> stream) {
        stream.skip(2).forEach(System.out::println);
    }

    public static int sum(int a, int b, int n, int m) {
        return IntStream.rangeClosed(a, b)
                .filter(num -> num % n == 0 || num % m == 0)
                .sum();
    }

    public static long factorial(long n) {
         long b = 1;
         for(long i = 1; i <= n; i++){
             b *= i;
         }
         return b;
    }
    // Don't change the code below
    public static void main(String[] args) {
        System.out.println(factorial(4));
        
    }
}