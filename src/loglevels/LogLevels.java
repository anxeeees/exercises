package loglevels;

public class LogLevels {

    static String[] parts;

    static String part1;

    static String part2;

    static String part3;

    public static String message(String logLine) {
        parts = logLine.split(":");
        if (parts.length == 2) {
            part1 = parts[0].trim(); // Get the first part
            part2 = parts[1].trim(); // Get the second part
        }
        return part2;

    }

    public static String logLevel(String logLine) {
        parts = logLine.split(":");
        if (parts.length == 2) {
            part1 = parts[0].trim().replace("[", "").replace("]", ""); // Get the first part
            part2 = parts[1].trim(); // Get the second part
        }
        return part1.toLowerCase();
    }

    public static String reformat(String logLine) {
        parts = logLine.split(":");
        if (parts.length == 2) {
            part1 = parts[0].toLowerCase().trim().replace("[", "(").replace("]", ")");
            part2 = parts[1].trim(); // Get the second part
        }
        String cleanedPart2 = part2.replaceAll("(?<!\\\\)\\\\t|(?<!\\\\)\\\\r|(?<!\\\\)\\\\n", "");

        return  cleanedPart2 + " " + part1 ;
    }


    public static void main(String[] args) {
        System.out.println( LogLevels.reformat("[ERROR]: \t Corrupt disk\t \t \r\n"));


    }
}
