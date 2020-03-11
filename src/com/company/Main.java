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
        } else return "Wynik "+badNumber;
    }

    public static int cubeK4 (int losowanieLiczby) {

        Random r = new Random();
        int rzutK4 = r.nextInt(5);
        losowanieLiczby = losowanieLiczby + rzutK4 -1;

        switch (losowanieLiczby) {
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

    public static int cubeK6 (int losowanieLiczby) {

        Random r = new Random();
        int rzutK6 = r.nextInt(7);
        losowanieLiczby = losowanieLiczby + rzutK6 -1;

        switch (losowanieLiczby) {
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

    public static int cubeK8 (int losowanieLiczby) {

        Random r = new Random();
        int rzutK8 = r.nextInt(9);
        losowanieLiczby = losowanieLiczby + rzutK8 - 1;

        switch (losowanieLiczby) {
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

    public static int cubeK10 (int losowanieLiczby) {

        Random r = new Random();
        int rzutK10 = r.nextInt(11);
        losowanieLiczby = losowanieLiczby + rzutK10 -1;

        switch (losowanieLiczby) {
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

    public static int cubeK12 (int losowanieLiczby) {

        Random r = new Random();
        int rzutK12 = r.nextInt(13);
        losowanieLiczby = losowanieLiczby + rzutK12 -1;

        switch (losowanieLiczby) {
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

    public static int cubeK20 (int losowanieLiczby) {

        Random r = new Random();
        int rzutK20 = r.nextInt(21);
        losowanieLiczby = losowanieLiczby + rzutK20 -1;

        switch (losowanieLiczby) {
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

    public static int cubeK100 (int losowanieLiczby) {

        Random r = new Random();
        int rzutK100 = r.nextInt(10);
        losowanieLiczby = losowanieLiczby + rzutK100 * 10 - 10;

        switch (losowanieLiczby) {
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
