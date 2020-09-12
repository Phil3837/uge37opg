import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ContainsThree {
    public static void main(String[] args) {
        List<String> sampleList = new ArrayList<>(){
            {
                add("John");
                add("Frank");
                add("Theodore");
                add("John");
                add("John");
            }
        };
        List<String> sampleList2 = new ArrayList<>(){
            {
                add("John");
                add("Frank");
                add("Theodore");
                add("John");
            }
        };
        System.out.println(c3(sampleList));
        System.out.println(c3(sampleList2));
    }

    public static boolean c3(List<String> list){
        Map<String, Integer> auxMap = new HashMap<>();
        for (String string : list){
            if(!auxMap.containsKey(string)){
                auxMap.put(string,  1);
            } else {
                auxMap.put(string, auxMap.get(string) + 1);
                if(auxMap.get(string) == 3){
                    return true;
                }
            }
        }
        return false;
    }
}
