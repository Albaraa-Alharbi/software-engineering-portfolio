public class Store {
    
    public double calc(P item, int amt, double d) { // amt: amount to buy, d: discount percentage
        double res = 0;
        
        // Checks availability
        if (item.q >= amt) {
            res = item.p * amt;
            
            // Perform discount
            if (d > 0) {
                res = res - (res * (d / 100));
            }
        } else {
            System.out.println("No stock");
        }
        
        return res;
    }
}