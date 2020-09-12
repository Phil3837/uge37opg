import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Counter {
    public static void main(String[] args) {
        Integer[] samples = {3,7,-1,2,3,7,2,15};
        List<Integer> sl = Arrays.asList(samples);
        Counter counter = new Counter();
        System.out.println(counter.countUnique(sl));

    }
    public int countUnique(List<Integer> intList){
        Set<Integer> integers = new HashSet<>(intList);
        return integers.size();
        }
    }

