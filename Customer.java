package proj;

import java.text.SimpleDateFormat;
import java.util.Date; 

class Customer {
    private String customerId;
    private Date bookingDate;
    private Date departureDate;
    private String roomType;
    public double billAmount;

    public Customer(String customerId, Date bookingDate, Date departureDate, String roomType) {
        this.customerId = customerId;
        this.bookingDate = bookingDate;
        this.departureDate = departureDate;
        this.roomType = roomType;
    }

    public double getTariffPerDay() {
        return roomType.equals("AC") ? 3725.00 : 2250.00;
    }

    public String toString() {
        return "Customer id: " + customerId + "\nBill Amount: Rs." + billAmount;
    }

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public Date getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}

	public Date getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(Date departureDate) {
		this.departureDate = departureDate;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public double getBillAmount() {
		return billAmount;
	}

	public void setBillAmount(double billAmount) {
		this.billAmount = billAmount;
	}

   
    
}