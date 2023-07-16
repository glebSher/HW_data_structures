public class Main {
    public static void main(String[] args) {

        linkedList list = new linkedList();
        list.add(3);
        list.add(5);
        list.add(1);
        list.add(8);
        list.add(4);

        list.print();
        System.out.println();
        list.revert();
        list.print();
    }
}
