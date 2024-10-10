package Homework.M303_9;

public class GLAB_303_9 { // Main class

    // HumanBeing class demonstrating encapsulation
    static class HumanBeing {
        private float weight;
        private float height;
        private float bmi;

        public HumanBeing(float weight, float height) {
            this.weight = weight;
            this.height = height;
            this.bmi = calculateBmi();
        }

        public HumanBeing() {
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
    }

    // Doctor class demonstrating inheritance
    static class Doctor {
        String doctorName;
        String department;

        public void doctorDetails() {
            System.out.println("Doctor Details...");
        }
    }

    // Surgeon class that inherits from Doctor
    static class Surgeon extends Doctor {
        public void surgeonDetails() {
            System.out.println("Surgeon Detail...");
            department = "Cardio"; // Set department
            System.out.println("Department: " + department);
        }
    }

    // Main class to run the program
    public static void main(String[] args) {
        // Demonstrating HumanBeing encapsulation
        HumanBeing h1 = new HumanBeing();
        h1.setHeight(1.65f);
        h1.setWeight(68);

        System.out.println("Person has " + h1.getWeight() + " kgs and is " + h1.getHeight() + " meters in height, which results in BMI of " + h1.getBmi());

        // Demonstrating inheritance
        Surgeon s = new Surgeon();
        s.doctorDetails();
        s.surgeonDetails();
    }
}
