import java.util.Objects;

public class River extends Character implements NewAction{
    private String Object;
    public River(String State, String Object){
        this.setName("Река");
        this.setState(State);
        this.setObject(Object);

    }

    public void setObject(String Object){
        this.Object = Object;
    }
    public String getObject(){
        return this.Object;
    }

    public void action(){
        System.out.print("Ждать приходиться подолгу, кажется, река "+this.getState()+" и "+this.getObject());
        System.out.println(" ");
    }
    public String toString() {
        return "Имя " + this.getName() + " Состояние " +this.getState() + " Цель " + this.getObject();
    }
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (!(o instanceof River)) {
            return false;
        } else {
            River river = (River) o;
            return Objects.equals(this.getName(), river.getName()) && Objects.equals(this.getState(), river.getState()) && Objects.equals(this.getObject(), river.getObject());
        }
    }

    public int hashCode() {
        return Objects.hash(this.getName(), this.getState(), this.getObject());
    }

}
