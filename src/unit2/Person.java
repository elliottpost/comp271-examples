package unit2;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

//    @Override
    public boolean equals(Person x) {
        if (x == this) return true;

        if (x == null) return false;

        if (x.getName().equals(this.getName()) && x.getAge() == this.getAge()) {
            return true;
        }

        return false;
    }

    public String toString() {
        return "My name is " + this.getName() + " and I am " + this.getAge() + " years old";
    }
}
