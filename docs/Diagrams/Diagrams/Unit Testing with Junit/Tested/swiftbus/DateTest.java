/**
 * DateTest class
 */
public class DateTest {

    private int day;
    private int month;
    private int year;

    // Default constructor
    public DateTest() {
    }

    // Parameterized constructor
    public DateTest(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // Getter and Setter for day
    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    // Getter and Setter for month
    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    // Getter and Setter for year
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Return formatted date
    public String getFormattedDate() {
        return day + "/" + month + "/" + year;
    }
}
