import java.util.HashMap;

public class HashMapExample{
    public static void main(String[] args){
        HashMap<String, String> map = new HashMap<>(100);
        map.put("movie","Shrek");
        map.put("clothe","Skirt");
        map.put("mall","Sharad City");

        System.out.println(map.get("movie"));

        String s = "Cameron Diaz";
        System.out.println(s.hashCode());
    }
}