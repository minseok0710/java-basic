package static2;

public class DecoData {

    private int instanceValue; // 인스턴스 변수는 인스턴스가 생성되어야 나타남. 그래서 스태틱 메서드는 없는 변수에 접근할 수 없는거임. 접근하려면 참조값이 있어야 함...
    private static int staticValue;

    public static void staticCall() {
        //instanceValue++; // 인스턴스 변수 접근,  컴파일 에러
        //instanceMethod(); // 인스턴스 메서드 접근, 컴파일 에러

        staticValue++; // 정적 변수 접근
        staticMethod(); // 정적 메서드 접근
    }

    public static void staticCall(DecoData data) {  // 참조값을 받기 때문에 static 메서드이던 아니던 관계없이 인스턴스 변수와 메서드에 접근이 가능.
        data.instanceValue++;
        data.instanceMethod();
    }

    public void instanceCall() {
        instanceValue++; // 인스턴스 변수 접근
        instanceMethod(); // 인스턴스 메서드 접근

        staticValue++; // 정적 변수 접근
        staticMethod(); // 정적 메서드 접근
    }

    private void instanceMethod(){
        System.out.println("instanceValue=" + instanceValue);
    }

    private static void staticMethod() {
        System.out.println("staticValue=" + staticValue);
    }
}
