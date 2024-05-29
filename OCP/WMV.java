package OCP;
public class WMV extends playCodec{
    public WMV() {
        File = "WMV";
    }
    // 파일 재생
    public void play() {
        System.out.println(File  + "을(를) 재생합니다.");
    }
}
