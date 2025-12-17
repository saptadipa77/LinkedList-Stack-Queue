public class Main {
    public static void main(String[] args) {
    LinkedList<Integer> list=new LinkedList<>();

        list.addNode(70);
        list.addNode(30);
        list.addNode(56);

        list.appendNode(56);
        list.appendNode(30);
        list.appendNode(70);

        list.insertAfter(56,30);

        list.pop();
        list.popLast();
    }


}