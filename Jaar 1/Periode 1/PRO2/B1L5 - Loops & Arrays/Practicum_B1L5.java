import java.util.*;


public class Practicum_B1L5
{

	public static void main(String[] args)
	{
		
		// HOGER-LAGER SPELLETJE:
		
		boolean runGame = true;
		
		Scanner scan = new Scanner(System.in);
		String input = "";
		String[] commandos = {"hoger", "lager", "exit"};
		
		double getalStart = 0;
		double getalNieuw = 0;
		
		
		while (runGame)
		{
			
			getalStart = Math.ceil(Math.random() * 10);
			
			System.out.println("--------------------------------------------------------");
			System.out.println("Getal is: " + getalStart);
			System.out.println("");
			System.out.println("Wordt het volgende getal hoger of lager? (1 t/m 10)");
			System.out.println("Type \"hoger\" of \"lager\" om verder te gaan.");
			System.out.println("Type \"exit\" om het spel af te sluiten.");
			System.out.println("--------------------------------------------------------");
			
			
			// WE CONTROLEREN OF DE INPUT EEN VAN DE COMMANDO'S IS:
			boolean inputCorrect = false;
			while (inputCorrect == false) // !inputCorrect
			{
				input = scan.nextLine();
				input = input.toLowerCase();
				
				// WE GAAN ALLE ITEMS VAN DE ARRAY AF:
				for (int i = 0; i < commandos.length; i++)
				{
					// WE VERGELIJKEN DE INPUT MET HET HUIDIGE ITEM IN DE ARRAY:
					if (input.equals(commandos[i]))
					{
						inputCorrect = true;
						break; // WE HOEVEN NIET VERDER DOOR DE FOR-LOOP TE GAAN, DUS WE BREKEN DE LOOP AF.
					}
				}
				
				
				if (!inputCorrect)
				{
					System.out.println("");
					System.out.println("De input is incorrect, probeer het nogmaals.");
					System.out.println("Getal is: " + getalStart);
					System.out.println("");
				}
			}
			
			
			// Input klopt nu, genereer een nieuw getal:
			getalNieuw = Math.ceil(Math.random() * 10);
			
			
			// Check of de speler heeft gewonnen of verloren:
			boolean winGame = false;
			if (input.equals(commandos[0])) // hoger
			{
				if (getalNieuw > getalStart)
				{
					winGame = true;
				}
			}
			else if (input.equals(commandos[1])) // lager
			{
				if (getalNieuw < getalStart)
				{
					winGame = true;
				}
			}
			else
			{
				// Speler heeft "exit" getypt. Sluit het spel af.
				runGame = false;
				continue; // HIERMEE BEGIN JE WEER VANAF HET BEGIN VAN DE HUIDIGE LOOP (met de volgende iteratie) EN DE REST VAN DE LOOP-CODE WORDT GENEGEERD.
			}
			
			
			
			System.out.println("############################");
			System.out.println("Begin getal: " + getalStart);
			System.out.println("Nieuw getal: " + getalNieuw);
			System.out.println("############################");
			
			// Check eerst of het getal niet hetzelfde is als het vorige getal. Anders is dat een beetje lullig. :)
			if (getalNieuw != getalStart)
			{
				if (winGame)
				{
					// GEWONNEN:
					System.out.println("");
					System.out.println("!!! JE HEBT GEWONNEN !!! :D");
					System.out.println("");
				}
				else
				{
					// VERLOREN:
					System.out.println("");
					System.out.println("Heh jammer, je hebt verloren... :(");
					System.out.println("");
				}
			}
			else
			{
				// STALEMATE:
				System.out.println("");
				System.out.println("Het is hoger noch lager, noch gewonnen of verloren. :)");
				System.out.println("");
			}
			
			
			System.out.println("Druk op ENTER om verder te gaan...");
			scan.nextLine();
			
			
		}
		

	}

}
