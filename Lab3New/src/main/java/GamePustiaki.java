import java.util.Random;

public class GamePustiaki{
    Character[] players = new Character[10000];
    int n = 0;

    public void PlayerAdd(Character somebody){
        System.out.println(somebody.getName() + " присоединился к игре в пустяки");
        players[n] = somebody;
        n++;
    }
    public void WhoIsWinner(){
        Random rnd = new Random();
        int a = rnd.nextInt(4);
        Character currentwinner = players[a];
        currentwinner.setMood(Moodes.УжасноВзволновался);
        System.out.print(players[a].getName()+ " " + currentwinner.getMood());
        System.out.println(", потому что ведь показалась только его палочка, а это означает, что он выиграет");
    }
    public void GetPlayers(){
        for(int i = 0; i < n; ++i){
            System.out.print(players[i].getName() + ", ");
        }
    }
    public void ChangeState(){
        GetPlayers();
        System.out.println("Стремглав помчались на другую сторону моста и ожидают, чья палочка выплывет первой.");
        for(int i = 0; i < n; ++i){
            players[i].setMood(Moodes.ЖдетПалочку);
        }
    }
    public String toString() {
        String names = new String();
        for(int i = 0; i < n; ++i){
            names = names + players[i].getName() + " ";
        }
        return "Игроки: " + names;
    }

}
