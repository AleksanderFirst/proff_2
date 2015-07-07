package home_task_2.set_analyser;

import home_task_1.employee_recursion_task.Employee;

import java.util.*;

/**
 * Created by Антон on 07.07.2015.
 */
public class SetFactory {
    public ISetAnalyser correctEmployeeSetAnalyse(Set set){
        if (set instanceof HashSet){
            return new CorrectEmployeeSetAnalyser(new HashSet<Employee>());
        } else if (set instanceof TreeSet) {
            return new CorrectEmployeeSetAnalyser(new TreeSet<Employee>());
        } else if (set instanceof LinkedList){
            return new CorrectEmployeeSetAnalyser(new LinkedHashSet<Employee>());
        }
        return null;
    }
    public ISetAnalyser uncorrectEmployeeSetAnalyse(Set set){
        if (set instanceof HashSet){
            return new UncorrectEmployeeSetAnalyser(new HashSet<UncorrectEmployee>());
        } else if (set instanceof TreeSet) {
            return new UncorrectEmployeeSetAnalyser(new TreeSet<UncorrectEmployee>());
        } else if (set instanceof LinkedList){
            return new UncorrectEmployeeSetAnalyser(new LinkedHashSet<UncorrectEmployee>());
        }
        return null;
    }
}
