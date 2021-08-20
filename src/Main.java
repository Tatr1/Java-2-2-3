public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        double creditOneYear = service.calculate(1_000_000, 12, 9.99);
        System.out.println(creditOneYear);

        double creditTwoYear = service.calculate(1_000_000, 24, 9.99);
        System.out.println(creditTwoYear);

        double creditThreeYear = service.calculate(1_000_000, 36, 9.99);
        System.out.println(creditThreeYear);
    }
}
