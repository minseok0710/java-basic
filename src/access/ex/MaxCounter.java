package access.ex;

import javax.naming.Name;

public class MaxCounter {

    private int count;
    private int max;

    public MaxCounter(int max) {
        this.max = max;
    }

//    public void increment() {
//        if (count<max) {
//            count++;
//        } else {
//            System.out.println("최대값을 초과하였습니다.");
//        }
//    }

    // 위의 if else문보다 검증로직, 실행로직을 직관적으로 나눠서 가독성을 높임.
    public void increment() {
        if (count >= max) {
            System.out.println("최대값을 초과할 수 없습니다.");
            return;
        }
        count++;
    }

    public int getCount() {
        return count;
    }

}
