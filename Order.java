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

        public Builder buy(){
                this.boughtOrSold = "Bought:";
                this.quantity = quantity;
                this.security = security;
                return this;
        }

        public Builder sell(int quantity,String security){
            this.boughtOrSold = "Sold:";
            this.quantity = quantity;
            this.security = security;
            return this;
        }

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
}