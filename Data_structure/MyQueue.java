package Data_structure;

public class MyQueue<T> implements DataStructureInterface<T> {
  private Node<T> head; // 큐의 처음노드
  private Node<T> tail; // 큐의 마지막노드


  public MyQueue() {
    head = tail = null;
  }

  @Override
  public void input(T data) {
    Node<T> newNode = new Node<>(data);
    if (tail != null) {
      tail.next = newNode; // 다음 노드와 연결
      newNode.prev = tail; // 이전 노드와 연결
    }
    tail = newNode;
    if (head == null) {
      head = tail; // 처음 노드 설정
    }
  }  

  @Override
  public T output() {
    if (isEmpty()) {
      System.out.println("큐가 비어있습니다.");
    }
    T data = head.data;
    head = head.next; // 처음 노드를 다음으로 이동
    if (head != null) {
      head.prev = null; // 처음노드의 이전링크 제거
    }
    else{
      tail = null; // 큐가 비어있을 경우 tall도 null로 초기화
    }
    return data;
  }

  @Override
  public void entireprint() {
    Node<T> current = head;
    if (isEmpty()) {
      System.out.println("큐가 비어있습니다.");
    }
    while (current != null) { // 현제값이 null일때까지 데이터를 출력한다.
      System.out.print(current.data + " ");
      current = current.next; // 현제값을 다음 노드로 변경
    }
    System.out.println();
  }

  @Override
  public boolean isEmpty() {
    return head == null;
  }
}


