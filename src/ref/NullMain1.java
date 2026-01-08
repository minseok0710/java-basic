package ref;

public class NullMain1 {

    static void main() {
        Data data = null;
        System.out.println("1. data = " + data);
        data = new Data();
        System.out.println("2. data = " + data);
//        data.value=10;
//        System.out.println(data.value);
        data = null;
        System.out.println("3. data = " + data);
        System.out.println(data.value); // NullPointerException 예외 발생

    }
}
