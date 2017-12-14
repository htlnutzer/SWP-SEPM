package data;

public class Kartenzaehler {
	private int[] gezogeneKarten = new int[5];
	private int farbenAnzahl = 4;
	private int anzahlKartenEinerFarbe = 13;
	private int kartenAnzahl = anzahlKartenEinerFarbe * farbenAnzahl;
	private int[] vorhandeneKarten = new int[kartenAnzahl];

	public Kartenzaehler() {
		for (int i = 1; i < vorhandeneKarten.length; i++) {
			vorhandeneKarten[i] = i;
		}
	}

	public void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public int[] getGezogeneKarten() {
		return gezogeneKarten;
	}

	/**
	 * 
	 * @param anzahl
	 *            soviele karten m�chte ich ziehen
	 * @param max
	 *            obere Zahlenschranke
	 * @return die gezogenen zahlen
	 */

	public int[] ziehen(int anzahl, int max) {
		int[] gezogeneZahlen = new int[anzahl];

		for (int i = 0; i < gezogeneZahlen.length; i++) {
			int indexDerGezogenenKarte = (int) (Math.random() * (max - i - 1));
			gezogeneZahlen[i] = vorhandeneKarten[indexDerGezogenenKarte];
			vorhandeneKarten[indexDerGezogenenKarte] = vorhandeneKarten[max - i - 1];
		}
		return gezogeneZahlen;
	}
	/*
	 * i = 0 (int) (0,5953 * (52 - 0)) = 30,9 = 30 gezogenenZahlen[0] =
	 * vorhandeneKarten[30]; vorhandeneKarten[30] = vorhandeneKarten[52 - 0];
	 * 
	 * i = 1 (int) (0,9673 * (52 - 1)) = 49,3 = 49 gezogenenZahlen[1] =
	 * vorhandeneKarten[49]; vorhandeneKarten[49] = vorhandeneKarten[52 - 1];
	 * 
	 */

	public int findFarbe(int kartenNummer) {
		return kartenNummer / anzahlKartenEinerFarbe;
	}
	/*
	 * 49 / 13 = 3 22 / 13 = 1 8 / 13 = 0
	 * 
	 */

	public int echteKartennummer(int kartenNummer) {
		return kartenNummer % anzahlKartenEinerFarbe;
	}
	/*
	 * 49 % 13 = 10 51 % 13 = 12 27 % 13 = 1
	 */

	/**
	 * public static void main(String[] args) { Kartenzaehler k = new
	 * Kartenzaehler(); int[] meinArray = k.ziehen(5, 52); k.print(meinArray);
	 * k.findFarbe(33); }
	 **/

}
