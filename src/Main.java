public class Main {
    public static void main(String[] args) {
        BMI service = new BMI();
        int weightKg = 98;
        double heightM = 1.87;
        int miles = service.calculate(weightKg, heightM); // должно получиться 28
        System.out.println(miles);
    }
}