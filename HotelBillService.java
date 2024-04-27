package proj;

import java.text.SimpleDateFormat;
import java.util.Date;

class HotelBillService {
    public String validateData(String customerId, Date bookingDate, Date departureDate, String roomType) {
        if (customerId == null || customerId.length() != 8)
            return "Invalid Data";

        if (bookingDate.after(departureDate))
            return "Invalid Data";

        if (!roomType.equals("AC") && !roomType.equals("Non-AC"))
            return "Invalid Room Type";

        return "Valid";
    }

    public int getDaysStayed(Date bookingDate, Date departureDate) {
        return (int) ((departureDate.getTime() - bookingDate.getTime()) / 86400000);
    }

    public String calculateBill(String customerId, Date bookingDate, Date departureDate, String roomType) {
        String validationStatus = validateData(customerId, bookingDate, departureDate, roomType);
        if (!validationStatus.equals("Valid"))
            return validationStatus;

        Customer customer = new Customer(customerId, bookingDate, departureDate, roomType);
        int daysStayed = getDaysStayed(bookingDate, departureDate);
        double tariffPerDay = customer.getTariffPerDay();
        double billAmount = daysStayed * tariffPerDay;
        double tax = 0;

        if (billAmount <= 5000)
            tax = billAmount * 0.05;
        else if (billAmount <= 10000)
            tax = billAmount * 0.10;
        else
            tax = billAmount * 0.20;

        customer.billAmount = billAmount + tax;

        return customer.toString();
    }
}
