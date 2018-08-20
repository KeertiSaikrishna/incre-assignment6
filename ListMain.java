import java.util.Scanner;

public class ListMain {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<Integer>();
        System.out.println("1)Insert \n2)Remove From first \n3) Remove from last \n4)Remove given element\n5)display list\n6)exit");
        int op;
        Integer e;
        op = sc.nextInt();
        while(op != 6) {
            if (op == 1 || op == 4) {
                e = sc.nextInt();
                Node<Integer> nn = new Node<Integer>(e, null);
                list.SListIterator(op,nn);
            }
            else
                list.SListIterator(op,null);
            System.out.print("enter option again:");
            op = sc.nextInt();
        }
    }
}
