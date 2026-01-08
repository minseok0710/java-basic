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

// 프리픽스 정리

//태그,설명 (언제 쓰는가?),예시
//feat,새로운 기능 추가,feat: 회원 가입 기능 구현
//fix,버그 수정,fix: 로그인 시 NullPointerException 발생 해결
//refactor,기능 변경 없이 코드 구조 개선,refactor: 중복된 입금 로직 제거 및 메서드 추출
//docs,"문서 수정 (README, 주석 등)",docs: 클래스 설명 주석 추가
//style,"코드 포맷팅 (오타, 띄어쓰기 등 로직 영향 X)",style: 줄바꿈 및 들여쓰기 수정
//test,테스트 코드 추가/수정,test: 계좌 이체 테스트 코드 작성