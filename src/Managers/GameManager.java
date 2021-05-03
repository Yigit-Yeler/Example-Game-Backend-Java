package Managers;

import Interfaces.BaseGameManager;
import Models.Campaign;
import Models.Game;
import Models.Player;

public class GameManager implements BaseGameManager{
	private Campaign campaign;
	
	public GameManager(Campaign campaign) {
		this.campaign = campaign;
	}

	@Override
	public void sellGame(Player player, Game game) {
		// TODO Auto-generated method stub
		if(campaign.isActive()) {
			double discountPrice = game.getPrice() - (game.getPrice() * campaign.getDiscount());
			System.out.println(game.getName() + " oyununu " + player.getFirstName() + " adl� ki�i " + campaign.getCampaignName() + " kampanyas�yla " + discountPrice + " fiyat�na sat�n ald� ");
		}
		else {
			System.out.println(game.getName() + " oyununu " + player.getFirstName() + " adl� ki�i " + game.getPrice() + " fiyat�na sat�n ald�");
		}
		
	}

}
