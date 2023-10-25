import java.util.Scanner;

public class Main {
    /**
     * This is the test class of our project. There will be created link lists and objects to test it.
     * @param args
     */
    public static void main(String[] args){

        System.out.println("Give first number");

        Scanner scanner = new Scanner(System.in);
        String given1 = scanner.nextLine();
        LongNumber longNumber1 = new LongNumber(given1);

        System.out.println("Give second number");

        String given2 = scanner.nextLine();
        LongNumber longNumber2 = new LongNumber(given2);

        LinkedList linkedList1 = new LinkedList();
        LinkedList linkedList2 = new LinkedList();

        Operations operations = new Operations(longNumber1, longNumber2, linkedList1, linkedList2);

        System.out.println("==== l1 inverted ====");
        System.out.println(linkedList1.toString());

        System.out.println("==== l2 inverted ====");
        System.out.println(linkedList2.toString());

        System.out.println(":::\nPress what operation do you want to use\n 1-Addition (Press 1)\n 2-Subtraction (Press 2)\n 3-Multiplication (Press 3)\n:::");
        int givenInt = scanner.nextInt();

        switch (givenInt){
            case 1:
                System.out.println("==== addition regular ====");
                System.out.println(operations.Addition());
                break;
            case 2:
                System.out.println("==== subtraction regular ====");
                System.out.println(operations.Subtraction());
                break;
            case 3:
                System.out.println("==== multiplication regular ====");
                System.out.println(operations.Multiplication());
                break;
        }
    }
}