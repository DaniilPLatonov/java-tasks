package JetBrains_tasks;


class Main {
    public static void main(String[] args) {
        Book book = new Book("a",5, new String[]{"4","d"});
        System.out.println(book.toString());
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
        return "title=" + title + ",yearOfPublishing=" + yearOfPublishing + ",authors=" + java.util.Arrays.toString(this.authors).replace(", ", ",");
    }
}

