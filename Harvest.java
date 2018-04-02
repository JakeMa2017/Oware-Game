class Harvest
{
	public void harvest(int house, Player player, House[] houses)
	{
		int houseToEmpty = house;
		if (player.getWhichPlayer())
		{
			while (true)
			{
				int seedsInHouse = houses[houseToEmpty].getSeedsCount();
				if (houseToEmpty >= 5 && houseToEmpty <= 11) // as in array rather than board number
				{
					if (seedsInHouse == 2 || seedsInHouse == 3)
					{
						player.setPlayerStorehouse(seedsInHouse);
						houses[house].emptyHouse();
					}
					else
						break;
					houseToEmpty -= 1;
				}
				else
					break;
			}				
		}
		else
			while (true)
			{
				int seedsInHouse = houses[houseToEmpty].getSeedsCount();
				if (houseToEmpty >= 0 && houseToEmpty <= 5) // as in array rather than board number
				{
					if (seedsInHouse == 2 || seedsInHouse == 3)
					{
						player.setOpponentStorehouse(seedsInHouse);
						System.out.println("Harvested " + seedsInHouse + " seeds from house " + houseToEmpty + ".");
						houses[houseToEmpty].emptyHouse();
					}
					else
						break;
					houseToEmpty -= 1;
//					if (houseToEmpty < 0)
//						houseToEmpty = 11;
				}
				else
					break;
			}				
	}
}