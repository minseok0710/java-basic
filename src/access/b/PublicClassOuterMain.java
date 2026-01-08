package access.b;

import access.a.PublicClass;

public class PublicClassOuterMain {

    static void main() {
        PublicClass publicClass = new PublicClass();

        // 다른 패키지 접근 불가
//        DefaultClass1 class1 = new DefaultClass1();
    }
}
