package listspractice;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jwardell
 */
public class Lab1 {

    public static void main(String[] args) {
        List hobbies = new ArrayList();
        hobbies.add("camping");
        hobbies.add("hiking");
        hobbies.add("hunting");

        System.out.println("My Hobbies");
        for (int i = 0; i < hobbies.size(); i++) {
            String h = (String) hobbies.get(i);
            System.out.println(h);
        }

        hobbies.add("road trips");
        hobbies.add("writing code");

        System.out.println("\n\nAdded Hobbies");
        for (int i = 0; i < hobbies.size(); i++) {
            String h = (String) hobbies.get(i);
            System.out.println(h);
        }

        hobbies.remove("hiking");
        hobbies.remove("writing code");

        System.out.println("\n\n Hobbies removed");
        for (int i = 0; i < hobbies.size(); i++) {
            String h = (String) hobbies.get(i);
            System.out.println(h);
        }
    }
}
