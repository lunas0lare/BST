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
        while(true){
            if(data <= current.getData()){
                if(current.left == null){
                    current.left = new Node(data);
                    return root;
                }
                 current = current.left;
            }
            else if(data > current.getData()){
                if(current.right == null){
                    current.right = new Node(data);
                    return root;
                }current = current.right;
                
            }
            else break;

        }
        return root;
    }

     public Node successor(Node root, int data){
        if(root == null) return null;

        Node current = root;
        Node successor = current;
        while(current.getData() > data){
            successor = current;
            current = current.left;
            if(current.getData() <= data) return successor;
        }

        while(current.getData() < data){
            successor = current;
            current = current.right;
        }
           
            Node temp = current.right;
            if(temp == null) return null;
            while(temp.left != null){
                temp = temp.left;
            }
            return temp;
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
