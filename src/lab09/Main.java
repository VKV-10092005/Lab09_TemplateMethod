
package lab09;

public class Main {

    public static void main(String[] args) {

        // Don hang 1: Thanh toan COD
        Order order1 = new Order(
            "ORD001",
            "Nguyen Van A",
            "Laptop",
            1,
            15000000
        );

        // Don hang 2: Chuyen khoan
        Order order2 = new Order(
            "ORD002",
            "Tran Thi B",
            "Chuot may tinh",
            2,
            300000
        );

        // Xu ly don hang COD
        OrderProcessor codProcessor =
            new CODOrderProcessor();

        System.out.println("TRUONG HOP 1: COD");
        codProcessor.processOrder(order1);

        // Xu ly don hang chuyen khoan
        OrderProcessor bankProcessor =
            new BankTransferOrderProcessor();

        System.out.println("TRUONG HOP 2: BANK TRANSFER");
        bankProcessor.processOrder(order2);
        
	     // Don hang 3: Du lieu khong hop le
	        Order order3 = new Order(
	            "ORD003",
	            "Le Van C",
	            "Ban phim",
	            0,
	            500000
	        );
	
	        System.out.println("TRUONG HOP 3: DON HANG KHONG HOP LE");
	
	        codProcessor.processOrder(order3);
    }
}
