package employeeRecursion;

import java.util.ArrayList;
import java.util.List;

public class EmplRecursion {

    public static List<EmployeeK> getEmployeeK() {

        EmployeeK e = new EmployeeK();
        EmployeeK e1 = new EmployeeK();
        EmployeeK e2 = new EmployeeK();
        EmployeeK e3 = new EmployeeK();
        List<EmployeeK> listK = new ArrayList<>();
        e.setSalary(6);
        e2.setSalary(1);
        listK.add(e);
        listK.add(e1);
        listK.add(e2);
        listK.add(e3);
        return listK;
    }

    public static Double getSalaryK(List<EmployeeK> empl, int n) {
        if (n==empl.size())
            return  empl.get(empl.size()-n).getSalary();
        else return empl.get(empl.size()-n).getSalary()+getSalaryK(empl, n+1);
    }
}
