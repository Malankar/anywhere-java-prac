package accessmodifiers.privatemodifier;

/*
 * We made a serious mistake here: We make our data public, which allowed fellow programmers to access the fields directly and change their values. What's more... these values were assigned without any checks. This means that our program could create a cat named "" with an age of -1000 years and weight of 0.
 * To solve this problem, we used getters and setters, and also used the private modifier to limit access to the data.
 */
class Cat {
    public String name;
    public int age;
    public int weight;

    public Cat(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public Cat() {
    }

    public void sayMeow() {
        System.out.println("Meow!");
    }
}

public class WithoutPrivate {

    public static void main(String[] args) {

        Cat cat = new Cat();
        cat.name = "";
        cat.age = -1000;
        cat.weight = 0;
        System.out.println(cat.name + " " + cat.age + " " + cat.weight);
    }
}

