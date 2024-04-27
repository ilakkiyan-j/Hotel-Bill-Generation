package proj;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainClass {
    public static void main(String[] args) throws Exception {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        HotelBillService h = new HotelBillService();
        Date bookingDate = formatter.parse("11/06/2017");
        Date departureDate = formatter.parse("10/07/2017");
        System.out.println(h.calculateBill("CC112233", bookingDate, departureDate, "AC"));
    }
}