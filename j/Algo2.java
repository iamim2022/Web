package javaOh;
//Finding a Quiet Place

//2022.06.09.14:14
//Math.pow(대상숫자, 지수)

import java.util.ArrayList;
import java.util.Scanner;

public class Algo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 장소판별결과 저장할 ArrayList
		ArrayList<String> result = new ArrayList<>();

		// input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x, y COORD, noise size: ");
		int a = sc.nextInt(); // 공사장 x좌표
		int b = sc.nextInt(); // 공사장 y좌표
		int R = sc.nextInt(); // 공사장 소음 크기

		System.out.println("Enter number of shade trees : ");
		int N = sc.nextInt(); // 나무 그늘 수

		// calculate
		System.out.println("quiet place x, y COORD : ");
		for (int i = 0; i < N; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();

			if ((Math.pow((x - a), 2) + Math.pow((y - b), 2)) >= Math.pow(R, 2)) {
				result.add("silent");
			} else {
				result.add("noisy");
			}
		}

		// result print
		System.out.println("=====Result=====");
		for (int i = 0; i < result.size(); i++) {
			System.out.println(result.get(i));
		}

		sc.close();
	}
}
