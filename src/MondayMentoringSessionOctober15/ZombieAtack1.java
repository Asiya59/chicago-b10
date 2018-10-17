package MondayMentoringSessionOctober15;

import java.util.Arrays;

public class ZombieAtack1 {

	public static void main(String[] args) {
		int[] cities = new int[] { 3, 6, 0, 4, 3, 2, 7, 1 };
		int peopleAlive = 0;
		int days = 0;
		int numberIterations = 0;

		/*
		 * for(int cityPopulation : cities){ peopleAlive += cityPopulation;
		 * numberIterations ++; }
		 */

		do {
			peopleAlive = 0;
			for(int cityPopulation : cities)
			{ peopleAlive += cityPopulation;
			  numberIterations ++; }

			System.out.println("Day : " + days + " " + Arrays.toString(cities));

			// if(peopleAlive == 0) break;

			for (int i = 0; i < cities.length; i++) {
				
				
				if (cities[i] == 0) {
					if((i+1)< cities.length-1  && cities[i+1] == 1 ) {
						i++;
					}

					if (i == cities.length - 1) {
						cities[i - 1] = cities[i - 1] / 2;
					} else if (i == 0) {

						cities[i + 1] = cities[i + 1] / 2;
					} else {
						cities[i - 1] = cities[i - 1] / 2;
						cities[i + 1] = cities[i + 1] / 2;
					}

				}

				numberIterations++;
			}
			numberIterations++;

			days++;
		} while (peopleAlive > 0);

		System.out.println(numberIterations);
	}

}
