public class Queue<E> {
    private LadderNode<E> listHead = new LadderNode<>();
    private LadderNode<E> listTail;
    private int LadderSize;

    public void enqueue(E value){
        LadderNode<E> node = new LadderNode<>(value);
        LadderNode<E> current = listHead.next;
        LadderNode<E> previous = listHead;

        while (current != null) {
            previous = current;
            current = current.next;
        }

        previous.next = node;
        node.next = null;
        listTail = node;
        LadderSize++;
    }

    public E dequeue(){
        LadderNode node = listHead.next;
        if (listHead.next == null) {
            listTail = listHead;
        } else {
            listHead.next = LadderNode.next;
        }
        LadderSize--;
        return (E) LadderNode.nodeValue;
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