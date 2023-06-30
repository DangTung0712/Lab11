package Lap;

import java.util.Scanner;

public class Product {
    private String proId;
    private String proName;
    private String producer;
    private int yearMaking;
    private float price;

    public Product() {
    }

    public String getProId() {
        return proId;
    }

    public void setProId(String proId) {
        this.proId = proId;
    }

    public String getProName() {
        return proName;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public int getYearMaking() {
        return yearMaking;
    }

    public void setYearMaking(int yearMaking) {
        this.yearMaking = yearMaking;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "proId='" + proId + '\'' +
                ", proName='" + proName + '\'' +
                ", producer='" + producer + '\'' +
                ", yearMaking=" + yearMaking +
                ", price=" + price +
                '}';
    }
    public void input(){
        Scanner s = new Scanner(System.in);
        System.out.print("Nhập proId:");
        this.proId = s.nextLine();
        System.out.print("Nhập proName:");
        this.proName = s.nextLine();
        System.out.print("Nhập producer:");
        this.producer = s.nextLine();
        System.out.print("Nhập yearMaking:");
        this.yearMaking = Integer.parseInt(s.nextLine());
        System.out.print("Nhập price:");
        this.price = Float.parseFloat(s.nextLine());
    }
}
