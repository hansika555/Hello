import java.util.*;
public class printN_natural {

    public void printN_natural(int N){  //this is a method
        for(int i=0;i<N;i++){
            System.out.println(i);
        }
    }
}
//write the logic out of the main inside a class
public class Sample2{
    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        printN_natural print = new printN_natural();
        print.printN_natural(n);
    }
}

