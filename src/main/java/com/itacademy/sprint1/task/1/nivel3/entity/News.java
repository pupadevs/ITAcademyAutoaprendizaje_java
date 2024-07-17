package com.itacademy.sprint1.nivel3.entity;

public class News {
    private String title;
    private String text;
    private Double point;
    private Double price;

    public News(String title, String text, Double point, Double price) {
        this.title = title;
        this.text = text;
        this.point = point;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }

    public Double getPoint() {
        return point;
    }

    public Double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "News{" +
                "title='" + title + '\'' +
                ", text='" + text + '\'' +
                ", point=" + point +
                ", price=" + price +
                '}';
    }
}
