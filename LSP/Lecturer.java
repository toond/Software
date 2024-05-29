package LSP;
public abstract class Lecturer {
    public Lecturer() {
        System.out.println("[리스코프 교체의 원칙]\n");
    }
    public String lecturer;     // 강사 종류
    public int charge = 90000;  // 강사 비용

    // 추상 메소드
    public void lecturer() {}
}