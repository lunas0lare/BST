public class Node {
    private int data;
    public Node left, right;

    public Node(int data){
        this.data = data;
        left = right = null;
    }

    public Node(){
        this.data = 0;
        left = right = null;
    }
    public int getData(){
        return this.data;
    }

    public void setData(int data){
        this.data = data;
    }
}
