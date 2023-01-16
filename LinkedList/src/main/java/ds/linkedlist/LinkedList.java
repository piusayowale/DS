package ds.linkedlist;
import ds.node.*;
import java.lang.Runnable;

import java.util.concurrent.Callable;
import java.util.function.Function;


public class LinkedList {

    public abstract static class Callback implements Runnable{

        private int value;
        public Callback(){
            this.value = 0;
        }
        public void setValue(int val){
            this.value = val;
        }
        public int getValue(){
            return this.value;
        }

    }
    private Node root;

    public LinkedList(){
        root = null;
    }
    public void init(int value){
        this.root = new Node(value);
    }
    public void insert(int value){
        Node temp = root;
        while (temp.getNext() != null){
            temp = temp.getNext();
        }
        temp.setNext(new Node(value));
    }

    public void map(Callback call){
        Node temp = root;
        while (temp != null){
            call.setValue(temp.getValue());
            call.run();
            temp = temp.getNext();
        }
    }


}
