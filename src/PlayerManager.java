
public class PlayerManager implements PlayerService{
	
	private UserValidationService validation;
	
	
	public PlayerManager(UserValidationManager validation) {
		this.validation = validation;
	}

	public void add(Player player) {
		if(validation.Validate(player)==true) {
			System.out.println("Oyuncu eklendi: " + player.getFirstName());			
		} else {
			System.out.println("Kullanýcý doðrulanamadý.");
		}
	}
	
	public void delete(Player player) {
		System.out.println("oyuncu silindi " + player.getFirstName());
	}
	
	public void update(Player player) {
		System.out.println("oyuncu güncellendi " + player.getFirstName());
	}
}
