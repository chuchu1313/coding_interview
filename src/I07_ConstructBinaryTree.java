import java.util.Arrays;

public class I07_ConstructBinaryTree {

  public static void main(String[] args) {
    int[] preOrder = {1, 2, 4, 7, 3, 5, 6, 8};
    int[] inOrder = {4, 7, 2, 1, 5, 3, 8, 6};
    //    BinaryTreeNode node = new I07_ConstructBinaryTree().constuctBinaryTree(preOrder, inOrder);
    BinaryTreeNode node = new I07_ConstructBinaryTree().constuctBinaryTree(preOrder, inOrder);
    System.out.println(node);
  }

  private BinaryTreeNode constuctBinaryTree(int[] preOrder, int[] inOrder) {
    if (preOrder.length == 0) return null;
    int root = preOrder[0]; // root
    int rootIndex = 0;
    for (int i = 0; i < inOrder.length; i++) {
      if (inOrder[i] == root) {
        rootIndex = i;
        break;
      }
    }
    BinaryTreeNode leftNode =
        constuctBinaryTree(
            Arrays.copyOfRange(preOrder, 1, rootIndex + 1),
            Arrays.copyOfRange(inOrder, 0, rootIndex));
    BinaryTreeNode rightNode =
        constuctBinaryTree(
            Arrays.copyOfRange(preOrder, rootIndex + 1, preOrder.length),
            Arrays.copyOfRange(inOrder, rootIndex + 1, inOrder.length));
    return new BinaryTreeNode(leftNode, rightNode, root);
  }
}

class BinaryTreeNode {
  BinaryTreeNode leftNode;
  BinaryTreeNode rightNode;
  int value;

  BinaryTreeNode(BinaryTreeNode leftNode, BinaryTreeNode rightNode, int value) {
    this.leftNode = leftNode;
    this.rightNode = rightNode;
    this.value = value;
  }
}
