import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class interview_3 {

    public static void main(String[] args) {
        int[] intArray = {2, 3, 1, 0, 2, 5, 3};
        List<Integer> answer = new ArrayList<Integer>();
        for(int i = 0; i < intArray.length; i++) {
            int m = intArray[i];
            while (m != i) {
                int tmp = intArray[m];
                if (tmp == m){
                    answer.add(tmp);
                    break;
                } else {
                    // swap
                    intArray[i] = tmp;
                    intArray[m] = m;
                    m = intArray[i];
                }
            }
        }
        System.out.println(answer);
    }
}
