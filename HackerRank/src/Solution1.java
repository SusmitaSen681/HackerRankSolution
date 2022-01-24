/*Objective
In this challenge, we're going to use loops to help us do some simple math.

Task
Given an integer, , print its first  multiples. Each multiple  (where ) should be printed on a new line in the form: N x i = result.*/

import java.io.*;

public class Solution1 {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(bufferedReader.readLine().trim());

		bufferedReader.close();
		for (int i = 1; i <= 10; i++) {
			System.out.println(N + " x " + i + " = " + N * i);
		}
	}
}
