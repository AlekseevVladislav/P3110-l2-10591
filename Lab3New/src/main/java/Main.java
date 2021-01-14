public class Main {

    public static void main(String[] args) {
	    Puh puh = new Puh("Пух",Moodes.Нету,"Играет");
	    Pitachok pit = new Pitachok("Пятачок", Moodes.Нету,"Играет");
	    Crolik crol = new Crolik("Кролик",Moodes.Нету,"Играет");
	    CroskaRu crosh = new CroskaRu("Крошка Ру",Moodes.Нету,"Играет");
		GamePustiaki pustiak = new GamePustiaki();
	    pustiak.PlayerAdd(puh);
	    pustiak.PlayerAdd(pit);
		pustiak.PlayerAdd(crol);
		pustiak.PlayerAdd(crosh);
	    crol.trowaction();
	    pustiak.ChangeState();
		River river = new River("Очень ленивая","Не имеет цели");
		river.action();
		crol.action();
		crosh.action();
		pustiak.WhoIsWinner();
    }
}
