package squeakyclean;

import java.util.regex.Pattern;
class SqueakyClean {
    static String clean(String identifier) {
        return Pattern.compile("-(\\p{IsAlphabetic})")//looking for -
                .matcher(identifier)
                .replaceAll(m -> m.group().toUpperCase())//replacing the word after - with Upper Case
                .replaceAll("\s", "_") // all spaces with _
                .replaceAll("\\p{Cntrl}", "CTRL")
                .replaceAll("[^_\\p{IsAlphabetic}]", "") // deletes everything that is not letter
                .replaceAll("[α-ω]", "");
    }
}