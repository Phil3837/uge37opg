import java.util.HashSet;
import java.util.Set;

public class OddPurger {
    public static void main(String[] args) {
        Set<String> sample = new HashSet<>() {
            {
                add("John");
                add("Mayer");
                add("Hagebubnzu");
                add("Penis");
            }
        };
        OddPurger op = new OddPurger();
        System.out.println(op.oddPurger(sample));
    }

    public Set<String> oddPurger(Set<String> set){
            set.removeIf(word -> word.length() %2 != 0);
        return set;
    }
}
