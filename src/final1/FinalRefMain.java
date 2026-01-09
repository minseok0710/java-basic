package final1;

public class FinalRefMain {
    static void main() {
        // 변수 선언 시점에 참조값을 할당했으므로 더는 참조값 변경이 불가능하다.
        final Data data = new Data();
        // data = new Data();

        // 참조 대상의 값은 변경 가능
        data.value = 10;
        System.out.println(data.value);
        data.value = 20;
        System.out.println(data.value);
    }
}
