

import java.util.ArrayList;
import java.util.List;

public class Patient {
    String name;
    int age;
    List<Doctor> doctors;

    public Patient(String name, int age) {
        this.name = name;
        this.age = age;
        this.doctors = new ArrayList<>();
    }

    // Add doctor association
    public void addDoctor(Doctor d) {
        if (!doctors.contains(d)) {
            doctors.add(d);
        }
    }

    public void showDoctors() {
        System.out.println("Patient " + name + " has consulted:");
        for (Doctor d : doctors) {
            System.out.println(" - Dr. " + d.name + " (" + d.specialization + ")");
        }
    }
}

