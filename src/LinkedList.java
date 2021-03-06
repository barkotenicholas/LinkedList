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
    public void insertAtStart( int data){
        Node n = head;
        Node node = new Node(data);
        node.node=n;
        head = node;
    }
    public void insertAt(int index,int data){
        Node node = new Node(data);
        node.node=null;
        Node n = head;
        if(index == 0 ){
            insertAtStart(data);
        }else {
            for (int i =0;i<index-1;i++){
                n = n.node;
            }
            node.node = n.node;
            n.node =node;
        }

    }
    public void deleteAt(int index){
        if (index == 0){
            head = head.node;

        }else {
            Node n = head;
            Node n1 = null;
            for (int i =0;i<index-1;i++){
                n = n.node;
            }
            n1= n.node;
            n.node = n1.node;
            n1=null;
        }
    }
}
