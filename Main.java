public class Main {
    public static void main(String args[]){
        
        Node root = new Node(8);
        BinaryTree binaryTree = new BinaryTree(root);
        
        binaryTree.insertNorm(root, 3);
        binaryTree.insertNorm(root, 10);
        binaryTree.insertNorm(root, 1);
        binaryTree.insertNorm(root, 6);
        binaryTree.insertNorm(root, 7);
        binaryTree.insertNorm(root, 4);
        binaryTree.insertNorm(root, 14);
        binaryTree.insertNorm(root, 13);
        BinaryTree.preOrder(root);
        
    }
}
