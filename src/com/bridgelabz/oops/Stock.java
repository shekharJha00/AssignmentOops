package com.bridgelabz.oops;

public class Stock {
    private final String shareName;
    private final int numberOfShares;
    private final double sharePrice;
    double totalStockPrice;

    public Stock(String shareName, int numberOfShares, double sharePrice) {
        this.shareName = shareName;
        this.numberOfShares = numberOfShares;
        this.sharePrice = sharePrice;
        totalStockPrice = (double) numberOfShares *  sharePrice;
    }

    @Override
    public String toString() {
        return "Stock [stockName=" + shareName + ", numberOfShares=" + numberOfShares + ", sharePrice=" + sharePrice
                + ", totalStockPrice=" + totalStockPrice + "]";
    }

}

