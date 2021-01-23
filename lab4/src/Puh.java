import java.util.Objects;
import java.io.IOException;

public class Puh extends Character{
    private String Place;
    public Puh(String Name, Moodes Mood, String State, String Place, int Wins, int Loses){
        this.setName(Name);
        this.setMood(Mood);
        this.setState(State);
        this.setPlace(Place);
        this.setWins(Wins);
        this.setLoses(Loses);

    }

    public void setPlace(String Place){
        this.Place = Place;
    }
    public String getPlace(){
        return this.Place;
    }
    public void showWins(){
        System.out.println(this.getName()+" выиграл в "+this.getWins() + " играх");
    }
    public void showLoses(){
        System.out.println(this.getName()+" проиграл в "+this.getLoses() + " играх");
    }

    public void action(){
        this.setState("Идет домой");
        System.out.println(this.getName()+" "+this.getState()+" пить чай");
    }

    public void learntoplay(Character smb) throws NoPlayException {
        this.setState("учит играть");
        smb.setCanPlay(true);
        System.out.println(this.getName()+" "+this.getState()+" "+smb.getName()+" в пушишки");
    }

    public void actionhome(){
        this.setPlace("Дом");
        this.setState("Пьет чай");
        System.out.println(this.getName()+" "+this.getState()+" "+this.getPlace()+"а");
    }
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (!(o instanceof Puh)) {
            return false;
        } else {
            Puh puh = (Puh) o;
            return Objects.equals(this.getName(), puh.getName()) && Objects.equals(this.getMood(), puh.getMood()) && Objects.equals(this.getState(), puh.getState());
        }
    }

    public int hashCode() {
        return Objects.hash(this.getName(), this.getMood(), this.getState());
    }
}
