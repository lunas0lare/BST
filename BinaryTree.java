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

    public Node successor(Node root, int data){
        if(root == null) return null;

        Node current = root;
        Node successor = null;

        while (true) { 
            if(current.getData() > data){
                successor = current;
                current = current.left;
            if(current.getData() == data && successor.getData() > data) return successor;
            }
            if(current.getData() < data){
                current = current.right;//not update successor here because element in right subtree is smaller
            }
            if(current.getData() == data) break;
        }  

            Node temp = current.right;
            if(temp != null){
            while(temp.left != null){
                temp = temp.left;
            }
            return temp;
            }
            return successor;
    }
    public static void preOrder(Node root){
        if(root == null) return;
        System.out.println(root.getData());
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void inOrder(Node root){
        if(root == null) return;
        inOrder(root.left);
        System.out.println(root.getData());
        inOrder(root.right);
    }
}