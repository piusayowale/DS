package ds.node;


import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class Node {

    public static class TreeNode{
        int value;
        TreeNode leftNode;
        TreeNode rightNode;

        public TreeNode(int val){
            this.value = val;
            leftNode = null;
            rightNode = null;
        }
        public void insert(int value){
            if(leftNode == null && rightNode == null){
                leftNode = new TreeNode(value);
                return;
            }

            LinkedBlockingQueue<TreeNode> nodes = new LinkedBlockingQueue<TreeNode>();
            nodes.add(this);

            while (!nodes.isEmpty()){
                TreeNode temp = nodes.remove();

                if (temp.leftNode != null)
                    nodes.add(temp.leftNode);
                else {
                    temp.leftNode = new TreeNode(value);
                    return;
                }

                if (temp.rightNode != null)
                    nodes.add(temp.rightNode);
                else {
                    temp.rightNode = new TreeNode(value);
                    return;
                }

            }

        }
        public TreeNode getRoot(){
            return this;
        }
        public void transverse(TreeNode node){
            if (node == null)
                return;

            transverse(node.leftNode);

            System.out.println(node.value);

            transverse(node.rightNode);
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
