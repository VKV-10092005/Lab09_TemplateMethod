
package lab09;

public class Order {
    private String orderId;
    private String customerName;
    private String productName;
    private int quantity;
    private long unitPrice;

    public Order(String orderId, String customerName,
                 String productName, int quantity,
                 long unitPrice) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.productName = productName;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public long getUnitPrice() {
        return unitPrice;
    }
}
