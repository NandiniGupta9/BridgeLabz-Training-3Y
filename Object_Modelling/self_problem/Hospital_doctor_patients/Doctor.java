

import java.util.ArrayList;
import java.util.List;

public class Doctor {
    String name;
    String specialization;
    List<Patient> patients;

    public Doctor(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
        this.patients = new ArrayList<>();
    }

    
    public void consult(Patient p) {
        patients.add(p);
        p.addDoctor(this); 
        System.out.println("Doctor " + name + " is consulting Patient " + p.name);
    }

    public void showPatients() {
        System.out.println("Doctor " + name + " has consulted:");
        for (Patient p : patients) {
            System.out.println(" - " + p.name);
        }
    }
}
