import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;

public class Queue<E> {

    public void enqueue(E value){

    }

    public E dequeue(){

        return null;
    }

    public boolean isEmpty(){

        return false;
    }

    public class LadderNode<E> {
        public E nodeValue;
        public LadderNode<E> next;

        public LadderNode() { }
        public LadderNode(E nodeValue) {
            this.nodeValue = nodeValue;
        }
    }
    //Use a linked list for the internal queue data representation.  You must write this linked list code yourself,
    // may not use a Java collection that already provides linked list or queue-like functionality.
}