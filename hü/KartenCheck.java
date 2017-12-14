package data;

import java.util.Arrays;

public class KartenCheck {

	private static int anzahlKartenEinerFarbe = 13;

	public static int echterKartenwert(int nummer) {
		return nummer % anzahlKartenEinerFarbe;
	}

	/**
	 * public static boolean onePair(int[] karten) { for (int i = 0; i <
	 * (karten.length - 1); i++) { for (int j = i + 1; i < karten.length; i++) {
	 * if ((karten[i] % 13) == karten[j] % 13) { return true; } } } return
	 * false; }
	 **/

	/**
	 * public static boolean checkTripple(int[] karten) { for (int i = 0; i <
	 * (karten.length - 1); i++) { for (int j = i + 1; i < karten.length; i++) {
	 * for (int h = j + 1; j < karten.length; h++) { if ((karten[i] % 13) ==
	 * (karten[j] % 13) && (karten[j] % 13) == karten[h] % 13) { return true; }
	 * } }
	 * 
	 * } return false;
	 * 
	 * }
	 **/

	// int[] gezogeneKarten = {1,13,25,38,51};
	public static boolean checkforPairs(int[] karten, int notwendigeZahl) {
		int zaehler = 0;
		for (int i = 0; i < (karten.length - 1); i++) {
			for (int j = i + 1; j < karten.length; j++) {
				if (echterKartenwert(karten[i]) == echterKartenwert(karten[j])) {
					zaehler++;
				}
				if (zaehler == notwendigeZahl) {
					return true;
				}
			}
		}
		return false;
	}

	// schauen ob abstand zwischen 10 und ass richtig ist dann kann ich
	// überprüfen

	public static boolean Straße(int[] karten, int notwendigeZahl) {
		Arrays.sort(karten);
		int zaehler = 0;
		for (int i = 0; i < (karten.length - 1); i++) {
			for (int j = i + 1; j < karten.length; j++) {
				if ((karten[i] % 13 + 1) == (karten[j] % 13)) {
					zaehler++;

				}
				if (zaehler == notwendigeZahl) {
					return true;
				}
			}
		}

		return false;
	}

	public static boolean Flush(int[] karten) {
		Arrays.sort(karten);

		if ((karten[0] / 13) == (karten[4]) / 13) {
			return true;
		}
		return false;

	}

	public static boolean royalFlush(int[] karten, int notwendigeZahl) {
		Arrays.sort(karten);

		if ((karten[0] / 13) == (karten[4]) / 13) {

			int zaehler = 0;
			for (int i = 0; i < (karten.length - 1); i++) {
				for (int j = i + 1; j < karten.length; j++) {
					if ((karten[i] % 13 + 1) == (karten[j] % 13)) {
						zaehler++;

					}
					if (zaehler == notwendigeZahl && (karten[0] + 4) == karten[4]) {
						return true;
					}
				}
			}
		}
		return false;
	}

	public static boolean straightFlush(int[] karten, int notwendigeZahl) {
		Arrays.sort(karten);

		if ((karten[0] / 13) == (karten[4]) / 13) {

			int zaehler = 0;
			for (int i = 0; i < (karten.length - 1); i++) {
				for (int j = i + 1; j < karten.length; j++) {
					if ((karten[i] % 13 + 1) == (karten[j] % 13)) {
						zaehler++;

					}
					if (zaehler == notwendigeZahl) {
						return true;
					}
				}
			}
		}
		return false;
	}
  
	// public static int highestCart(int[] karten) {
	// Arrays.sort(karten);
	// return karten[4] % 13;

	// }

	public static boolean twoPairs(int[] karten, int notwendigeZahl) {
		int zaehler = 0;

		for (int i = 0; i < (karten.length - 1); i++) {
			for (int j = i + 1; i < karten.length; i++) {
				if ((karten[i] % 13) == karten[j] % 13) {
					zaehler++;
				}
				if (zaehler == notwendigeZahl) {
					
					return true;

				}
			}

		}
		return false;
	}
}
	// public static boolean fullHouse(int[] karten) {

		 
			

	//}
