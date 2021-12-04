public class LinkedList {
    Node head;

    public void insert(int data){
        Node node = new Node(data);
        if(head == null){
            head = node;
        }
        else {
            Node n = head;
            while (n.node!=null){
                n = n.node;
            }
            n.node=node;
        }
    }

    public void show(){
        Node n = head;
        while (n.node != null){
            System.out.println(n.data);
            n = n.node;
        }
        System.out.println(n.data);
    }
}
