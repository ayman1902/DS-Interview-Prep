import java.util.ArrayList;
import java.util.List;

public class LinkedListImp {
    private NodeImp head;

    public LinkedListImp() {
        this.head = null;
    }
    public void add(int value){
        NodeImp newNode = new NodeImp(value);
        if(head == null){
            head=newNode;
        }else{
            NodeImp temp = head;
            while (temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public String toString() {
        List<Integer> result = new ArrayList<>();
        NodeImp temp = head;
        while (temp != null) {
            result.add(temp.value);
            temp = temp.next;
        }
        return result.toString();
    }
}
