class Sow
{
	public int sow(int houseChoice, House[] houses)
	{
		
		int lastHouse = 0;
		int seeds = houses[houseChoice].getSeedsCount();
		
		for (int i = houseChoice; i < 11; i++)
			{
				houses[i + 1].seedsIn();
				seeds --;
				if (seeds == 0)
				{
					break;
				}
			}
		while (seeds > 0)
		{
			for (int i = 0; i < 12; i++)
			{
				if (i != houseChoice)
				{
					houses[i].seedsIn();
					seeds --;
					if (seeds == 0)
					{
						lastHouse = i;
						break;
					}
				}
			}
		}
		houses[houseChoice].emptyHouse();
		return lastHouse;
	}
}