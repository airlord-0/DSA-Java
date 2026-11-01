package java_collections;

public class Custom_linked_list {
    Node Head;
    class Node {
        String Data;
        Node Next;
        Node (String Data) {
            this.Data = Data;
            this.Next = null;
        }
    }
    // add first 
    public void addFirst (String Data) {
        Node newNode = new Node(Data);
        if (Head == null) {
            Head = newNode;
        }
        newNode.Next= Head;
        Head = newNode;
        return;
    }
    // add last 
    public void addLast (String Data) {
        Node newNode = new Node (Data);
        if (Head == null) {
            Head = newNode;
            return;
        }
        Node currnode = Head;
        while (currnode.Next != null) {
            currnode = currnode.Next;
        }
        currnode.Next = newNode;
        return;
    }
    // print the list

    public void printlist () {
        if (Head ==null) {
            System.out.println("list is empty");
            return;
        }
       Node currNode = Head;
       while(currNode != null) {
            System.out.println(currNode.Data + " -> ");
            currNode = currNode.Next;
       }
       System.out.println("Null");
       return;
       
    }

    public static void main (String[] args) {
        Custom_linked_list ll = new Custom_linked_list();
        ll.addFirst("pavan");
        ll.addLast ("Kumar");
        //ll.delete();
        ll.printlist();
    }
}