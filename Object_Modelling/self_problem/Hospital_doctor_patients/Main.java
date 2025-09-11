

public class Main {
    public static void main(String[] args) {
        // Create Hospital
        Hospital h = new Hospital("CityCare Hospital");

        // Create Doctors
        Doctor d1 = new Doctor("Alice", "Cardiologist");
        Doctor d2 = new Doctor("Bob", "Neurologist");

        // Create Patients
        Patient p1 = new Patient("Charlie", 30);
        Patient p2 = new Patient("Diana", 45);

        // Register in hospital
        h.addDoctor(d1);
        h.addDoctor(d2);
        h.addPatient(p1);
        h.addPatient(p2);

        
        d1.consult(p1);
        d1.consult(p2);
        d2.consult(p1);

        
        h.showDetails();

        System.out.println("\n--- Doctor-wise Patients ---");
        d1.showPatients();
        d2.showPatients();

        System.out.println("\n--- Patient-wise Doctors ---");
        p1.showDoctors();
        p2.showDoctors();
    }
}
