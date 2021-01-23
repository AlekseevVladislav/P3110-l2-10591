import java.util.Objects;

public class CroskaRu extends Character implements ThrowAction, NewAction{
    public CroskaRu(String Name, Moodes Mood, String State){
        this.setName(Name);
        this.setMood(Mood);
        this.setState(State);
    }
    public void trowaction(){
        System.out.println(this.getName() + " пищит: Палка, палка, поскорей! Палка, палка, поскорей!");
    }
    public void action()
    {
        this.setState("Прыгает, как заводной");
        System.out.println(this.getName()+" "+this.getState());
        this.trowaction();
    }
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (!(o instanceof CroskaRu)) {
            return false;
        } else {
            CroskaRu croskaru = (CroskaRu) o;
            return Objects.equals(this.getName(), croskaru.getName()) && Objects.equals(this.getMood(), croskaru.getMood()) && Objects.equals(this.getState(), croskaru.getState());
        }
    }

    public int hashCode() {
        return Objects.hash(this.getName(), this.getMood(), this.getState());
    }
}
