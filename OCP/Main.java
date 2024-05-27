package OCP;
public class Main {
    public static void main(String[] args) {
        Video_Player video_player = new Video_Player(new MP4());
        video_player.start();
        
        video_player.secCodec(new AVI());
        video_player.start();
    }
}
