

import java.util.ArrayList;
import java.util.List;

public class Hospital {
    String hospitalName;
    List<Doctor> doctors;
    List<Patient> patients;

    public Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    public void addDoctor(Doctor d) {
        doctors.add(d);
        System.out.println("Doctor " + d.name + " joined " + hospitalName);
    }

    public void addPatient(Patient p) {
        patients.add(p);
        System.out.println("Patient " + p.name + " registered at " + hospitalName);
    }

    public void showDetails() {
        System.out.println("\nHospital: " + hospitalName);
        System.out.println("Doctors:");
        for (Doctor d : doctors) {
            System.out.println(" - " + d.name + " (" + d.specialization + ")");
        }
        System.out.println("Patients:");
        for (Patient p : patients) {
            System.out.println(" - " + p.name + " (Age " + p.age + ")");
        }
    }
}
