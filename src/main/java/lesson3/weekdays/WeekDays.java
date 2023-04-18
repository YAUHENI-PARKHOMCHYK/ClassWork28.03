package lesson3.weekdays;

import java.util.Arrays;

public enum WeekDays {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;


    public static void main(String[] args) {
        System.out.println(MONDAY);
        System.out.println(SUNDAY.ordinal());
        System.out.println(Arrays.toString(WeekDays.values()));

        WeekDays day = WeekDays.FRIDAY;
        day = WeekDays.valueOf("WEDNESDAY");
        System.out.println(day);
    }

}
