public class BinaryTreeNorm {
    private Node root;

   public BinaryTreeNorm(Node root){
        this.root = root;
    }
    public BinaryTreeNorm(){
        this.root = null;
    }

    public Node insertNorm(Node root, int data){
        Node current = root;
        if(root == null){
            return new Node(data);
        }
        if(data <= root.getData()){
            while(current.left != null){
                current = current.left;
            }
            current.left = new Node(data);
        }
        else{
            while(current.right != null){
                current = current.right;
            }
            current.right = new Node(data);
        }
        return root;
    }

    public Boolean searchNorm(Node root, int data){
        if(root == null){
            return false;
        }

        if(root.getData() == data){
            return true;
        }

        Node current = root;

        while(current != null){
            if(data < current.getData()){
                current = current.left;
            }
            else if(data > current.getData()){
                current = current.right;
            }
            else if(data == current.getData()){
                return true;
            }

        }
        return false;
    }
}
