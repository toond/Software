package DIP;
public abstract class Games {
    public String title, version; // 게임 제목, 버전
    // 게임 스타트
    public void start() {
        System.out.println("게임명 : " + title);
        System.out.println("버전 : " + version);
        System.out.println(title + "을(를) 시작합니다.\n");
    }
}