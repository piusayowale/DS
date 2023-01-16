package ds.core;
import  ds.node.*;

import ds.linkedlist.*;

public class Core {
    public static void main(String[] args){
        System.out.println("Work\n\n");
        Node head = new Node(5);
        head.setNext(new Node(6));

       /* Node temp = head;
        while (temp != null){
            System.out.println(temp.getValue() + "\n");
            temp = temp.getNext();
        }*/

        /*LinkedList list = new LinkedList();
        list.init(7);
        list.insert(6);
        list.insert(8);

        list.map(new LinkedList.Callback() {
            @Override
            public void run() {
                System.out.println(this.getValue());
            }
        });*/

        Node.TreeNode node = new Node.TreeNode(5);
        node.insert(6);
        node.insert(7);
        node.insert(1);
        node.transverse(node.getRoot());
    }
}
