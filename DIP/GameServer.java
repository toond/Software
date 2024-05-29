package DIP;
public class GameServer {
    public Games games;
    // 게임 플레이
    public void Game_Play(Games games) {
        games.start();
    }
}                             