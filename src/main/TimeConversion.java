package main;

public class TimeConversion {
    public static int convertSecondsToMinutes(int seconds) {
        return seconds / 60;
    }

    public static int convertSecondsToHours(int seconds) {
        int minutes = seconds / 60;
        return minutes / 60;
    }

    public static int convertMinutesToSeconds(int minutes) {
        return minutes * 60;
    }

    public static int convertMinutesToHours(int minutes) {
        return minutes / 60;
    }

    public static int convertHoursToMinutes(int hours) {
        return hours * 60;
    }

    public static int convertHoursToSeconds(int hours) {
        return hours * 3600;
    }

}
