public class CreditPaymentService {
    public double calculate(int credit, int period, double percent) {
        double monthlyPayment = credit * (((percent / (12*100)) * Math.pow((1 + (percent / (12*100))), period)) / (Math.pow((1 + (percent / (12*100))), period) - 1));
        int imonthlyPayment = (int)Math.round(monthlyPayment);
    return imonthlyPayment;
    }
}
