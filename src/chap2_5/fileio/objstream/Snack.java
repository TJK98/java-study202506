package chap2_5.fileio.objstream;

import java.io.Serializable;

// 이 클래스의 객체가 스트림을 통과하기 위해 직렬화 시킴
public class Snack implements Serializable {

    public enum Taste {
        GOOD, BAD
    }

    private String snackName;
    private int year;
    private int price;
    private Taste taste;

    public Snack() {
    }

    public Snack(String snackName, int year, int price, Taste taste) {
        this.snackName = snackName;
        this.year = year;
        this.price = price;
        this.taste = taste;
    }

    public String getSnackName() {
        return snackName;
    }

    public void setSnackName(String snackName) {
        this.snackName = snackName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Taste getTaste() {
        return taste;
    }

    public void setTaste(Taste taste) {
        this.taste = taste;
    }
}
