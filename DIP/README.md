### DIP 소스코드
  
Games.java  
게임 제목, 버전을 필드로 갖고 start() 메서드를 갖는 추상 클래스  
  
GameServer.java  
Games의 객체를 받아 게임의 제목과 버전(start())을 출력하는 Game_play() 메서드  
  
LOL.java, Racing.java, SuperMario.java, Tetris.java  
Games.java를 상속 받고 게임 제목과 버전을 returnTitle(), returnVersion() 메서드로 설정  
