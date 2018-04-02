class House
{
	private int seedsCount;
	
	public House()
	{
		seedsCount = 4;
	}
	public void seedsIn()
	{
		seedsCount ++;
	}
	
	public void seedsOut()
	{
		seedsCount --;
	}
	
	public int getSeedsCount()
	{
		return seedsCount;
	}
	
	public void setSeedCount(int i)
	{
		seedsCount = i;
	}
	
	
	public void emptyHouse()
	{
		seedsCount = 0;
	}
	
}

