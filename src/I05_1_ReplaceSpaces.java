public class I05_1_ReplaceSpaces {

  public static void main(String[] args) {
    String input = "We are happy.";
    //      String input = "We   are happy.";
    //    String input = " We are happy.";
    //    String input = "We are happy. ";
    //    String input = "We";
    System.out.println(new I05_1_ReplaceSpaces().find(input));
  }

  String find(String input) {
    int originalIndex = input.length() - 1;
    int addBlanks = 0;
    for (int i = 0; i < input.length(); i++) {
      if (input.charAt(i) == ' ') {
        addBlanks += 2;
      }
    }
    for (int i = 0; i < addBlanks; i++) {
      input += " ";
    }
    int newlIndex = input.length() - 1;
    char[] inputChar = input.toCharArray();
    while (originalIndex != newlIndex) {
      if (inputChar[originalIndex] != ' ') {
        inputChar[newlIndex] = inputChar[originalIndex];
        newlIndex--;
      } else {
        inputChar[newlIndex--] = '0';
        inputChar[newlIndex--] = '2';
        inputChar[newlIndex--] = '%';
      }
      originalIndex--;
    }
    return String.valueOf(inputChar);
  }
}
