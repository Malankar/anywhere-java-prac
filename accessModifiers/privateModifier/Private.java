package accessModifiers.privateModifier;

/*
 * Basically, limiting access to fields and implementing getters and setters are the most common examples of how private would be used in real work.
 * In other words, the main purpose of this modifier is to achieve encapsulation in a program.
 */

class CatWP {
    private String name;
    private int age;
    private int weight;

    public CatWP(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public CatWP() {
    }

    public void sayMeow() {
        System.out.println("Meow!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        // input parameter check
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws Exception {
        // input parameter check
        if (age < 20 && age > 0) {
            this.age = age;
            System.out.println("Set the age to: " + age);
        } else {
            throw new Exception("Age is not valid");
        }
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        // input parameter check
        this.weight = weight;
    }
}

public class Private {

    public static void main(String[] args) {
        CatWP cat = new CatWP();
        System.out.println("\n");
        try {
            cat.setAge(5);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
