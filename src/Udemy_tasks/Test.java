package Udemy_tasks;

import java.util.*;

public class Test {
    public static void main(String[] args) {

        /* List<Person2> people = new ArrayList<>();
        people.add(new Person2(3,"bob"));
        people.add(new Person2(2,"Kate"));
        people.add(new Person2(1, "Mike"));

        people.sort((o1, o2) -> Integer.compare(o1.getId(), o2.getId()));
        System.out.println(people);

        List<String> animals = new ArrayList();
        animals.add("ca");
        animals.add("dog");
        animals.add("bird");
      //  Collections.sort(animals, new StringLengthComparator());
        System.out.println(animals);

        List <Integer> num = new ArrayList<>(Arrays.asList(5,10,20,500));
        //Collections.sort(num,new IntegerComparator());
        System.out.println(num);*/

        List<Person2> person2List = new ArrayList<>();
        Set<Person2> person2Set = new TreeSet<>();
        addElements(person2List);
        addElements(person2Set);
        System.out.println(person2List);
        System.out.println(person2Set);
    }

    private static void addElements(Collection collection) {
        collection.add(new Person2(1, "Bob"));
        collection.add(new Person2(2, "Kate"));
        collection.add(new Person2(3, "Mike"));
        collection.add(new Person2(4, "George"));
    }
}

class Person2 implements Comparable<Person2> {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person2 person2 = (Person2) o;

        if (id != person2.id) return false;
        return name != null ? name.equals(person2.name) : person2.name == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Person2{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Person2(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Person2 o) {
        if (this.name.length() > o.getName().length()) {
            return 1;
        } else if (this.name.length() < o.getName().length()) {
            return -1;
        } else {
            return 0;
        }
    }
}


/*
class StringLengthComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        if (o1.length() > o2.length()) {
            return 1;
        } else if (o1.length() < o2.length()) {
            return -1;
        }else{
            return 0;
        }
        */
/*
        o1 > o2 => 1;
        o1 < o2 => -1;
        o1 == o2 => 0;
        *//*

    }
}*/
