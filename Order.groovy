class Order {
    def security
    def quantity
    def limitPrice
    def allOrNone
    def value
    def bs

    def buy(su,closure){
        bs = 'Sold'
        buy_sell(su,closure)
    }
    
    def sell(su,closure){
        bs = 'Sold'
        buy_sell(su,closure)
    }

    private buy_sell(su,closure){
        security = su[0]
        quantity = su[1] closure()

    def getTo(){
        this
        }

    // 1.Hook to intercept calling unvalid method.
    def methodMissing(String name,args){
        order.metaClass.getMetaProperty(name).setProperty(order,args)
    }

    def getNewOrder()){
        order = new Order()
    }

    // 2.Clojure to express designated method of calculating price.
    def valueAs(closure){
        order.value = closure(order.quantity,order.limitPrice[0])
    }

    // 3.Insert new method.
    Integer.metaClass.getShares = { -> delegate }
    Integer.metaClass.of = {instrument -> [instrument,delegate] }

    }
}