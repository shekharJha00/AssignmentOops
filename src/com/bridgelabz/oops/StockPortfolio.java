package com.bridgelabz.oops;

import java.util.ArrayList;
import java.util.Scanner;

public class StockPortfolio {
    static double totalStockValue = 0;
    Scanner scanner = new Scanner(System.in);
    ArrayList<Stock> stocks = new ArrayList<>();
    Account account = new Account();

    public static void main(String[] args) {

        StockPortfolio stockPF = new StockPortfolio();

        stockPF.addBalance();
        stockPF.stockCalculator();
        stockPF.buyStocks();
    }

    public void stockCalculator() {
        totalStockValue = 0;
        System.out.println("Enter how many companies Stocks do you want to buy : ");
        int company = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < company; i++) {
            System.out.println("Enter the detail for company " + (i + 1));
            System.out.println("Enter the Name of the Share : ");
            String shareName = scanner.nextLine();
            System.out.println("Enter how many share you want to buy for " + shareName + " company : ");
            int numberOfShare = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter the price of " + shareName + " share : ");
            double priceOfShare = scanner.nextDouble();
            scanner.nextLine();
            double priceOfStock = (double) numberOfShare *  priceOfShare;
            stocks.add(new Stock(shareName, numberOfShare, priceOfShare));
            totalStockValue += priceOfStock;
        }
        System.out.println(stocks);
        System.out.println("Your total value of all the stocks is : " + totalStockValue + "Rs");
    }

    public void addBalance() {
        System.out.println("Enter the amount you want to deposit to your account : ");
        account.setBalance(scanner.nextDouble());
        scanner.nextLine();
        System.out.println("Your account balance is : " + account.getBalance());

    }

    public void buyStocks() {
        System.out.println("Press 1 to buy the Stocks : ");
        System.out.println("Press 2 to cancel the transaction : ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                account.debit(totalStockValue);
                break;
            case 2:
                System.out.println("Transaction Cancelled.");
                break;
        }
    }
}

