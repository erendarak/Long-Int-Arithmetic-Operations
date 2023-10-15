public class Operations {
    protected LongNumber firstString;         //First taken number in order to make the operations.
    protected LongNumber secondString;        //Second taken number in order to make the operations.
    protected LinkedList linkedList1;         //First linked list to make operations on it.
    protected LinkedList linkedList2;         //Second linked list to make operations on it.
    int counter1 = 0;                         //Counter1 for the size of the linked list;
    int counter2 = 0;                         //Counter2 for the size of the linked list


    /**
     * This constructor allow us to create our operations class with given longNumbers.
     * @param firstString first long numberr
     * @param secondString second long number
     * @param linkedList1  first linked list
     * @param linkedList2  second linked list
     */
    public Operations(LongNumber firstString, LongNumber secondString, LinkedList linkedList1, LinkedList linkedList2) {
        this.firstString = firstString;
        this.secondString = secondString;
        this.linkedList1 = linkedList1;
        this.linkedList2 = linkedList2;
        Transform();
    }

    /**
     * This is the method that will be used for transforming our long string to have a linked list with every number on its node in reversed form and counts it.
     */
    public void Transform(){

        for(int i = 0; i< firstString.getStringData().length(); i++){
            char tmp1 = firstString.getStringData().charAt(i);
            int tmp11 = tmp1 - '0';
            Node tmp111 = new Node(tmp11);
            linkedList1.insertLast(tmp111);
            counter1++;
        }

        for(int j = 0; j< secondString.getStringData().length(); j++){
            char tmp2 = secondString.getStringData().charAt(j);
            int tmp22 = tmp2 - '0';
            linkedList2.insertLast(new Node(tmp22));
            counter2++;
        }

    }

    /**
     * Addition operator of our operations class. This will take two reversed linked list to start adding them to another linked list (addedList).
     * It checks carry in every operation to avoid exceptional cases.
     */
    public String Addition(){
        int realCounter;
        int carry = 0;
        LinkedList addedList = new LinkedList();

        if(counter1 > counter2){
            realCounter = counter2;
        }
        else {
            realCounter = counter1;
        }

        Node tmp1 = linkedList1.getHead();
        Node tmp2 = linkedList2.getHead();
        for(int i = 1; i <= realCounter; i++){
            int addedInt;
            if(carry==0){
                addedInt = tmp1.getData() + tmp2.getData();
                if(addedInt >= 10){
                    carry=1;
                    addedInt %= 10;
                }else{
                    carry=0;
                }
            }
            else {
                addedInt = tmp1.getData() + tmp2.getData() + 1;
                if(addedInt >= 10){
                    carry=1;
                    addedInt = (addedInt % 10);
                }else{
                    carry=0;
                }
            }
            addedList.insertLast(new Node(addedInt));
            tmp1=tmp1.getNext();
            tmp2=tmp2.getNext();
        }
        if (tmp1 != null){
            additionInputDontMatch(carry, addedList, tmp1);
        } else if (tmp2 != null){
            additionInputDontMatch(carry, addedList, tmp2);
        } else if (tmp1 == null && tmp2 == null && carry == 1){
            addedList.insertLast(new Node(1));
        }

        return addedList.toString();
    }

    /**
     * This method will run if inputs of the linked lists are do not match. It checks whether carry comes from the first adding operation and only adds the more one to the addedList.
     * @param carry  carry
     * @param addedList list that added before
     * @param tmp1 temp node of the linked list
     */
    private void additionInputDontMatch(int carry, LinkedList addedList, Node tmp1) {
        while (tmp1 != null){
            if (carry == 1) {
                addedList.insertLast(new Node(1 + tmp1.getData()));
                carry=0;
            }
            else{
                addedList.insertLast(new Node(tmp1.getData()));
            }
            tmp1 = tmp1.getNext();
        }
    }

    /**
     * Subtraction operator of our operations class.
     * This will take two reversed linked list to start subtracting them to another linked list (subtractedList). It checks minusCarry in every operation to avoid exceptional cases.
     */
    public String Subtraction(){
        int realCounter;
        int minusCarry = 0;
        LinkedList subtractedList = new LinkedList();
        Node tmp1 = null,tmp2 = null;

        if(counter1 > counter2){
            realCounter = counter2;
            tmp1 = linkedList1.getHead();
            tmp2 = linkedList2.getHead();
        }
        else {
            realCounter = counter1;
            tmp1 = linkedList2.getHead();
            tmp2 = linkedList1.getHead();
        }

        for (int i = 1; i <= realCounter; i++){
            int subtractedInt;
            if (minusCarry == -1){
                tmp1.setData(tmp1.data - 1);
                subtractedInt = tmp1.getData() - tmp2.getData();
                if (subtractedInt < 0){
                    subtractedList.insertLast(new Node(subtractedInt + 10));
                    minusCarry = -1;
                }else {
                    subtractedList.insertLast(new Node(subtractedInt));
                    minusCarry = 0;
                }
            }else{
                subtractedInt = tmp1.getData() - tmp2.getData();
                if (subtractedInt < 0){
                    subtractedList.insertLast(new Node(subtractedInt + 10));
                    minusCarry = -1;
                }else {
                    subtractedList.insertLast(new Node(subtractedInt));
                    minusCarry = 0;
                }
            }
            tmp1 = tmp1.getNext();
            tmp2 = tmp2.getNext();
        }
        if (tmp1 != null){
            if (minusCarry == -1){
                tmp1.setData(tmp1.data - 1);
                if (tmp1.getData() < 0){
                    subtractedList.insertLast((new Node(tmp1.getData() + 10)));
                    minusCarry = -1;
                }else{
                    subtractedList.insertLast(new Node(tmp1.getData()));
                    minusCarry = 0;
                }
            }else{
                subtractedList.insertLast(new Node(tmp1.getData()));
            }
        } else if (tmp2 != null){
            if (minusCarry == -1){
                tmp2.setData(tmp2.data - 1);
                if (tmp2.getData() < 0){
                    subtractedList.insertLast((new Node(tmp2.getData() + 10)));
                    minusCarry = -1;
                }else{
                    subtractedList.insertLast(new Node(tmp2.getData()));
                    minusCarry = 0;
                }
            }else{
                subtractedList.insertLast(new Node(tmp2.getData()));
            }
        }
        if (subtractedList.head.getData() == 0 && subtractedList.head.getNext() != null) {
            subtractedList.deleteFirst();
        }
        return subtractedList.toString();
    }

    /**
     * Multiplication operator of our operations class.
     * @param firstString
     * @param secondString
     */
    public void Multiplication(LongNumber firstString, LongNumber secondString){

    }

    /**
     * Division operator of our operations class.
     * @param firstString
     * @param secondString
     */
    public void Division(LongNumber firstString, LongNumber secondString){

    }
}