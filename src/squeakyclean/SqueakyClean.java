package squeakyclean;

public class SqueakyClean {

    static String clean(String identifier) {
        return identifier.replace(' ','_');
    }

    public static void main(String[] args) {
        System.out.println(SqueakyClean.clean("my   Id"));

    }


}
