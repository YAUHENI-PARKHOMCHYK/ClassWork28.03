package homeWork.homeWork2;

import java.util.Arrays;

public enum WeekDays {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;


    public boolean isWorkDay()
    {

        return !isWeekEnd();
    }

    public boolean isWeekEnd()
    {

        return ordinal() == 5 || ordinal() == 6;
    }

    public static void main(String[] args) {
        System.out.println(MONDAY);
        System.out.println(SUNDAY.ordinal());
        System.out.println(
                Arrays.toString(
                        WeekDays.values()
                )
        );

        WeekDays day = WeekDays.FRIDAY;
        WeekDays day1 = WeekDays.valueOf("WEDNESDAY");
        System.out.println(WeekDays.valueOf("WEDNESDAY").ordinal());
        System.out.println(WeekDays.values()[2]);
        System.out.println(day.isWorkDay());
        System.out.println(day.isWeekEnd());

    }

}

