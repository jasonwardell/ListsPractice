package listspractice;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author jwardell
 */
public class Lab2 {

    public static void main(String[] args) {
        Employee employee = null;

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Smith", "John", "111-11-1111"));
        employees.add(new Employee("Byrd", "Larry", "222-22-2222"));
        employees.add(new Employee("Rodgers", "Aaron", "333-33-3333"));

        System.out.println("Employee Information");
        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}
