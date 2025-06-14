public class Main {
    public static void main(String args[]){
        
        Node root = new Node(20);
        BinaryTree binaryTree = new BinaryTree(root);
        
        binaryTree.insertNorm(root, 17);
        binaryTree.insertNorm(root, 25);
        binaryTree.insertNorm(root, 13);
        binaryTree.insertNorm(root, 18);
        binaryTree.insertNorm(root, 22);
        binaryTree.insertNorm(root, 33);
        binaryTree.insertNorm(root, 10);
        binaryTree.insertNorm(root, 14);
        binaryTree.insertNorm(root, 30);
        binaryTree.insertNorm(root, 45);
        binaryTree.insertNorm(root, 29);
        binaryTree.insertNorm(root, 28);

        Node res = binaryTree.successor(root, 22);
        System.out.println("result: " + res.getData());
    }
}
