package Data_structure;
import java.util.Arrays;
public class MyStack<T> implements DataStructureInterface<T>{
    private Node<T> top; // 마지막 노드

    public MyStack() { 
        top = null;
    }

    @Override
    public void input(T data) {
        Node<T> newNode = new Node<>(data);
        if (top != null) {
            top.next = newNode; // 다음 노드와 연결
            newNode.prev = top; // 이전 노드와 연결
        }
        top = newNode;
    }

    @Override
    public T output() {
        if (isEmpty()) {
            System.out.println("스택이 비어있습니다.");
        }
        T data = top.data;
        if (top.prev != null) {
            top = top.prev;
        }
        else {
            top = null;
        }
        return data;
    }

    @Override
    public void entireprint() {
        Node<T> current = top;
        while(current != null && current.prev != null) {
            current = current.prev;
        }
        while (current != null) {
                // 배열인지 확인하고 배열에 맞는 방법으로 출력
            if (current.data instanceof int[]) {
                System.out.print(Arrays.toString((int[]) current.data) + " ");
            } 
            else if (current.data instanceof Object[]) {
                System.out.print(Arrays.toString((Object[]) current.data) + " ");
            } 
            else {
                System.out.print(current.data + " ");
            }
            current = current.next;
        }
        System.out.println();
    }

    @Override
    public boolean isEmpty() {
        if (top != null) {
            return false;
        }
        return true;
    }


}

