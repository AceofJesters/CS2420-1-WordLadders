public class Queue<E> {
    private LadderNode<E> listHead = new LadderNode<>();
    private LadderNode<E> listTail;
    private int LadderSize;

    public void enqueue(E value){

    }

    public E dequeue(){
        LadderNode<E> node = listHead.next;
        if (listHead.next == null) {
            listTail = listHead;
        } else {
            listHead.next = LadderNode.next;
        }
        LadderSize--;
        return LadderNode.nodeValue;
    }

    public boolean isEmpty(){
        return this.LadderSize == 0;
    }

    public class LadderNode<E> {
        public E nodeValue;
        public LadderNode<E> next;
        public LadderNode() { }
        public LadderNode(E nodeValue) {
            this.nodeValue = nodeValue;
        }
    }
}