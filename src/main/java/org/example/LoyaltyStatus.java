package org.example;

public class LoyaltyStatus{
    private String status;
    public LoyaltyStatus(String status) {
        if (!status.equals("member") && !status.equals("premium") && !status.equals("regular")) {
            throw new IllegalArgumentException("Price shall be negative");
        }
        else
            this.status = status;
    }

    public double discountPercentage(){
        switch(status){
            case "member":
                return 0.9;
            case "premium":
                return 0.75;
            default:
                return 1.0;
        }
    }
}

