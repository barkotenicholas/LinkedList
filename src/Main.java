public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.insert(12);
        linkedList.insert(13);
        linkedList.insert(14);
        linkedList.insertAtStart(11);
        linkedList.insertAt(0,55);
        linkedList.deleteAt(1);
        linkedList.show();
    }
}
