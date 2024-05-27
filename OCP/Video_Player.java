package OCP;
public class Video_Player {
    public playCodec playcodec;
    
    public Video_Player(playCodec playcodec) {
        this.playcodec = playcodec;
    }

    public void secCodec(playCodec playcodec) {
        this.playcodec = playcodec;
    }

    public void start() {
        playcodec.play();
    }
}
