package static2;

import static1.Data1;

public class DecoDataMain {

    static void main() {
        System.out.println("1. 정적 호출");
        DecoData.staticCall();

        System.out.println("2. 인스턴스 호출1");
        DecoData data1 = new DecoData();
        data1.instanceCall();

        System.out.println("3. 인스턴스 호출2");
        DecoData data2 = new DecoData();
        data2.instanceCall();

        DecoData.staticCall(data1); //DecoData.staticCall(x001); 참조값을 넘겨줌.

        //추가
        //인스턴스를 통한 접근: 권장하지 않음.
        DecoData data3 = new DecoData();
        data3.staticCall();

        //클래스를 통한 접근
        DecoData.staticCall();
    }
}
