import java.io.IOException;
public abstract class Character {
    private String Name;
    private Moodes Mood;
    private String State;
    private int Wins;
    private int Loses;
    private boolean CanPlay = false;

    public Character(){

    }

    public String getName(){
        return this.Name;
    }

    public String getState(){
        return this.State;
    }

    public Moodes getMood(){
        return this.Mood;
    }

    public int getWins(){
        return this.Wins;
    }

    public int getLoses(){
        return this.Loses;
    }

    public int wins() { return this.Wins; }

    public boolean getCanPlay(){
        return this.CanPlay;
    }

    public void WinsCount() {
        int wincounts;
        wincounts = this.getWins() - this.getLoses();
        if(wincounts>0){
            System.out.println(this.getName() + ": Победил. В плюсе на " + wincounts + " игр.");
        }
        else{
            wincounts*=-1;
            System.out.println(this.getName() + ": Проиграл. В минусе на " + wincounts + " игр.");
        }
    }
    public void setName(String name) throws GotTrublesException{
        if(this.Name != ""){
            this.Name = name;
        }
        else{
            throw new GotTrublesException("У этого персонажа есть имя");
        }
    }

    public void setLoses(int loses){
        this.Loses = loses;
    }

    public void setWins(int wins){
        this.Wins = wins;
    }

    public void setMood(Moodes mood){
        this.Mood = mood;
    }

    public void setState(String state){
        this.State = state;
    }

    public void setCanPlay(Boolean canPlay) throws NoPlayException{
        if(this.CanPlay == false){
            this.CanPlay = canPlay;
        }
        else{
             throw new NoPlayException("Уже умеет играть в Пустяки");
        }
    }
    public String toString() {
        return "Имя " + this.getName() + " Настроение " + this.getMood() + " Состояние " +this.getState();
    }
    public void getmove(){}

}
