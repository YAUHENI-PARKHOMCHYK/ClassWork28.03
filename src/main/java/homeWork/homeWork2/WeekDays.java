package homeWork.homeWork2;

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

}

