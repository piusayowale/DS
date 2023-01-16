package ds.node;

public class Node {

    public static class TreeNode{
        TreeNode leftNode;
        TreeNode rightNode;

        public TreeNode(){
            leftNode = null;
            rightNode = null;
        }
    }


    private Node next;
    int value;
    public Node(int val){
        this.value = val;
        this.next = null;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
