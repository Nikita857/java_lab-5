
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        shop();
    }

    public static void shop() {
        String[] products = {"Хлеб", "Вода", "Молоко", "Рыба", "Яйца","Пиво","Печеньки","Шоколад"};
        int[] prices = {30, 25, 60, 200, 120,60,100,90};

        System.out.println("Ассортимент товаров\n***********************************");

        for (int i = 0; i < products.length; i++) {
            System.out.println("Номер товара: " + (i + 1) + " " + products[i] + " Цена/шт: " + prices[i] + " руб");
        }

        System.out.println("***********************************");

        String[] bag = new String[products.length];

        Scanner in = new Scanner(System.in);

        int counter = 0;
        int totalPrice = 0;

        try {
            while (true) {
                int amount = 0;
                int productNumber = 0;

                System.out.println("Введите номер товара и количество или end для завершения программы");

                String parts = in.nextLine();

                if(parts.equals("end")){
                    System.out.println("Программа завершилась");
                    break;
                }

                String[]arr = parts.split(" ");
                productNumber += Integer.parseInt(arr[0])-1;

                amount += Integer.parseInt(arr[1]);

                if (amount <= 0) {
                    bag[counter] += "";
                }

                bag[counter] = "Товар: " + products[productNumber] + " Количество: " + amount + " Цена: " + (prices[productNumber]) * amount + " Рублей";

                System.out.println("Товаров в корзине: " + (counter + 1));

                totalPrice += totalPrice(prices, amount, productNumber);

                counter++;
            }
        } finally {
            if (bag[0] != null) {
                System.out.println("Корзина\n***********************************");
                for (int j = 0; j < bag.length; j++) {
                    if (bag[j] != null) {
                        System.out.println(bag[j]);
                    }
                }
                System.out.println("Стоимость всех товаров " + totalPrice + " Рублей");
                System.out.println("***********************************");
            } else {
                System.out.println("Корзина пуста");
            }
        }
    }
    public static int totalPrice(int[]prices, int amount, int productNumber){
        int totalPrice = (prices[productNumber])*amount;
        return totalPrice;
    }

}