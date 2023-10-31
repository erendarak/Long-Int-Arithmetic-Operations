public class Main {
    /**
     * This is the test class of our project. There will be created link lists with given long numbers in it and 4 operations to test them.
     * @param args
     */
    public static void main(String[] args){

        System.out.println("-------------------------------------------------------------------");

        String given1 = "3";
        LongNumber longNumber1 = new LongNumber(given1);

        System.out.println("Given number 1: " + given1);

        String given2 = "5";
        LongNumber longNumber2 = new LongNumber(given2);

        System.out.println("Given number 2: " + given2);

        LinkedList linkedList1 = new LinkedList();
        LinkedList linkedList2 = new LinkedList();

        Operations operations = new Operations(longNumber1, longNumber2, linkedList1, linkedList2);

        System.out.println("==== linkedList1 reversed ====");
        System.out.println(linkedList1.toString());
        System.out.println("==== linkedList2 reversed ====");
        System.out.println(linkedList2.toString());

        System.out.println("==== Multiplication ====");
        System.out.println(operations.Multiplication());

        System.out.println("==== Addition ====");
        System.out.println(operations.Addition());

        System.out.println("==== Subtraction ====");
        System.out.println(operations.Subtraction());

        System.out.println("==== Division ====");
        System.out.println(operations.Division(7));


        System.out.println("-------------------------------------------------------------------");

        String given3 = "350";
        LongNumber longNumber3 = new LongNumber(given3);

        System.out.println("Given number 3: " + given3);

        String given4 = "500";
        LongNumber longNumber4 = new LongNumber(given4);

        System.out.println("Given number 2: " + given4);

        LinkedList linkedList3 = new LinkedList();
        LinkedList linkedList4 = new LinkedList();

        Operations operations2 = new Operations(longNumber3, longNumber4, linkedList3, linkedList4);

        System.out.println("==== linkedList3 reversed ====");
        System.out.println(linkedList3.toString());
        System.out.println("==== linkedList4 reversed ====");
        System.out.println(linkedList4.toString());

        System.out.println("==== Multiplication ====");
        System.out.println(operations2.Multiplication());

        System.out.println("==== Addition ====");
        System.out.println(operations2.Addition());

        System.out.println("==== Subtraction ====");
        System.out.println(operations2.Subtraction());

        System.out.println("==== Division ====");
        System.out.println(operations2.Division(7));

        System.out.println("-------------------------------------------------------------------");

        String given5 = "827949805639068390489568982794980563906839048956898279498056390683904895689827949805639068390489568982794980563906839048956898279498056390683904895689827949805639068390489568982794980563906839048956898279498056390683904895689827949805639068390489568982794980563906839048956898279498056390683904895689827949805639068390489568982794980563906839048956898279498056390683904895689827949805639068390489568982794980563906839048956898279498056390683904895689827949805639068390489568982794980563906839048956898279498056390683904895689827949805639068390489568982794980563906839048956898279498056390683904895689827949805639068390489568982794980563906839048956898279498056390683904895689827949805639068390489568982794980563906839048956898279498056390683904895689827949805639068390489568982794980563906839048956898279498056390683904895689827949805639068390489568982794980563906839048956898279498056390683904895689827949805639068390489568982794980563906839048956898279498056390683904895689827949805639068390489568982794980563906839048956898279498056390683904895689827949805639068390489568982794980563906839048956898279498056390683904895689";
        LongNumber longNumber5 = new LongNumber(given5);

        System.out.println("Given number 5: " + given5);

        String given6 = "8279498056390683904895689";
        LongNumber longNumber6 = new LongNumber(given6);

        System.out.println("Given number 6: " + given6);

        LinkedList linkedList5 = new LinkedList();
        LinkedList linkedList6 = new LinkedList();

        Operations operations3 = new Operations(longNumber5, longNumber6, linkedList5, linkedList6);

        System.out.println("==== linkedList5 reversed ====");
        System.out.println(linkedList5.toString());
        System.out.println("==== linkedList6 reversed ====");
        System.out.println(linkedList6.toString());

        LinkedList linkedList7 = new LinkedList();
        LinkedList linkedList8 = new LinkedList();

        Operations operations4 = new Operations(longNumber5, longNumber6, linkedList7, linkedList8);

        System.out.println("==== Addition ====");
        System.out.println(operations4.Addition());

        System.out.println("==== Multiplication ====");
        System.out.println(operations3.Multiplication());

        System.out.println("==== Subtraction ====");
        System.out.println(operations4.Subtraction());

        System.out.println("==== Division ====");
        System.out.println(operations3.Division(7));





        String given7 = "1000";
        LongNumber longNumber7 = new LongNumber(given7);
        LinkedList linkedList9 = new LinkedList();
        int divisor = 2;

        Operations operations5 = new Operations(longNumber7, linkedList9);
        System.out.println(operations5.Division(divisor));
    }
}