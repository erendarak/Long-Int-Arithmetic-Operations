public class Node {

    protected int data;      //Data of the node.
    protected Node next;     //Pointer to the next node.

    /**
     * This constructor allow us to create nodes for our linked list.
     * @param data data of the node
     */
    public Node(int data) {
        this.data=data;
    }

    /**
     * Gets the data of the node.
     * @return data
     */
    public int getData() {
        return data;
    }

    /**
     * Gets the next node of the node.
     * @return next
     */
    public Node getNext() {
        return next;
    }

    /**
     * Sets the data of the node.
     * @param data new data
     */
    public void setData(int data) {
        this.data = data;
    }

    /**
     * Sets the next node of the node.
     * @param next new next
     */
    public void setNext(Node next) {
        this.next=next;
    }

    /**
     * ToString method to write our node
     * @return data
     */
    public String toString(){
        return "" + data;
    }
}