
class Main {
  public static void main(String[] args) {

    BST<Integer> lab5Tree = new BST<>();

    int[] values = {13, 22, 36, 5, 48, 17, 39, 2, 26, 40, 29, 34, 10};

    for (int value : values) {
      lab5Tree.insert(value);
    }

    lab5Tree.delete(17);

    System.out.println("Inorder:");
    lab5Tree.inorder();

    System.out.println("\nPostorder:");
    lab5Tree.postorder();

    System.out.println("\nPreorder:");
    lab5Tree.preorder();

    System.out.println("\n\nSearch for 36: " + lab5Tree.search(36));
    System.out.println("Search for 37: " + lab5Tree.search(37));

    System.out.println("\nPath to 2:");
    for (BST.TreeNode<Integer> node : lab5Tree.path(2)) {
      System.out.print(node.element + " ");
    }

    System.out.println("\nPath to 34:");
    for (BST.TreeNode<Integer> node : lab5Tree.path(34)) {
      System.out.print(node.element + " ");
    }
  }
}
