/*
This Order class developed for buy and sell stocks.
There are three cases in stock trading situation.
1.New order
2.Set order prices
3.Calculate order price
This Java program meet this demand.
*/

public class Order{
    // Builder pattern
    static class Builder{
        private String security;
        private int quantity;
        private int limitPrice;
        private boolean allOrNone;
        private int value;
        private String boughtOrSold;

        public Builder(){}

        // This method is used when you buy stocks.
        public Builder buy(){
                this.boughtOrSold = "Bought:";
                this.quantity = quantity;
                this.security = security;
                return this;
        }

        // This method is used when you sell stocks.
        public Builder sell(int quantity,String security){
            this.boughtOrSold = "Sold:";
            this.quantity = quantity;
            this.security = security;
            return this;
        }

        // This method is used when you set limit price of stocks.
        public Builder atLimitPrice(int p){
            this.limitPrice = p;
            return this;
        }

        public Builder allOrNone(){
            this.allOrNone = true;
            return this;
        }

        public Builder valueAs(Override ov){
            this.value = ov.valueAs(quantity,limitPrice);
            return this;
        }

        public Order build(){
            return new Order(this);
        }
    }
    // immutable variables
    private final String security;
    private final int quantity;
    private final int limitPrice;
    private final boolean allOrNone;
    private int value;
    private final String boughtOrSold;

    private Order(Builder b){
        security = b.security;
        quantity = b.quantity;
        limitPrice = b.limitPrice;
        allOrNone = b.allOrNone;
        value = b.value;
        boughtOrSold = b.boughtOrSold;
    }

    // getter
}