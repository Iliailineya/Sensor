package app;

class Indicator {
    public static String indicateColor(int temperature) {
        return (temperature <= 0) ? "white" : "black";
    }

    public static String indicateWeight(int temperature) {
        return temperature <= 0 ? "1" : Integer.toString(temperature * 2 + 1);
    }
}