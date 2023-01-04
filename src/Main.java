public class Main {
    public static void main(String[] args) {
        int coefficient;
        int sum;
        int time;
        double percent;
        CreditPaymentService credit = new CreditPaymentService();
        sum = 1_000_000;
        time = 12;
        percent = 9.99;
        coefficient = (int) credit.calculate(sum, time, percent);
        System.out.println("Сумма кредита " + sum + ",  Ежемесячный платеж " + coefficient + ",  Процентная ставка " + percent);

        time = 24;
        coefficient = (int) credit.calculate(sum, time, percent);
        System.out.println("Сумма кредита " + sum + ",  Ежемесячный платеж " + coefficient + ",  Процентная ставка " + percent);

        time = 36;
        coefficient = (int) credit.calculate(sum, time, percent);
        System.out.println("Сумма кредита " + sum + ",  Ежемесячный платеж " + coefficient + ",  Процентная ставка " + percent);


    }
}