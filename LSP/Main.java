package LSP;
public class Main {
    public static void main(String[] args) {
        Lecturer lect01 =  new LecturerAtGS();
        lect01.lecturer();

        Lecturer lect02 =  new LecturerNight();
        lect02.lecturer();

        Lecturer lect03 =  new LecturerWithWork();
        lect03.lecturer();

        Lecturer lect04 =  new LecturerNormal();
        lect04.lecturer();
    }
}