
package lab09;

public class CODOrderProcessor extends OrderProcessor {

    @Override
    protected boolean processPayment(long total) {
        System.out.println(
            "4. Thanh toan: Thanh toan khi nhan hang (COD)"
        );

        System.out.println(
            "Khach hang se thanh toan "
            + total + " VND khi nhan hang."
        );

        return false;
    }
}
