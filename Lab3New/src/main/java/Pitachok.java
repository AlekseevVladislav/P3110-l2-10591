import java.util.Objects;

public class Pitachok extends Character{
    public Pitachok(String Name, Moodes Mood, String State){
        this.setName(Name);
        this.setMood(Mood);
        this.setState(State);
    }
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (!(o instanceof Pitachok)) {
            return false;
        } else {
            Pitachok pitachok = (Pitachok) o;
            return Objects.equals(this.getName(), pitachok.getName()) && Objects.equals(this.getMood(), pitachok.getMood()) && Objects.equals(this.getState(), pitachok.getState());
        }
    }

    public int hashCode() {
        return Objects.hash(this.getName(), this.getMood(), this.getState());
    }
}
