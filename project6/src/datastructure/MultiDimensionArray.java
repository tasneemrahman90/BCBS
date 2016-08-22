package datastructure;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by rrt on 8/6/2016.
 */
public class MultiDimensionArray {
	public static void main(String[] args) {

		Random random = new Random();
		System.out.println("Please enter numbers: ");
		//Scanner sc = new Scanner(System.in);
		int rows = 3;
		int column = 3;
		int[][] multiArray = new int[rows][column];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < column; j++) {
				multiArray[i][j] = random.nextInt(100);
			}
		}
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print(multiArray[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}