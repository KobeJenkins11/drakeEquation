package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

drakeEquation();
    }

    public static void drakeEquation() {
/*Drake equation
N = number of intelligent species that can communicate with us
 R∗ = 1 yr−1 (1 star formed per year, on the average over the life of the galaxy; this was regarded as conservative)
  fp = 0.2 to 0.5 (one fifth to one half of all stars formed will have planets)
 ne = 1 to 5 (stars with planets will have between 1 and 5 planets capable of developing life)
 fl = 1 (100% of these planets will develop life)
 fi = 1 (100% of which will develop intelligent life)
 fc = 0.1 to 0.2 (10–20% of which will be able to communicate)
L = 1000 to 100,000,000 years (which will last somewhere between 1000 and 100,000,000 years)
 */

        int N;
        int rstar;
        double f_p;
        int numberOfExoplanets;
        double f_l;
        double f_i;
        double f_c;
        int L;
        Scanner drakeEquations;

        drakeEquations = new Scanner(System.in);

System.out.println(" Give me the number how how many stars are a formed per year");
    rstar = drakeEquations.nextInt();

        System.out.println("Give me the amount of stars formed that will have planets");
        f_p = drakeEquations.nextDouble();

        System.out.println("Give me the the number of stars with planets that will be able to develop life");
        numberOfExoplanets = drakeEquations.nextInt();

        System.out.println("Give me the percent of these planets that will develop live");
        f_l = drakeEquations.nextDouble();

        System.out.println("Give me the percent of these planets that will develop intelligent life");
        f_i = drakeEquations.nextDouble();

        
    }

}
