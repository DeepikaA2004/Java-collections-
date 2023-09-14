import java.util.Map;
import java.util.TreeMap;

public class MyMap {
    public static void main(String[] args){
        Map<String,Integer> map = new TreeMap<>();
        map.put("BMW M3" , 360);
        map.put("Audi A6" , 340);
        map.put("Mercedes Q3" , 320);
        map.put("Swarajmazda" , 420);
        map.forEach((key,value)--> System.out.println(key + "--->" + value));
    }
}