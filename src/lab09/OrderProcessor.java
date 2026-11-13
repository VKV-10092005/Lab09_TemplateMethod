
package lab09;

public abstract class OrderProcessor {

    public final void processOrder(Order order) {

        System.out.println("\n===== BAT DAU XU LY DON HANG =====");

        validateOrder(order);

        long total = calculateTotal(order);

        boolean paid = processPayment(total);

        updateStatus(paid);

        printInvoice(order, total);

        System.out.println("===== KET THUC XU LY =====\n");
    }

    // Buoc kiem tra chung
    protected void validateOrder(Order order) {
        if (order == null ||
            order.getOrderId() == null ||
            order.getOrderId().isBlank() ||
            order.getCustomerName() == null ||
            order.getCustomerName().isBlank() ||
            order.getProductName() == null ||
            order.getProductName().isBlank() ||
            order.getQuantity() <= 0 ||
            order.getUnitPrice() <= 0) {

            throw new IllegalArgumentException(
                "Thong tin don hang khong hop le!"
            );
        }

        System.out.println("1. Kiem tra don hang: Hop le");
    }

    // Buoc tinh tien chung
    protected long calculateTotal(Order order) {
        long subtotal =
            (long) order.getQuantity() * order.getUnitPrice();

        long shippingFee = 20000;

        long total = subtotal + shippingFee;

        System.out.println("2. Tinh tien san pham: "
                           + subtotal + " VND");

        System.out.println("3. Phi van chuyen: "
                           + shippingFee + " VND");

        return total;
    }

    // Buoc thanh toan thay doi theo tung loai
    protected abstract boolean processPayment(long total);

    // Cap nhat trang thai chung
    protected void updateStatus(boolean paid) {
        if (paid) {
            System.out.println("5. Trang thai: DA THANH TOAN");
        } else {
            System.out.println(
                "5. Trang thai: CHO THANH TOAN KHI NHAN HANG"
            );
        }
    }

    // Xuat hoa don chung
    protected void printInvoice(Order order, long total) {
        System.out.println("\n6. HOA DON DON HANG");
        System.out.println("Ma don: " + order.getOrderId());
        System.out.println("Khach hang: "
                           + order.getCustomerName());
        System.out.println("San pham: "
                           + order.getProductName());
        System.out.println("So luong: "
                           + order.getQuantity());
        System.out.println("Tong tien: " + total + " VND");
    }
}
