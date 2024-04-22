package src.base.day18;

import java.util.Objects;

class MyDate_ {
    int year;
    int month;
    int day;

    public MyDate_(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            MyDate_ myDate = (MyDate_)o;
            return this.year == myDate.year && this.month == myDate.month && this.day == myDate.day;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.year, this.month, this.day});
    }
}
