import java.util.ArrayList;

public class Methods {
	public static void main(String[] args) {

	}

	public int smallest(ArrayList<Integer> list) {
		Integer smallestNumber = list.get(0);
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i)<smallestNumber) {
				smallestNumber = list.get(i);

			}

		}

		return smallestNumber;

	}

	public double avarageNumber(ArrayList<Integer> list) {
		Integer smallestNumber = list.get(0);
		for (int i = 1; i < list.size(); i++) {
			smallestNumber += list.get(i);

		}

		return smallestNumber / list.size();

	}

	public String middleChar(String words) {
		int size = words.length();
		int trueSize = size / 2;
		String character1 = null;
		if (trueSize % 2 == 0) {
			char character2 = words.charAt(trueSize - 1);
			char character3 = words.charAt(trueSize);
			character1 = "" + character2 + character3;
		}
		if (!(trueSize % 2 == 0)) {
			character1 = "" + words.charAt(trueSize);
		}

		return character1;

	}

	public int vowels(String words) {
		int totalVowels = 0;
		for (int i = 0; i < words.length(); i++) {
			String character = "" + words.charAt(i);

			if (character.equalsIgnoreCase("a")) {
				totalVowels++;
			}

		}
		for (int i = 0; i < words.length(); i++) {
			String character = "" + words.charAt(i);

			if (character.equalsIgnoreCase("e")) {
				totalVowels++;
			}

		}
		for (int i = 0; i < words.length(); i++) {
			String character = "" + words.charAt(i);

			if (character.equalsIgnoreCase("i")) {
				totalVowels++;
			}

		}
		for (int i = 0; i < words.length(); i++) {
			String character = "" + words.charAt(i);

			if (character.equalsIgnoreCase("o")) {
				totalVowels++;
			}

		}
		for (int i = 0; i < words.length(); i++) {
			String character = "" + words.charAt(i);

			if (character.equalsIgnoreCase("u")) {
				totalVowels++;
			}

		}

		return totalVowels;

	}

}
