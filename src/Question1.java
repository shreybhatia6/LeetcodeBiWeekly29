public class Question1 {

    public double average(int[] salary) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i : salary){
            if (min > i)
                min = i;
        }

        for (int z : salary){
            if (max < z)
                max = z;
        }

        double sum = 0;
        int count = 0;

        for (int k =0; k < salary.length; k++){
            if (!(salary[k] == min || salary[k] == max)){
                sum+=salary[k];
                count++;
            }
        }
        return (double) sum / count;

    }
}
