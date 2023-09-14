import java.util.*;

public class books {
    public static void main(String args[]) {
        LinkedHashSet<String> set = new LinkedHashSet<String>();
        set.add("fiction");
        set.add("fantasy");
        set.add("spiritual");
        set.add("arts");
        Iterator<String> itr = set.iterator(); // iterator is the process of searching an element again and again from
                                               // elements from the same arrays / lists
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
