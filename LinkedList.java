import java.util.Scanner;

public class LinkedList<L> {
    Node<L> head =null;
    Scanner sc = new Scanner(System.in);
    void SListIterator(int op,Node<L> ele){
        Node<L> tmp;
        switch (op){
            case 1:
               // System.out.println("enter element to be inserted");
                tmp = head;
                if (head == null){
                    head = ele;
                }
                else {
                    while(tmp.getNext() != null){
                        tmp = tmp.getNext();
                    }
                    tmp.next=ele;
                }
                break;

            case 2:
                if (head == null){
                    System.out.println("list is empty");
                    break;
                }
                tmp = head;
                tmp = tmp.getNext();
                head = tmp;
                break;

            case 3:
                if (head == null){
                    System.out.println("list is empty");
                    break;
                }
                if(head.getNext() == null){
                    head = null;
                    break;
                }
                tmp = head;
                while((tmp.getNext()).getNext() != null){
                    tmp = tmp.getNext();
                }
                tmp.next = null;
                break;
            case 4:
                if (head == null){
                    System.out.println("list is empty");
                    break;
                }
                Node<L> tmp2 = head.getNext();
                tmp = head;
                while (tmp2.getVal() != ele.getVal() && tmp2 != null){
                    tmp = tmp.next;
                    tmp2 = tmp2.next;
                }
                if (tmp2 == null){
                    System.out.println("element not found");
                    break;
                }
                tmp.next = tmp2.getNext();
                break;
            case 5:
                tmp = head;
                if (head == null){
                    System.out.println("list is empty");
                    break;
                }
                System.out.println("List contents:");
                while (tmp != null){
                    System.out.println(tmp.getVal());
                    tmp = tmp.getNext();
                }
                break;
            default:
                System.out.println("Invalid Input");
        }
    }
}