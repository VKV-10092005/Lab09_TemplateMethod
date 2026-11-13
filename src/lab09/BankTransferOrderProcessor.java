
package lab09;

public class BankTransferOrderProcessor
        extends OrderProcessor {

    @Override
    protected boolean processPayment(long total) {
        System.out.println(
            "4. Thanh toan: Chuyen khoan ngan hang"
        );

        System.out.println(
            "Da ghi nhan thanh toan "
            + total + " VND."
        );

        return true;
    }
}
