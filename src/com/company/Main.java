package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        /* Chose cube argument is number of picked cube 0 - with four walls, cube 1 - with six walls etc.*/
        System.out.println(checkIfCorrect(pickCube(5)));
    }

    public static int pickCube (int choseCube) {

        switch (choseCube) {
            case 0:
                return cubeK4(0);
            case 1:
                return cubeK6(0);
            case 2:
                return cubeK8(0);
            case 3:
                return cubeK10(0);
            case 4:
                return cubeK12(0);
            case 5:
                return cubeK20(0);
            case 6:
                return cubeK100(0);
            default:
                return 0;
        }

    }

    public static String checkIfCorrect (int badNumber) {
        if (badNumber == 0) {
            return "Invalid number";
        } else return "Score "+badNumber;
    }

    public static int cubeK4 (int numberDrawK4) {

        Random r = new Random();
        int k4Throw = r.nextInt(5);
        numberDrawK4 = numberDrawK4 + k4Throw -1;

        switch (numberDrawK4) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            default:
                return 4;
        }
    }

    public static int cubeK6 (int numberDrawK6) {

        Random r = new Random();
        int k6Throw = r.nextInt(7);
        numberDrawK6 = numberDrawK6 + k6Throw -1;

        switch (numberDrawK6) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            default:
                return 6;
        }
    }

    public static int cubeK8 (int numberDrawK8) {

        Random r = new Random();
        int k8Throw = r.nextInt(9);
        numberDrawK8 = numberDrawK8 + k8Throw - 1;

        switch (numberDrawK8) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            default:
                return 8;
        }
    }

    public static int cubeK10 (int numberDrawK10) {

        Random r = new Random();
        int k10Throw = r.nextInt(11);
        numberDrawK10 = numberDrawK10 + k10Throw -1;

        switch (numberDrawK10) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5 ;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            default:
                return 10;
        }
    }

    public static int cubeK12 (int numberDrawK12) {

        Random r = new Random();
        int k12Throw = r.nextInt(13);
        numberDrawK12 = numberDrawK12 + k12Throw -1;

        switch (numberDrawK12) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            default:
                return 12;
        }
    }

    public static int cubeK20 (int numberDrawK20) {

        Random r = new Random();
        int k20Throw = r.nextInt(21);
        numberDrawK20 = numberDrawK20 + k20Throw -1;

        switch (numberDrawK20) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            case 15:
                return 16;
            case 16:
                return 17;
            case 17:
                return 18;
            case 18:
                return 19;
            default:
                return 20;
        }
    }

    public static int cubeK100 (int numberDrawK100) {

        Random r = new Random();
        int k100Throw = r.nextInt(10);
        numberDrawK100 = numberDrawK100 + k100Throw * 10 - 10;

        switch (numberDrawK100) {
            case 0:
                return 10;
            case 1:
                return 20;
            case 2:
                return 30;
            case 3:
                return 40;
            case 4:
                return 50;
            case 5:
                return 60;
            case 6:
                return 70;
            case 7:
                return 80;
            case 8:
                return 90;
            default:
                return 100;
        }
    }
}
