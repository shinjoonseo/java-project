package Data_structure;

public interface DataStructureInterface<T> {
  void input(T element); // 데이터 추가
  T output(); // 데이터 출력 및 제거
  void entireprint(); // 저장된 데이터 출력
  boolean isEmpty(); // 비어있는지 확인
}
