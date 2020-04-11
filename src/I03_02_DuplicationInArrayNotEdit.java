public class I03_02_DuplicationInArrayNotEdit {

  public static void main(String[] args) {
    int[] inputArray = {2, 3, 5, 4, 3, 2, 6, 7};
    //    int[] inputArray = {};
    System.out.println(new I03_02_DuplicationInArrayNotEdit().getDuplicated(inputArray));
  }

  int getDuplicated(int[] inputArray) {
    int length = inputArray.length;
    int start = 1;
    int end = length - 1;

    while (end > start) {
      int middle = (start + end) / 2;
      int count = countRange(start, middle, inputArray);
      if (count > (middle - start + 1)) {
        end = middle;
      } else {
        start = middle + 1;
      }
    }
    return end;
  }

  int countRange(int start, int middle, int[] inputArray) {
    int count = 0;
    for (int number : inputArray) {
      if (number >= start && number <= middle) {
        count++;
      }
    }
    return count;
  }
}
