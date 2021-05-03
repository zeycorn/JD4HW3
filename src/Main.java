
public class Main {

	public static void main(String[] args) {

		Player player1 = new Player();
		player1.setFirstName("Zeynep");
		player1.setLastName("Çıtlak");
		player1.setBirthYear("1997");
		player1.setIdentityNumber("11111");
		
		Campaign campaign1 = new Campaign(1,"COD");

		PlayerManager playerManager = new PlayerManager(new UserValidationManager());
		playerManager.add(player1);
		
		SaleManager saleManager = new SaleManager(new CampaignManager());
		saleManager.Sale(player1, campaign1);
		
	}

}
