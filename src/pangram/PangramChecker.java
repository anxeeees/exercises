package pangram;

public class PangramChecker {

    public boolean isPangram(String input) {
        boolean[] alphabetPresent = new boolean[26];

        for (char currentChar : input.toLowerCase().toCharArray()) {
            if (Character.isLetter(currentChar)) {
                alphabetPresent[currentChar - 'a'] = true; // index
            }
        }

        for (boolean letter : alphabetPresent) {
            if (!letter) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        PangramChecker pangramChecker = new PangramChecker();
        System.out.println(pangramChecker.isPangram("The quick brown fox jumps over the lazy dog."));
    }
}