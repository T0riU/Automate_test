import java.util.*;

public class Main {

    public static void main(String[] args) {
        Set<User> set = new HashSet<>();

        set.add(new User("Max", 12));
        set.add(new User("Max", 12));
        set.add(new User("Max", 12));
        set.add(new User("Max", 12));
        if (set.size() == 1) {
            System.out.println("Passed!");
        } else {
            System.out.println("Failed!");
        }
    }

    static class User {

        String name;
        int age;

        public User(String name, int age) {
            this.name = name;
            this.age = age;
        }
        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            User user = (User) obj;
            return age == user.age && Objects.equals(name, user.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age);
        }
    }
}
