import java.util.ArrayList;
import java.util.List;

public class I03_01_DuplicationInArray {

  public static void main(String[] args) {
    int[] inputArray = {2, 3, 1, 0, 2, 5, 3};
    //    int[] inputArray = {2, 3, 1, 0, 4, 5, 6};
    //    int[] inputArray = {};
    System.out.println(new I03_01_DuplicationInArray().getDuplicatedNumbers(inputArray));
  }

  List<Integer> getDuplicatedNumbers(int[] inputArray) {
    List<Integer> answer = new ArrayList<Integer>();
    for (int i = 0; i < inputArray.length; i++) {
      int m = inputArray[i];
      while (m != i) {
        int tmp = inputArray[m];
        if (tmp == m) {
          answer.add(tmp);
          break;
        } else {
          // swap
          inputArray[i] = tmp;
          inputArray[m] = m;
          m = inputArray[i];
        }
      }
    }
    return answer;
  }
}
