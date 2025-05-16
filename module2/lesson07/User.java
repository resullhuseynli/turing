package module2.lesson07;

public class User {

    int id;
    String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", name='" + name + '\'' +
                "\n";
    }
}
