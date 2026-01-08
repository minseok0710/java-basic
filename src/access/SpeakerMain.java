package access;

public class SpeakerMain {
    static void main() {
        Speaker speaker = new Speaker(90);
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        // 필드에 직접 접근 (필드를 private으로 변경해서 직접 접근 제한)
//        speaker.volume = 200;
//        speaker.showVolume();
    }
}
