### OCP 소스 코드
playCodec.java : 추상 클래스  
파일 이름과 추상 메소드인 play()  
  
AVI.java, MP4.java, MP21.java, WMV.java  
playCodec 클래스를 상속 받고 파일 이름 설정 및 play() 구현  
  
Video_Player.java  
코덱의 종류 설정 및 코덱의 play() 메소드 실행  
  
Main.java  
video_player 객체로 코덱의 종류를 변경하면서 start() 메소드 실행  
