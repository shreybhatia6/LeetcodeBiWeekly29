import java.util.ArrayList;

public class Question3 {
    public int longestSubarray(int[] nums) {

        int edgeCase = 0;
        ArrayList <Integer> al = new ArrayList <Integer>();
        ArrayList <Integer> hs = new ArrayList<Integer>();
        int maxVal = -10;

        for (int i : nums){
            al.add(i);
        }


        for (int l = 0; l < al.size(); l++ ){
            if (al.get(l) == 0){
                hs.add(l);
            }
        }

        for (int z = 0; z < hs.size(); z++) {
            int index = hs.get(z);
            al.remove(index);

            if (helperFunction(al) > maxVal) {
                maxVal = helperFunction(al);
            }
            al.add(hs.get(z), 0);
        }
        if (maxVal == -10){
            if (nums [0] == 0) {
                return 0;
            }
            else {
                return nums.length-1;
            }
        }
        return maxVal;
    }

    private static int helperFunction (ArrayList<Integer> arrayList){

        int max = Integer.MIN_VALUE;
        int index = 0;
        int counter = 0;
        while (index < arrayList.size()){
            if (arrayList.get(index) == 1){
                counter++;
                index++;
            }
            else {
                if (counter > max){
                    max = counter;
                    counter = 0;
                    index++;
                }
                else {
                    index++;
                    counter  = 0;
                }
            }
        }
        if (counter > max){
            max = counter;
        }

        return max;
    }
}