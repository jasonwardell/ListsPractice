package listspractice;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jwardell
 */
public class Lab3 {

    public static void main(String[] args) {

        List employees = new ArrayList();
        employees.add(new Employee("Smith", "John", "111-11-1111"));
        employees.add(new Employee("Byrd", "Larry", "222-22-2222"));
        employees.add(new Dog("Hemi", 1234));
        employees.add(new Dog("Mopar", 5678));


        for (int i = 0; i < employees.size(); i++) {
            Object obj = employees.get(i);
            Dog dog = null;
            Employee employee = null;
            
            if (obj instanceof Dog) {
                dog = (Dog) obj;
            } else if (obj instanceof Employee) {
                employee = (Employee) obj;
            }
            System.out.println(obj);
        }
    }
}
