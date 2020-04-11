import java.util.Arrays;

public class I05_2_CombineTwoArrays {

  public static void main(String[] args) {
    int[] input1 = {1, 4, 8, 10, -1, -1, -1, -1};
    int[] input2 = {1, 5, 8, 9};

    System.out.println(new I05_2_CombineTwoArrays().sort(input1, input2));
  }

  private String sort(int[] input1, int[] input2) {
    int input1Length = 0;
    for (int i = 0; i < input1.length; i++) {
      if (input1[i] != -1) {
        input1Length++;
      } else {
        break;
      }
    }
    int input2Length = input2.length;
    int index1 = input1Length - 1;
    int index2 = input2Length - 1;
    int newIndex1 = input1Length + input2Length - 1;
    System.out.println(input1Length);
    System.out.println(input2Length);
    System.out.println(newIndex1);
    while (index1 >= 0 && index2 >= 0) {
      if (input1[index1] >= input2[index2]) {
        input1[newIndex1--] = input1[index1--];

      } else {
        input1[newIndex1--] = input2[index2--];
      }
    }
    if (index1 > 0) {
      for (int i = index1; i >= 0; i--) {
        input1[newIndex1--] = input1[i];
      }
    }
    if (index2 > 0) {
      for (int i = index2; i >= 0; i--) {
        input1[newIndex1--] = input2[i];
      }
    }

    return Arrays.toString(input1);
  }
}
