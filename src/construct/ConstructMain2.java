package construct;

public class ConstructMain2 {
    static void main() {
        MemberConstruct member1 = new MemberConstruct("user1", 15, 90); // MemberConstruct(여기에 커서 두고 Ctrl + p 하면 매개변수 타입이 나옴 유용함!)
        MemberConstruct member2 = new MemberConstruct("user2", 16); // MemberConstruct(여기에 커서 두고 Ctrl + p 하면 매개변수 타입이 나옴 유용함!)

        MemberConstruct[] members = {member1, member2};

        // 향상된 for문: for (타입 변수명 : 배열또는리스트)
        // 이 구문은 코드를 읽을 때 **"오른쪽에 있는 뭉치(members)에서 하나씩 꺼내서 왼쪽에 있는 변수(member)에 담는다"**라고 해석하면 가장 정확합니다.
        for (MemberConstruct member : members) {
            System.out.println("이름: " + member.name + " 나이: " + member.age + " 성적: " + member.grade);
        }
    }
}
