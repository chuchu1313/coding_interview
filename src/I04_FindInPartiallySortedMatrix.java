public class I04_FindInPartiallySortedMatrix {

  public static void main(String[] args) {
    int[][] inputArray = {{1, 2, 8, 9}, {2, 4, 9, 12}, {4, 7, 10, 13}, {6, 8, 11, 15}};
    int findNumber = 7;
    System.out.println(new I04_FindInPartiallySortedMatrix().find(inputArray, findNumber));
  }

  boolean find(int[][] inputArray, int findNumber) {
    int col = 0;
    int row = inputArray.length - 1;
    while (row >= 0 && col < inputArray.length) {
      int index = inputArray[col][row];
      if (index == findNumber) {
        return true;
      } else if (findNumber < index) {
        row--;
      } else if (findNumber > index) {
        col++;
      }
    }

    return false;
  }
}
