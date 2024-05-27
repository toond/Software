package LSP;
public class LecturerNight extends Lecturer{
    public LecturerNight() {
        lecturer = "야간 강사";
    }
    public void lecturer() {
        System.out.println(lecturer);
        System.out.println("강사료 : " + (int)(charge * 1.5) + "원\n");
    }
}
