package construct;

public class MemberInit {
    String name;
    int age;
    int grade;

    // 기본 생성자: 매개변수가 없는 생성자, 클래스에 생성자가 하나도 없으면 자바 컴파일러는 매개변수가 없고, 작동하는 코드가 없는 기본 생성자를 자동으로 만들어 준다.(눈에는 보이지 않음)
    // 이 코드를 주석처리해도 기능에 문제가 없다는 뜻.
    MemberInit() {}

    void initMember(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}