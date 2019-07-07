import java.util.Scanner;

public class HoneyMoon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String city = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());
        double price = 0;
        if (city.equals("Cairo")){
            price = (nights * 250 * 2) + 600;
            if (nights >=1 && nights <=4) {
                price = price - price * 0.03;
            } else if (nights >=5 && nights <= 9) {
                price = price - price * 0.05;
            } else if (nights >= 10 && nights <= 24) {
                price = price - price * 0.10;
            } else if (nights >= 25 && nights <= 49) {
                price = price - price * 0.17;
            } else if (nights >= 50) {
                price = price - price * 0.30;
            }
        }
        if (city.equals("Paris")) {
            price = (nights * 150 * 2) + 350;
            if (nights >= 5 && nights <=9) {
                price = price - price * 0.07;
            } else if (nights >= 10 && nights <= 24) {
                price = price - price * 0.12;
            } else if (nights >= 25 && nights <= 49) {
                price = price - price * 0.22;
            } else if (nights >= 50) {
                price = price - price * 0.30;
            }
        }
        if (city.equals("Lima")){
            price = (nights * 400 * 2) + 850;
            if (nights >= 25 && nights <= 49) {
                price = price - price * 0.19;
            } else if (nights >= 50) {
                price = price - price * 0.30;
            }
        }
        if (city.equals("New York")) {
            price = (nights * 300 * 2) + 650;
            if (nights >=1 && nights <=4) {
                price = price - price * 0.03;
            } else if (nights >=5 && nights <= 9) {
                price = price - price * 0.05;
            } else if (nights >= 10 && nights <= 24) {
                price = price - price * 0.12;
            } else if (nights >= 25 && nights <= 49) {
                price = price - price * 0.19;
            } else if (nights >= 50) {
                price = price - price * 0.30;
            }
        }
        if (city.equals("Tokyo")) {
            price = (nights * 350 * 2) + 700;
            if (nights >= 10 && nights <= 24){
                price = price - price * 0.12;
            } else if (nights >= 25 && nights <= 49) {
                price = price - price * 0.17;
            } else if (nights >= 50) {
                price = price - price * 0.30;
            }
        }
        double leftMoney = budget - price;
        double neededMoney = price - budget;

        if (budget >= price) {
            System.out.printf("Yes! You have %.2f leva left.", leftMoney);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", neededMoney);
        }
    }
}
