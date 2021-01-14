public abstract class Character {
    private String Name;
    private Moodes Mood;
    private String State;

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

    public void setName(String name){
        this.Name = name;
    }

    public void setMood(Moodes mood){
        this.Mood = mood;
    }

    public void setState(String state){
        this.State = state;
    }
    public String toString() {
        return "Имя " + this.getName() + " Настроение " + this.getMood() + " Состояние " +this.getState();
    }
}
