import LinkedListImplementation.LinkedListImp;

public class Main {
    public static void main(String[] args) {
        //lets implement the linked list
        LinkedListImp linkedList = new LinkedListImp();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        System.out.println(linkedList);
        System.out.println(linkedList.sum());
        System.out.println(linkedList.get(2));
        System.out.println(linkedList.contains(4));
        linkedList.clear();
        System.out.println(linkedList);


        /*List<Integer> arrayList = new LinkedList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        int e = arrayList.get(0);
        System.out.println(e);
        System.out.println(arrayList);
        arrayList.remove(1);
        System.out.println(arrayList);
        boolean contains = arrayList.contains(3);
        System.out.println(contains);
        arrayList.clear();
        System.out.println(arrayList);*/
    }
}