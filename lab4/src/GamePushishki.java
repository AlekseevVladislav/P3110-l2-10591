public class GamePushishki {
    final String Founder = "Винни Пух";
    private String Gamethings = "Шишки";
    private String GameName = "Пушишки";

    public GamePushishki() {

    }
    public void setGamethings(String things){
        System.out.print("Игре " + this.GameName + " изменили предмет игры с " + this.Gamethings + " на " + things);
        System.out.println("");
        this.Gamethings = things;
    }
    public void setGameName(String gamename){
        System.out.print("Игре " + this.GameName + " изменили название на игра " + gamename);
        System.out.println("");
        this.GameName = gamename;

    }
    public String getFounder(){
        return this.Founder;
    }

    public String getGamethings(){
        return this.Gamethings;
    }

    public String getGameName(){
        return this.GameName;
    }
}
