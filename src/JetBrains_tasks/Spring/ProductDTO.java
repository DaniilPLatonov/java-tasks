package JetBrains_tasks.Spring;

import java.util.List;

class ProductDTO {

    private long id;
    private String model;
    private int price;

    public ProductDTO(long id, String model, int price) {
        this.id = id;
        this.model = model;
        this.price = price;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }
}


class User {
    private long id;
    private String name;
    private String password;
    private List<Blog> blogs;

    public User(long id, String name, String password, List<Blog> blogs) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.blogs = blogs;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Blog> getBlogs() {
        return blogs;
    }

    public void setBlogs(List<Blog> blogs) {
        this.blogs = blogs;
    }

    //constructors, getters, and setters
}

class Blog {
    private long id;
    private String name;
    private User author;
    private String content;

    //constructors, getters, and setters
}

record BlogDTO(long id, String name, String authorName, String content) {
}