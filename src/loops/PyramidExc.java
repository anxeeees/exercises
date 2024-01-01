package loops;

public class PyramidExc {
    public static void main(String[] args) {
        int rows = 5;
        //1
        for (int i = 5; i >= 0; i--) { // 5 4 3 2 1
            System.out.println(" ");
            for (int j = 0; j < i; j++) {
                System.out.print(". ");
            }
            System.out.println();
        }


        //2
        for (int i = 0; i <= rows; i++) { // 0// 1 2 3 4 5
            System.out.println(" ");
            for (int j = 0; j < i; j++) { // filling . j < i , 0 1 2 3 4
                System.out.print(". ");
            }

            for (int l = i; l < rows - i + 7; l++) { // space, l = 4, space = 4
                System.out.print("  ");
            }

            for (int k = 0; k < i; k++) { // .
                System.out.print(". ");
            }
            System.out.println();
        }

        //3
        for (int i = 0; i < rows; i++) {
            System.out.println(" ");

            for (int j = 0; j < rows - i + 6; j++) { // space on each row
                System.out.print("  ");
            }

            for (int k = 0; k <= i; k++) {
                System.out.print(". ");
            }

            System.out.println("  ");


        }


    }
}







