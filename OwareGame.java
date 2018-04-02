/*
 * If no seeds in any of your opponent's house, you should seed him.
 */




class OwareGame
{
	private static Player player;
	private static House[] houses;
	private static Board board;
	private static boolean haveWinner;
	private static InController choices;
	private static Harvest doHarvest;
	private static Sow doSow;
	
	public static void main(String[] args)
	{
		initialize();
		houses = board.getHouses();
		
		System.out.println("            Oware Game 1.0");
		System.out.println("-------------------------------------------\n");
		board.showBoard(player, houses);
		
		while (!haveWinner)
		{
			int houseChoice = choices.chooseHouse(player, houses);
			
			doHarvest.harvest(doSow.sow(houseChoice, houses), player, houses);
			board.showBoard(player, houses);
			player.alternatePlayer();
			
			/*
			 * Insert here.
			 */
			
			if (player.getPlayerStorehouse() > 24 || player.getOpponentStorehouse() > 24)
				haveWinner = true;
		}
		
		System.out.println("-----------------------------");
		System.out.println("     We have a WINNER!");
		System.out.println("-----------------------------");
		System.out.println("Thank you for playing.");
	}
	
	private static void initialize()
	{
		player = new Player();
		board = new Board();
		haveWinner = false;
		choices = new InController();
		doHarvest = new Harvest();
		doSow = new Sow();
	}
}