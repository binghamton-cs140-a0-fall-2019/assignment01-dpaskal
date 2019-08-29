package assignment01;

public class SimpleDate{
    public int year;
    public int month;
    public int day;

    // public SimpleDate(int yr, int mnth, int day){
    //     this.year = yr;
    //     this.month = mnth;
    //     this.date = day;
    // }

    public static SimpleDate of(int yr, int m, int d){
        var returnValue = new SimpleDate();
        returnValue.year = yr;
        returnValue.month = m;
        returnValue.day = d;
        return returnValue;
    }

    public boolean before(SimpleDate other){
        boolean returnValue = false;
        if (this.year == other.year && this.month == other.month && this.day == other.day){
            returnValue = false;
        }
        else if (this.year == other.year && this.month == other.month){
            returnValue = this.day < other.day;
        }
        else if (this.year == other.year){
            returnValue = this.month < other.month;
        }
        else {
            returnValue = this.year < other.year;
        }
        return returnValue;
    }
}