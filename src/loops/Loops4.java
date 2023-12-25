package loops;

import java.util.Scanner;

public class Loops4 {

    public static void main(String[] args) {
        // 1- Write if-else-if statement and then the same with switches for months and seasons
        Scanner scanner = new Scanner(System.in);
        int nos = scanner.nextInt();
        String season;

        if (nos == 12 || nos == 1 || nos == 2) {
            season = "Winter";
            System.out.println("Season is " + season);
        } else if (nos == 3 || nos == 4 || nos == 5) {
            season = "Spring";
            System.out.println("Season is " + season);
        } else if (nos == 6 || nos == 7 || nos == 8) {
            season = "Summer";
            System.out.println("Season is " + season);
        } else if (nos == 9 || nos == 10 || nos == 11) {
            season = "Autumn";
            System.out.println("Season is " + season);
        }

        switch (nos) {
            case 12:
            case 1:
            case 2:
                System.out.println("Season is Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Season is Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Season is Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Season is Autumn");
                break;

        }


    }


}

