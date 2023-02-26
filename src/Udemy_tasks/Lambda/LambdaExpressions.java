package Udemy_tasks.Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambdaExpressions {

    public static void main(String[] args) {
        int[] arr = new int[10];
        List<Integer> list = new ArrayList<>();

        int[] arr1 = new int[10];
        List<Integer> list1 = new ArrayList<>();
        arr = Arrays.stream(arr).map(x -> 10).toArray();
        list = list.stream().map(a -> 5).collect(Collectors.toList());

        int[] arr2 = new int[10];
        List<Integer> list2 = new ArrayList<>();
        arr2 = Arrays.stream(arr2).map(x -> 4).toArray();
        list2 = list2.stream().map(a -> 5).collect(Collectors.toList());
        arr2 = Arrays.stream(arr2).filter(a -> a % 2 == 0).toArray();

        List<Integer> nonEmptyAccounts = null;
        List<Integer> accountsWithTooMuchMoney = null;
        nonEmptyAccounts = nonEmptyAccounts.stream().filter(a -> a > 0).collect(Collectors.toList());
        Arrays.stream(arr2).forEach(System.out::println);
        list2.forEach(System.out::println);
        //accountsWithTooMuchMoney = accountsWithTooMuchMoney.stream().filter(a -> a > 1000000000 && !account.isLocked).collect(Collectors.toList());
        //reduce
        int[] arr3 = new int[10];
        List<Integer> list3 = new ArrayList<>();
        System.out.println(Arrays.toString(arr2));
        System.out.println(list);

        int sum1 = Arrays.stream(arr3).reduce(Integer::sum).getAsInt();
        // int sum2 = list3.stream().reduce((acc, b) -> acc * b).get();


        int[] arr4 = new int[10];
        for (int i = 0; i < 10; i++) {
            arr4[i] = i + 1;
        }

        Stream<String> a2 = null;
        a2.sorted().forEach(System.out::println);

        arr4 = Arrays.stream(arr4)
                .filter(a -> a % 2 != 0)
                .map(a -> a * 2)
                .toArray();
        System.out.println(Arrays.toString(arr4));


    }

}
