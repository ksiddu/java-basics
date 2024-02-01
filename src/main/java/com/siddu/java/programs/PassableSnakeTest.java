package com.siddu.java.programs;

public class PassableSnakeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[][] array = { { '+', '+', '+', '0', '+', '0', '0' }, { '0', '0', '0', '0', '0', '0', '0' },
				{ '0', '0', '+', '0', '0', '0', '0' }, { '0', '0', '0', '0', '+', '0', '0' },
				{ '+', '+', '+', '0', '0', '0', '+' }, };

		String rows = "";
		for (int row = 0; row < array.length; row++) {

			char[] singleArray = array[row];
			for (int col = 0; col < singleArray.length; col++) {

				if (array[row][col] == '+') {
					break;
					//continue;
				}
			}
			rows = rows + String.valueOf(row);
		}

		System.out.println("Rows : " + rows);

	}

}
