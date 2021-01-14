import java.util.Objects;

public class Puh extends Character{
    public Puh(String Name, Moodes Mood, String State){
        this.setName(Name);
        this.setMood(Mood);
        this.setState(State);
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
