package ref;

public class NullMain4 {
    static void main() {
        BigData bigData = new BigData();
        bigData.data = new Data(); // 참조 추가
        System.out.println("bigData.count= " + bigData.count);
        System.out.println("bigData.data= " + bigData.data);

        System.out.println(bigData.data.value); // NullPointerException 해결

    }
}
