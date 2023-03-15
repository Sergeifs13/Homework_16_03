import java.util.Objects;

public class MyDate {
    private int day;
    private String month;
    private int year;

    public MyDate(int day, String month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MyDate myDate)) return false;
        return day == myDate.day && year == myDate.year && Objects.equals(month, myDate.month);
    }

    @Override
    public int hashCode() {
        return Objects.hash(day, month, year);
    }
}
