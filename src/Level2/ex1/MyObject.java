package Level2.ex1;

@JsonSerializable(directory = "output/jsonfiles")
public class MyObject {
    private String name;
    private int age;
    private String email;

    public MyObject (String name, int age, String email){
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
        if (email == null || email.trim().isEmpty()) {
            throw new IllegalArgumentException("Email cannot be null or empty");
        }

        this.name = name;
        this.age = age;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Name = '" + name + '\'' +
                ", age = " + age +
                ", email = '" + email + '\'';
    }
}
