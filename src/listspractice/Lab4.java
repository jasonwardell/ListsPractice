package listspractice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author jwardell
 */
public class Lab4 {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Smith", "John", "111-11-1111"));
        employees.add(new Employee("Byrd", "Larry", "222-22-2222"));
        employees.add(new Employee("Rodgers", "Aaron", "333-33-3333"));
        employees.add(new Employee("Mathews", "Clay", "222-22-2222"));
        employees.add(new Employee("Michael", "Jordan", "333-33-3333"));

        Set<Employee> removeDuplicates = new HashSet<>(employees);
        employees = new ArrayList<>(removeDuplicates);
        for (Employee s : employees) {
            System.out.println(s);
        }
    }

}
