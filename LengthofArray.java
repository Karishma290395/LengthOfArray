package test5;

import java.util.Scanner;

public class LengthofArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter the elements");
		String numberInStringFormat = sc.nextLine();
		LengthofArray objLengthofArray = new LengthofArray();
		numberInStringFormat = objLengthofArray.removeExtraSpace(numberInStringFormat);

		String[] NumbersOfStringArray = numberInStringFormat.split(" ");
		System.out.println("The length of given Array is "+ NumbersOfStringArray.length);
		sc.close();
	}

	public String removeExtraSpace(String d) {
		boolean spaceStarted = false;
		String num = "";
		char[] charArray = d.toCharArray();
		for (int i = 0; i < d.length(); i++) { 
			if (charArray[i] != ' ') {
				if (spaceStarted) {
					num = num + " " + charArray[i];
					spaceStarted = false;
				} else
					num = num + charArray[i];

			} else {
				spaceStarted = true;
			}

		}
		if (num.charAt(0) == ' ') {
			num = num.substring(1);
		}
		return num;
	}
}