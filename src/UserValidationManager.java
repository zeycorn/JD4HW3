
public class UserValidationManager implements UserValidationService{

	@Override
	public Boolean Validate(Player player) {
		if(player.getFirstName()=="Zeynep" && player.getBirthYear()=="1997" 
				&& player.getIdentityNumber()=="11111" && player.getLastName()=="Çýtlak") {
			return true;
		}
		else{
			return false;
		}
	}

}
