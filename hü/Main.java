package data;

import java.util.Arrays;

public class Main {
	
	
	

	public static void main(String[] args) {
		
		
		int countTripple = 0;
		int countPair  = 0;
		int countStraﬂe = 0;
		int countPoker = 0;
		int countFlush = 0;
		int countRoyalFlush = 0;
		int countStraightFlush = 0;
		int countTwoPairs = 0;
		int ziehungen = 10000;

		
		for(int i = 0; i <= ziehungen; i++){

/**			KartenCheck check = new KartenCheck();
			// int[] gezogeneKarten2 = { 1, 13, 25, 38, 39 };

			if (KartenCheck.checkforPairs(gezogeneKarten, 2)) {
				countTripple++;
				System.out.println("Es ist ein tripple vorhanden " +  );
			} else {
				System.out.println("Es ist kein tripple vorhanden");
			}
			// int[] gezogeneKarten3 = { 1, 13, 25, 37, 39 };

			if (KartenCheck.checkforPairs(gezogeneKarten, 1)) {
				countPair++;
				System.out.println("Es ist ein paar vorhanden");
			} else {
				System.out.println("Es ist kein Paar vorhanden");
			}
			// int[] gezogeneKarten4 = { 1, 13, 25, 38, 51 };

			if (KartenCheck.checkforPairs(gezogeneKarten, 3)) {
				countPoker++;
				System.out.println("Es ist ein Poker vorhanden");
			} else {
				System.out.println("Es ist kein Poker vorhanden");
			}
			// int[] gezogeneKarten5 = { 21, 22, 23, 24, 25 };
			if (KartenCheck.royalFlush(gezogeneKarten, 4)) {
				countRoyalFlush++;
				System.out.println("Es ist ein royal Flush vorhanden");
			} else {
				System.out.println("Es ist kein royal Flush vorhanden");
			}
			// int[] gezogeneKarten7 = { 28, 29, 30, 31, 32 };
			if (KartenCheck.Straﬂe(gezogeneKarten, 4)) {
				countStraﬂe++;
				System.out.println("Es ist eine Straﬂe vorhanden");
			} else {
				System.out.println("Es ist keine Straﬂe vorhanden");
			}
			// int[] gezogeneKarten8 = { 28, 34, 36, 37, 48 };
			System.out.println("Die hˆchste Karte ist: " + gezogeneKarten[4]);
			// int[] gezogeneKarten9 = { 27, 29, 30, 32, 34 };
			if (KartenCheck.Flush(gezogeneKarten)) {
				countFlush++;
				System.out.println("Es ist ein Flush vorhanden");
			} else {
				System.out.println("Es ist kein Flush vorhanden");
			}
			// int[] gazogeneKarten10 = { 40, 41, 42, 43, 44 };
			if (KartenCheck.straightFlush(gezogeneKarten, 4)) {
				countStraightFlush++;
				System.out.println("Es ist ein straight Flush vorhanden");
			} else {
				System.out.println("Es ist kein straight Flush vorhanden");
			}

			// int[] gezogeneKarten13 = {9,22,30,43,50};
			if (KartenCheck.twoPairs(gezogeneKarten, 2)) {
				countTwoPairs++;
				System.out.println("Es sind zwei Paare vorhanden");
			} else {
				System.out.println("Es sind keine zwei Paare vorhanden");
			}**/
			
			Kartenzaehler k = new Kartenzaehler();
			int[] gezogeneKarten = k.ziehen(5, 52);
			Arrays.sort(gezogeneKarten);
			
			KartenCheck check = new KartenCheck();
			// int[] gezogeneKarten2 = { 1, 13, 25, 38, 39 };

			if (KartenCheck.checkforPairs(gezogeneKarten, 2)) {
				countTripple++;}
				
			
			// int[] gezogeneKarten3 = { 1, 13, 25, 37, 39 };

			if (KartenCheck.checkforPairs(gezogeneKarten, 1)) {
				countPair++;}
				
			
				
			
			// int[] gezogeneKarten4 = { 1, 13, 25, 38, 51 };

			if (KartenCheck.checkforPairs(gezogeneKarten, 3)) {
				countPoker++;
				
			
				
			
			// int[] gezogeneKarten5 = { 21, 22, 23, 24, 25 };
			if (KartenCheck.royalFlush(gezogeneKarten, 4)) {
				countRoyalFlush++;}
				
			
			// int[] gezogeneKarten7 = { 28, 29, 30, 31, 32 };
			if (KartenCheck.Straﬂe(gezogeneKarten, 4)) {
				countStraﬂe++;}  
				//asdf
			//asdf
			 //asdg
			
			// int[] gezogeneKarten8 = { 28, 34, 36, 37, 48 };
			//System.out.println("Die hˆchste Karte ist: " + gezogeneKarten[4]);
			// int[] gezogeneKarten9 = { 27, 29, 30, 32, 34 };
			if (KartenCheck.Flush(gezogeneKarten)) {
				countFlush++;}
				
			
			// int[] gazogeneKarten10 = { 40, 41, 42, 43, 44 };
			if (KartenCheck.straightFlush(gezogeneKarten, 4)) {
				countStraightFlush++;}
			
				
			// int[] gezogeneKarten13 = {9,22,30,43,50};
			if (KartenCheck.twoPairs(gezogeneKarten, 2)) { 
				countTwoPairs++;}
			
			}
			
		}
		SqLite.insertUser(234, "Johannes");
		SqLite.insertResult(234, countPair, countTripple, countPoker, countRoyalFlush, countStraightFlush, countFlush, countStraﬂe);
		System.out.println("Bei " + ziehungen + " sind " + ((countTripple * 100)/ziehungen) + "%" + " Tripple enthalten, also " + countTripple + "von " + ziehungen);
		System.out.println("Bei " + ziehungen + " sind " + ((countPair * 100)/ziehungen) + "%" + " Paare enthalten, also " + countPair + "von " + ziehungen);
		System.out.println("Bei " + ziehungen + " sind " + ((countPoker * 100)/ziehungen) + "%" + " Poker enthalten, also " + countPoker);
		System.out.println("Bei " + ziehungen + " sind " + ((countRoyalFlush * 100)/ziehungen) + "%" + " Royal Flush enthalten, also " + countRoyalFlush + "von " + ziehungen);
		System.out.println("Bei " + ziehungen + " sind " + ((countStraﬂe * 100)/ziehungen) + "%" + " Straﬂen enthalten, also " + countStraﬂe + "von " + ziehungen);
		System.out.println("Bei " + ziehungen + " sind " + ((countFlush * 100)/ziehungen) + "%" + " Flush enthalten, also " + countFlush + "von " + ziehungen);
		System.out.println("Bei " + ziehungen + " sind " + ((countStraightFlush * 100)/ziehungen) + "%" + " Straight Flush enthalten, also " + countStraightFlush + " von " + ziehungen);
		System.out.println("Bei " + ziehungen + " sind " + ((countTwoPairs * 100)/ziehungen) + "%" + " Two Pairs enthalten, also " + countTwoPairs + " von " + ziehungen);
	}
}