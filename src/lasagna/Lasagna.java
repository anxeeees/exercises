package lasagna;

public class Lasagna {

    // TODO: define the 'expectedMinutesInOven()' method

    public int expextedMinutes = 40;

    public int expectedMinutesInOven() {
        return expextedMinutes;
    }

    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int minutesInOven) {
        return expextedMinutes - minutesInOven;
    }

    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int numOfLayers) {
        return numOfLayers*2;
    }


    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int numOfLayers, int minutesInOven) {
        return numOfLayers*2 + minutesInOven;
    }

}
