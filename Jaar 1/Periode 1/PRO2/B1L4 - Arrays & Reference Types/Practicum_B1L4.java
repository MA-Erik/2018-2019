import java.util.*;


public class Practicum_B1L4
{

	public static void main(String[] args)
	{
		
		// ARRAYS OEFENEN:
		int[] lijstje = {24, 55, 412, 89, 6};
		
		/*
		int[] nogEenLijstje = new int[5];
		
		nogEenLijstje[0] = 24;
		nogEenLijstje[1] = 55;
		nogEenLijstje[2] = 412;
		nogEenLijstje[3] = 89;
		nogEenLijstje[4] = 6;
		*/
		
		
		System.out.println(lijstje.length);
		System.out.println(Arrays.toString(lijstje));
		
		
		// WAARDE OP INDEX VERVANGEN:
		lijstje[0] = 500;
		System.out.println(Arrays.toString(lijstje));
		
		
		// VERGROTEN VAN LIJST LENGTE:
		lijstje = Arrays.copyOf(lijstje, lijstje.length + 1);
		
		
		// NIEUWE INPUT MOET EEN GETAL ZIJN, ANDERS KRIJG JE EEN ERROR:
		Scanner newInput = new Scanner(System.in);
		lijstje[lijstje.length - 1] = newInput.nextInt();
		
		
		System.out.println(lijstje.length);
		System.out.println(Arrays.toString(lijstje));
		
		
		System.out.println("------------------------------------");
		
		
		
		// REFERENCE TYPES AND VALUE TYPES OEFENEN:
		int waardeX = 50;
		int waardeY = 100;
		
		int[] lijstjeA = { 1, 2, 3, 4 };
		int[] lijstjeB = { 5, 6, 7, 8 };
		
		System.out.println("waardeX: " + waardeX);
		System.out.println("waardeY: " + waardeY);
		
		System.out.println("\n");
		
		// De array variabelen bevatten eigenlijk een referentie naar de reeks getallen.
		// Stiekem zit de reeks van getallen ergens anders, de variabelen verwijzen hier alleen naar.
		System.out.println("Referentie lijstjeA: " + lijstjeA);
		System.out.println(Arrays.toString(lijstjeA));
		System.out.println("Referentie lijstjeB: " + lijstjeB);
		System.out.println(Arrays.toString(lijstjeB));
		
		
		System.out.println("");
		System.out.println("------ AANPASSING VAN INTS EN ARRAYS ------------");
		System.out.println("");
		
		
		waardeY = waardeX;
		waardeX = 2;
		
		lijstjeB = lijstjeA; // Nu verwijst lijstjeB naar dezelfde data als lijstjeA. In dit geval de reeks [ 1, 2, 3, 4 ].
		lijstjeA[0] = 111111111;
		lijstjeB[0] = 222222222;
		
		
		System.out.println("waardeX: " + waardeX);
		System.out.println("waardeY: " + waardeY);
		
		System.out.println("\n");
		
		System.out.println("Referentie lijstjeA: " + lijstjeA);
		System.out.println(Arrays.toString(lijstjeA));
		System.out.println("Referentie lijstjeB: " + lijstjeB);
		System.out.println(Arrays.toString(lijstjeB));
		
		
		
	}

}
