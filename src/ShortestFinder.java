import java.util.HashSet;
import java.util.Set;

public class ShortestFinder {
    public static void main(String[] args) {
    String[] sample = {"hans","pilgaard", "der", "findes", "monstre"};
    Set<String> sampleList = new HashSet<>(){
        {
            add("Hans");
            add("Pilgaard");
            add("Der");
            add("Findes");
            add("Monstre");
        }
    };
    ShortestFinder sf = new ShortestFinder();
        System.out.println(sf.minLength(sampleList));
    }

    public int minLength(Set<String> set){
        if(set.size() == 0){
            return 0;
        }
        int longest = Integer.MAX_VALUE;
        for(String word : set){
            if(word.length() < longest){
                longest = word.length();
            }
        }
        return longest;
    }
}
