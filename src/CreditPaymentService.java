public class CreditPaymentService {

    public double calculate(double sum, double time, double percent) {
        double rate = percent / 100 / time;

        double payment = (rate * (Math.pow((1 + rate), time) / (Math.pow((1 + rate), time) - 1))) * 1_000_000;
        return payment;

    }
}
