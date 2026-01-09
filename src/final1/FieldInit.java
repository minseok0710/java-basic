package final1;

public class FieldInit {

    static final int CONST_VALUE = 10;
    final int value = 10;

    // 위의 필드에서 값을 초기화 했기 때문에 생성자로 초기화 못함... 당연한거임
//    public FieldInit(int value) {
//        this.value = value;
//    }
}
