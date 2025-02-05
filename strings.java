import java.util.*;
public class strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //String s1 = " welcome";
        //String s2 = " to bvrith";
        StringBuffer sb = new StringBuffer("welcome");
        sb.append("helo");
        sb.insert(5,"hi");
        sb.delete(2,5);
        System.out.println(sb);
    }
    
}

