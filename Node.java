public class Node<L>{
    L val;
    public Node next;

    public Node(L v , Node n){
        this.val = v;
        this.next = n;
    }

    public Node getNext(){
        return this.next;
    }

    public L getVal(){
        return this.val;
    }
}
