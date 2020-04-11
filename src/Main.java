import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] intArray = {2, 3, 1, 0, 2, 5, 3};
        System.out.println(Arrays.toString(intArray));
        String answer = "";
        for(int i = 0; i < intArray.length; i++) {
            int m = intArray[i];
            while (m != i) {
                int tmp = intArray[m];
                if (tmp == m){
                    answer += tmp + ",";
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
