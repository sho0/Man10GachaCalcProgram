import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by sho on 2017/07/18.
 */
public class Main {
    public static void main(String args[]){
        List<Integer> list = new ArrayList<>();
        int[] ints = new int[]{16, 16, 16, 16, 16, 15, 15, 15, 15, 14, 14, 13, 9, 9, 9, 9, 8, 6, 8, 7, 7, 8, 6, 8, 8, 6, 7, 6, 8, 9, 9, 10, 10, 10, 9, 8, 7, 8, 8, 8, 8, 6, 7, 5, 6, 50, 50, 50, 50, 50, 50, 64, 64, 64};
        for(int i = 0;i < 500000000;i++){
            Random r = new Random();
            int res = r.nextInt(54);
            list.add(ints[res]);
        }
        double total = 0;
        for(int i = 0;i < list.size();i++){
            total = total + list.get(i);
        }
        System.out.println(total/list.size()*10000);
    }
}
