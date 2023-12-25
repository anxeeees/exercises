package loops;

public class Loops5 {
    public static void main(String[] args) {
        // 1 - Write for with continue if number %2 = 0, continue writing on the same line
        // if it is not even, write the number on next line

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
                continue;
            }
            System.out.println(i);
        }
        // 2 - Write nested loop which looks like this
        //….. 5
        //…. 4
        //… 3
        //.. 2
        //. 1

        for (int i = 0; i < 6; i++) {
            for (int j = i; j < 5; j++) {
                System.out.print(".");
            }
            System.out.println(" ");
        }

        // 3 - Write program from 1 to 100 if the program hits 10 it breaks
        for (int i = 1; i < 100; i++) {
            if (i == 11) {
                break;
            }
            System.out.println(i);
        }
        //4 -Write nested loop that breaks the inner loop when it hits 10, the outside loop should look like this
        // (Student1: ….
        //Student2:
        // Student3:

        for (int i = 1; i < 4; i++) {
            System.out.print("Student " + i + ": ");
            for (int j = 0; j < 100; j++) {
                System.out.print(j + " ");
                if (j == 10) {
                    break;
                }
            }
            System.out.println(" ");


        }


    }

}
