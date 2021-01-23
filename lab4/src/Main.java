import java.io.IOException;
public class Main {

    public static void main(String[] args) throws NoPlayException{
	    Puh puh = new Puh("Пух",Moodes.Нету,"Играет","на улице",36,28);
	    puh.action();
	    puh.actionhome();
		GamePustiaki pustiak = new GamePustiaki();
		puh.showWins();
		puh.showLoses();
	    puh.WinsCount();
	    Pitachok pit = new Pitachok("Пятачок", Moodes.Нету,"Играет");
	    Crolik crol = new Crolik("Кролик",Moodes.Нету,"Играет");
	    CroskaRu crosh = new CroskaRu("Крошка Ру",Moodes.Нету,"Играет");
	    puh.learntoplay(pit);
		puh.learntoplay(crol);
		puh.learntoplay(crosh);
	    pustiak.PlayerAdd(puh);
	    pustiak.PlayerAdd(pit);
		pustiak.PlayerAdd(crol);
		pustiak.PlayerAdd(crosh);
		pustiak.setGamethings("Палочки");
		pustiak.setGameName("Пустяки");
	    crol.trowaction();
	    pustiak.ChangeState();
		River river = new River("Очень ленивая","Не имеет цели");
		river.action();
		crol.action();
		crosh.action();
		pustiak.WhoIsWinner();
		Character ia = new Character(){
			public void getmove(){
				System.out.print(this.getName() + " " + this.getState() + " задрав в небо все четыре ноги.");
				System.out.println(" ");
			}
		};
		ia.setName("Иа-Иа");
		ia.setState("Плывет по реке под мостом");
		ia.getmove();
    }
}
