public class Main {
    public static void main(String[] args) {

     //------------Linked List--------------
    LinkedList<Integer> list=new LinkedList<>();

        list.addNode(70);
        list.addNode(30);
        list.addNode(56);
        list.display();

        list.appendNode(56);
        list.appendNode(30);
        list.appendNode(70);
        list.display();


        list.insertAfter(56,30);
        list.display();

        list.pop();
        list.popLast();
        list.display();

        System.out.println(list.searchValue(30));

        list.insertAfter(30, 40);

        list.delete(40);
        System.out.println(list.size());
        list.display();

        SortedLinkedList<Integer> sorted = new SortedLinkedList<>();
        sorted.add(56);
        sorted.add(30);
        sorted.add(40);
        sorted.add(70);
        sorted.display();


        //--------STACK----------

        Stack<Integer> stack = new Stack<>();
        stack.push(70);
        stack.push(30);
        stack.push(56);
        stack.display();   // 56 -> 30 -> 70


    }


}