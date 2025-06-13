public class Main {
    public static void main(String args[]){
        
        Node root = new Node(3);
        BinaryTree binaryTree = new BinaryTree(root);
        
        binaryTree.insertNorm(root, 4);
        binaryTree.insertNorm(root, 1);
        binaryTree.insertNorm(root, 0);
        binaryTree.insertNorm(root, 2);
        binaryTree.insertNorm(root, 7);
        BinaryTree.preOrder(root);
        System.out.println(binaryTree.searchNorm(root, 6));
    }
}
