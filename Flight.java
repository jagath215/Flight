package Flight;

import java.sql.Time;
import java.util.ArrayList;
import java.util.*;


public class Flight {

    private String froDesti;
    private int num;
    private String toDesti;
    private String ftime;
    private String fdate;
    private int fprice;
    static int count;

    public Flight(int num,String froDesti, String toDesti, String ftime, String fdate, int price, int ind){
        if (toDesti.equals(froDesti)) {
            throw new IllegalArgumentException("destination and origin are the same");
        }
        this.num=num;
        this.froDesti=froDesti;
        this.toDesti=toDesti;
        this.ftime=ftime;
        this.fdate=fdate;
        this.fprice=price;
        count=ind;
    }
    public String getFroDesti() {
        return froDesti;
    }

    public void setFroDesti(String froDesti) {
        this.froDesti = froDesti;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getToDesti() {
        return toDesti;
    }

    public void setToDesti(String toDesti) {
        this.toDesti = toDesti;
    }

    public String getFtime() {
        return ftime;
    }

    public void setFtime(String ftime) {
        this.ftime = ftime;
    }

    public String getFdate() {
        return fdate;
    }

    public void setFdate(String fdate) {
        this.fdate = fdate;
    }

    public int getFprice() {
        return fprice;
    }

    public void setFprice(int fprice) {
        this.fprice = fprice;
    }

    @Override
    public String toString() {
        String one = "Flight " + num;
        String two = "," + froDesti + " to " + toDesti;
        String three = "," + ftime;
        String four = ", original price: " + fprice + "Rs.";
        return one + two + three + four;
    }

    //    static ArrayList<ArrayList> flight;
//    static int num;
//
//    public Flight(ArrayList flights){
//        flight.add(flights);
//    }
//    public static int getNum(){
//        return num;
//    }
//    public static ArrayList searchFli(){
//
//    }
}