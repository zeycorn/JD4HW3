
public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.campaignName+" oyunu eklendi.");
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.campaignName+" oyunu silindi.");

	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.campaignName+" oyunu güncellendi.");
		
	}

}
