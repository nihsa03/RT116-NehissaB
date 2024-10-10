
    package Homework.M303_9;

    public class GLAB_303_9_2 { // Combined class for inheritance example

        // Base class Doctor
        static class Doctor {
            String doctorName;
            String department;

            public void doctorDetails() {
                System.out.println("Doctor Details...");
            }
        }

        // Subclass Surgeon that extends Doctor
        static class Surgeon extends Doctor {
            void surgeonDetails() {
                System.out.println("Surgeon Detail...");
                department = "Cardio"; // Set department
                System.out.println("Department: " + department);
            }
        }

        // Main class to demonstrate inheritance
        public static void main(String[] args) {
            Surgeon s = new Surgeon();
            s.doctorDetails();
            s.surgeonDetails();
        }
    }


