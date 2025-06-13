public class BinaryTree{
    private Node root;

    public BinaryTree(Node root){
        this.root = root;
    }
    public BinaryTree(){
        this.root = null;
    }
    
    public Node insert(Node root, int data){
        if(root == null){
            return new Node(data);
        }

        if(data <= root.getData()){
            root.left = insert(root.left, data);
        }
        else{
            root.right = insert(root.right, data);
        }

        return root;
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

    public Boolean search(Node root, int data){
        if(root == null){
            return false;
        }

        if(root.getData() == data){
            return true;
        }
        if(data <= root.getData()){
            return search(root.left, data);
        }
        else{
            return search(root.right, data);
        }
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
    public static void preOrder(Node root){
        if(root == null) return;
        System.out.print(root.getData());
        preOrder(root.left);
        preOrder(root.right);
    }
}