package reverseString;

public class ReverseString {
    StringBuilder stringBuilder = new StringBuilder();

    String reverse(String inputString) {
        char[] characters = inputString.toCharArray();
        // array of characters from the word u put into it

        for (int i = characters.length - 1; i >= 0; i--) {
            stringBuilder.append(characters[i]);

        }
        return stringBuilder.toString();

    }


    public static void main(String[] args) {
        ReverseString reverseString = new ReverseString();
        System.out.println(reverseString.reverse("mymum"));
    }

}

