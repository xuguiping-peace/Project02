import com.atxuguiping.Customer;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author xuguiping
 * @create 2021-03-03-19:09
 */
public class Temples {

    //模板六：prsf可生成private static final---私有的全局常量
    //定义类时候会定义一些属性，属性比较特别，ctrl+shift+Y调整大小写
    private static final Customer CUST=new Customer();
    //psf
    public static final int NUMBER=1;
    //psfi
    public static final int int_numY=10;
    //psfs
    public static final String STR="CHIAN";

    public static void main(String[] args) {

        //模板二  sout
        System.out.println("hello");
        //soutp
        System.out.println("args = " + Arrays.deepToString(args));
        //soutm
        System.out.println("Temples.main");
        //soutv
        int num1=10;
        System.out.println("num1 = " + num1);
        int a=10;
        int b=10;
        System.out.println("b = " + b);


        //模板三fori
        String[] arr=new String[]{"TOM","Jerry","hanwei","lisi"};
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
        //iter
        for (String s : arr) {
            System.out.println(s);
        }
        //itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }
        //模板四-集合的遍历-list.for
        ArrayList list=new ArrayList();
        list.add(123);
        list.add(139);
        list.add(13);
        for (Object o : list) {

        }
        //list.fori
        for (int i = 0; i < list.size(); i++) {

        }
        //list.forr
        for (int i = list.size() - 1; i >= 0; i--) {

        }


    }
    //模板五：ifn
    public void ifn(){
        //soutm
        System.out.println("Temples.ifn");
        ArrayList list=new ArrayList();
        list.add(123);
        list.add(933);
        list.add(932);
        list.add(102);
        //ifn
        if ( list== null) {

        }
        //inn
        if (list != null) {

        }
        //xxx.nn//xxx.null
        if (list != null) {

        }
        if (list == null) {

        }
    }
    //模板六：prsf可生成private static final---私有的全局常量
    //定义类时候会定义一些属性，属性比较特别，
    public void staticfinal(){
       //出错！！！！！！！ EPRSDDocumentFilter
    }
}
