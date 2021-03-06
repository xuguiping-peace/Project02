import java.util.HashMap;

/**
 * @author xuguiping
 * 2021-03-06-10:54
 */
public class DbugTest {
    public static void main(String[] args) {
        HashMap<String,String> map=new HashMap<>();
        map.put("name","Tom");
        map.put("age","18");
        map.put("school","yizhong");
        map.put("class","computer");
        String age=map.get("age");
        System.out.println("age="+age);
        System.out.println(map);
    }
}
