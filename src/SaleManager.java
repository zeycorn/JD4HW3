
public class SaleManager implements SaleService{


	private CampaignService service;

	public SaleManager(CampaignService service) {
		this.service = service;
	}
	@Override
	public void Sale(Player player, Campaign campaign) {
		System.out.println(player.getFirstName()+ " oyuncusu " + campaign.campaignName + " oyununu aldý.");
	}
	
}
