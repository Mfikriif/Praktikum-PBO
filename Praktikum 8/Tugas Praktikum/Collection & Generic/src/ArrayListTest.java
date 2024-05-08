import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("Praktikum");
        strings.add("collection");
        strings.add("dan generics");

        strings.remove("Praktikum");

        for(String s : strings){
            System.out.println(s + " ");
        }
        
        System.out.println("==============");

        Map<Integer,String> map = new HashMap<Integer,String>();
        map.put(1, "satu");
        map.put(2, "dua");  
        
        
        System.out.println(map.get(1));
        
        Set<Integer> key = map.keySet();
        
        for(Integer a : key){
            System.out.println(map.get(a) + " ");
        }
    }
    
}