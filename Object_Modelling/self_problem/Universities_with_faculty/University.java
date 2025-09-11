

import java.util.ArrayList;
import java.util.List;

public class University {
    String uniName;
    List<Department> departments;

    public University(String uniName) {
        this.uniName = uniName;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department d) {
        departments.add(d);
        System.out.println("Department " + d.deptName + " added to University " + uniName);
    }

    public void showDetails() {
        System.out.println("University: " + uniName);
        for (Department d : departments) {
            d.showDetails();
        }
    }

    public void deleteUniversity() {
        System.out.println("Deleting University " + uniName + " and all its Departments...");
        departments.clear();
    }
}

