public class LinkedList {

    protected Node head;      //Head of our linked list;
    protected Node tail;      //Tail of our linked list;

    /**
     * This constructor creates a linked list;
     */
    public LinkedList() {
        head = null;
        tail = null;
    }

    /**
     * This method checks our linked list is empty or not.
     * @return is empty or not
     */

    public boolean isEmpty(){
        return head == null;
    }

    /**
     * This method takes the given node (newNode) and adds it to the last position of the linked list.
     * @param newNode given node
     */
    public void insertLast(Node newNode) {
        if (isEmpty()) {
            tail = newNode;
        }
        newNode.setNext(head);
        head = newNode;
    }

    /**
     * This method takes the given node (newNode) and adds it to the first position of the linked list.
     * @param newNode  given node
     */
    public void insertFirst(Node newNode) {
        if (isEmpty()) {
            head = newNode;
        } else {
            tail.setNext(newNode);
        }
        tail = newNode;
    }

    /**
     * This method runs among the linked list and counts it.
     * @return  counted number
     */
    public int numberOfElements(){
        Node tmp = head;
        int count = 0;
        while (tmp != null) {
            count++;
            tmp = tmp.getNext();
        }
        return count;
    }

    /**
     * This is the toString method of our linked list. (override)
     * @return string version of the list
     */
    public String toString(){
        String tmp1 ="";
        Node tmp = head;
        while (tmp != null) {
            tmp1=tmp1+tmp.toString();
            tmp = tmp.getNext();
        }
        return tmp1;
    }

    /**
     * This method deletes the head of the linked list.
     */
    public void deleteFirst(){
        head = head.getNext();
        if(head == null){
            tail = null;
        }
    }

    public void reverseList(LinkedList linkedList) {
        Node previous = null;
        Node current = linkedList.getHead();
        Node next;
        while(current != null){
            next = current.getNext();
            current.setNext(previous);
            previous = current;
            current = next;
        }
        linkedList.setHead(previous);
    }

    public int getNodeI (int i){
        Node temp = head;
        int index = 0;
        while (temp != null) {
            if (index == i) {
                return temp.getData();
            }
            index++;
            temp = temp.getNext();
        }
        return 0;
    }

    public void setDigit(int index, int value) {
        Node current = head;
        int currentIndex = 0;
        while (current != null && currentIndex < index) {
            current = current.next;
            currentIndex++;
        }
        if (current != null) {
            current.data = value;
        }
    }

    public Node getPrevious(Node node){
        Node temp = head;
        Node previous = null;
        while (temp != node) {
            previous = temp;
            temp=temp.getNext();
        }
        return previous;
    }

    public void deleteLast(){
        tail = getPrevious(tail);
        if(tail != null){
            tail.setNext(null);
        } else {
            head = null;
        }
    }

    /**
     * Gets the head of the linked list.
     * @return head
     */
    public Node getHead() {
        return head;
    }

    /**
     * Sets the head of the linked list.
     * @param head new head
     */
    public void setHead(Node head) {
        this.head = head;
    }

    /**
     * Gets the tail of the linked list.
     * @return tail
     */
    public Node getTail() {
        return tail;
    }

    /**
     * Sets the tail of the linked list.
     * @param tail new tail
     */
    public void setTail(Node tail) {
        this.tail=tail;
    }
}