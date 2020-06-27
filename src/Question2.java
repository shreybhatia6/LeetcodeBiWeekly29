import java.util.ArrayList;

public class Question2 {
    public int kthFactor(int n, int k) {

        ArrayList<Integer> al = new ArrayList<Integer>();

        for (int i = 1; i <= n; i++){
            if (n % i == 0){
                al.add(i);
            }
        }
        try {
            return al.get(k-1);
        }
        catch (Exception e){
            return -1;
        }
    }
}
