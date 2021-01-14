import java.util.Objects;

public class Crolik extends Character implements ThrowAction, NewAction{
    public Crolik(String Name, Moodes Mood, String State) {
        this.setName(Name);
        this.setMood(Mood);
        this.setState(State);
    }
    public void trowaction(){
        System.out.println(this.getName()+" cкомандовал бросать палочки.");
    }
    public void action(){
        this.setState("Высматривает палочку.");
        System.out.println(this.getName()+" Высунулся дальше всех, "+this.getState());
    }
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (!(o instanceof Crolik)) {
            return false;
        } else {
            Crolik crolik = (Crolik) o;
            return Objects.equals(this.getName(), crolik.getName()) && Objects.equals(this.getMood(), crolik.getMood()) && Objects.equals(this.getState(), crolik.getState());
        }
    }

    public int hashCode() {
        return Objects.hash(this.getName(), this.getMood(), this.getState());
    }
}
