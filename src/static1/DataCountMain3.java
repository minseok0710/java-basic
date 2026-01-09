package static1;

import memory.Data;

public class DataCountMain3 {
    static void main() {

        Data3 data1 = new Data3("A");
        System.out.println("A count= " + Data3.count); // static 변수에 접근. 정적 변수, 클래스 변수라고도 함.

        Data3 data2 = new Data3("B");
        System.out.println("B count= " + Data3.count);

        Data3 data3 = new Data3("C");
        System.out.println("C count= " + Data3.count);
    }
}
