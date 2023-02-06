package JetBrains_tasks;




import java.util.Scanner;

record Person(String name, int age, String gender) {
    //don't change this record
    public String name() {
        return name;
    }
    public int age() {
        return age;
    }
    public String gender() {
        return gender;
    }

}


class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Person person = new Person(scanner.next(), scanner.nextInt(), scanner.next());
        System.out.println(person.name() + " is " + person.age() + " years old and is " + person.gender() );
    }

}

class Book {

    private String title;
    private int yearOfPublishing;
    private String[] authors;

    public Book(String title, int yearOfPublishing, String[] authors) {
        this.title = title;
        this.yearOfPublishing = yearOfPublishing;
        this.authors = authors;
    }

    @Override
    public String toString() {
        return "title=" + title + " yearOfPublishing=" + yearOfPublishing + ",authors=" + java.util.Arrays.toString(this.authors).replace(", ", ",");
    }
}

class Vehicle {

    protected String licensePlate;

    public Vehicle(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    @Override
    public String toString() {
        return "Vehicle{licensePlate=" + licensePlate + "}";
    }
}

class Car extends Vehicle {

    protected int numberOfSeats;

    public Car(String licensePlate, int numberOfSeats) {
        super(licensePlate);
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public String toString() {
        return "Car{licensePlate=" + licensePlate + ",numberOfSeas=" + numberOfSeats + "}";
    }
}