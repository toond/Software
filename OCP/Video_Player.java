package OCP;
public class Video_Player {
    public playCodec playcodec;
    
    // 생성자
    public Video_Player(playCodec playcodec) {
        this.playcodec = playcodec;
    }
    // 코덱 설정
    public void secCodec(playCodec playcodec) {
        this.playcodec = playcodec;
    }
    // 파일 재생
    public void start() {
        playcodec.play();
    }
}