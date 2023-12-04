package varAssignment;

public class Program {
    public static String nameString(String name) {
        String b = "Edabit";
        String result = name.concat(b);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(nameString("Mubashir"));
    }
}