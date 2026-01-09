package static1;

public class Data3 {

    // 둘다 멤버변수(필드)인데 그중에서 static 유무에 따라 아래처럼 분리함.
    public String name; // 인스턴스 변수: 인스턴스를 생성해야 사용할 수 있음.
    public static int count; // 클래스 변수: 클래스에 바로 접근해서 사용할 수 있고, 클래스 자체에 소속되어 있다.

    public Data3(String name) {
        this.name = name;
        count++;
    }
}
