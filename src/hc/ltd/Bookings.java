package hc.ltd;


class Bookings {
    
    private String name, phone, id, email, roomType, noOfDays, amt, paymentMethod;

    public Bookings(String name, String phone, String id, String email, String roomType, String noOfDays, String amt, String paymentMethod) {
        this.name = name;
        this.phone = phone;
        this.id = id;
        this.email = email;
        this.roomType = roomType;
        this.noOfDays = noOfDays;
        this.amt = amt;
        this.paymentMethod = paymentMethod;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getRoomType() {
        return roomType;
    }

    public String getNoOfDays() {
        return noOfDays;
    }

    public String getAmt() {
        return amt;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }
    
}
