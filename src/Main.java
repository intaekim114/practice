import java.util.Arrays;
import java.util.LinkedList;


public class Main {
    public static void main(String[] args) {
        // int 타입만 적재 가능
        LinkedList<Integer> list = new LinkedList<>();

        // 초기값 설정
        LinkedList<Integer> list2 = new LinkedList<Integer>(Arrays.asList(1,2));

        // 가장 앞에 데이터 추가
        list2.addFirst(3);

        // 가장 뒤에 데이터 추가
        list2.addLast(5);

        // index 1에 중간 위치에 데이터 10 추가
        list2.add(1,10);

        //첫 번째 값 제거
        list2.removeFirst();



    }
}