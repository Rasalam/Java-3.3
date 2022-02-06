public class CreditPaymentService {
    public float calculate(int numberOfYear, float percentY, float creditSum) {
        float percentM = percentY/100 / 12;                 // Месячная % ставка (доли единицы)
        int numberOfMonth = numberOfYear * 12;              // Количество месяцев
        float payPerMonth = (float) (creditSum *                  // Сумма ежемес. платежа
                              ((percentM * Math.pow((1 + percentM), numberOfMonth))/
                              (Math.pow((1 + percentM), numberOfMonth) - 1)));
        return payPerMonth;
    }
}

