class Board
{
	private House[] houses;
	
	public Board()
	{
		this.houses = new House[12];
		for (int i = 0; i < 12; i++)
			this.houses[i] = new House();
	}
	
	public House[] getHouses()
	{
		return this.houses;
	}
	
	public void showBoard(Player p, House[] houses)
	{
		System.out.println("       12    11   10   9    8    7");
		System.out.print("       ");
		for (int i = 11;i > 5; i-- )
			System.out.print("(" + houses[i].getSeedsCount() + ")  ");
		System.out.println("\n(" + p.getPlayerStorehouse() + ")" +"--------------------------------------" + "(" + p.getOpponentStorehouse() + ")");
		System.out.print("       ");
		for (int i = 0;i < 6; i++ )
			System.out.print("(" + houses[i].getSeedsCount() + ")  ");
		System.out.println("\n        1    2    3    4    5    6");
	}
}