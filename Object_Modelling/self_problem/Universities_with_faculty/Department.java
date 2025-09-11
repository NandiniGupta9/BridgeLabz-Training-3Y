

import java.util.ArrayList;
import java.util.List;

public class Department {
    String deptName;
    List<Faculty> facultyList;

    public Department(String deptName) {
        this.deptName = deptName;
        this.facultyList = new ArrayList<>();
    }

    public void addFaculty(Faculty f) {
        facultyList.add(f);
        System.out.println(f.name + " added to Department " + deptName);
    }

    public void showDetails() {
        System.out.println("Department: " + deptName);
        for (Faculty f : facultyList) {
            f.showDetails();
        }
    }
}

