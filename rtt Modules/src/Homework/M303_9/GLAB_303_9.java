package Homework.M303_9;

public class GLAB_303_9 { // Combined class for encapsulation example

    // HumanBeing class demonstrating encapsulation
    private float weight;
    private float height;
    private float bmi;

    public GLAB_303_9(float weight, float height) {
        this.weight = weight;
        this.height = height;
        this.bmi = calculateBmi();
    }

    public GLAB_303_9() {
        // Default constructor
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
        this.bmi = calculateBmi(); // Update BMI when weight is set
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
        this.bmi = calculateBmi(); // Update BMI when height is set
    }

    public float getBmi() {
        return bmi;
    }

    private float calculateBmi() {
        return weight / (height * height);
    }

    // Main method to demonstrate encapsulation
    public static void main(String[] args) {
        GLAB_303_9 h1 = new GLAB_303_9();
        // Using setters of GLAB_303_9
        h1.setHeight(1.65f);
        h1.setWeight(68);

        // Using getters of GLAB_303_9
        System.out.println("Person has " + h1.getWeight() + " kgs and is " + h1.getHeight() + " meters in height, which results in BMI of " + h1.getBmi());
    }
}
