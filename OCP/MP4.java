package OCP;
public class MP4 extends playCodec {
    public MP4() {
        File = "MP4";
    }
    // 파일 재생
    public void play() {
        System.out.println(File  + "을(를) 재생합니다.");
    }
}