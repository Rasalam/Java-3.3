public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int numberOfYear;                           // Срок кредита, лет
        float percentY;                             // Годовая % ставка
        float creditSum;                            // Сумма кредита
        float payPerMonth;                                // Ежемесячный платеж

        // Срок кредита 1 год, годовая ставка 9,99%, сумма кредита 1_000_000 руб.
        numberOfYear = 1;
        percentY = 9.99F;
        creditSum = 1_000_000;
        payPerMonth = service.calculate(numberOfYear, percentY, creditSum);
        System.out.println("Ежемесячный платеж: " + (long) payPerMonth + " руб. Процентная ставка: " + percentY + "%");

        // Срок кредита 2 года, годовая ставка 9,99%, сумма кредита 1_000_000 руб.
        numberOfYear = 2;
        percentY = 9.99F;
        creditSum = 1_000_000;
        payPerMonth = service.calculate(numberOfYear, percentY, creditSum);
        System.out.println("Ежемесячный платеж: " + (long) payPerMonth + " руб. Процентная ставка: " + percentY + "%");

        // Срок кредита 3 года, годовая ставка 9,99%, сумма кредита 1_000_000 руб.
        numberOfYear = 3;
        percentY = 9.99F;
        creditSum = 1_000_000;
        payPerMonth = service.calculate(numberOfYear, percentY, creditSum);
        System.out.println("Ежемесячный платеж: " + (long) payPerMonth + " руб. Процентная ставка: " + percentY + "%");


    }
}
