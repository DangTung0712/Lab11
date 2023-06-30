package Lap;

import javafx.beans.binding.MapExpression;

import java.util.*;

public class ProductTest {
    Map<Integer,Product> list = new LinkedHashMap<>();
    public void input(){
        Product proD = new Product();
        Scanner s = new Scanner(System.in);
        System.out.print("Nhập n: ");
        int n=Integer.parseInt(s.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhập giá trị phần tử thứ %d: \n",i+1);
            proD.input();
            list.put(i+1,proD);
        }
    }
    public void display(){
        for (Map.Entry<Integer,Product> entrySet : list.entrySet()){
            System.out.println(entrySet.getKey() + " - "+entrySet.getValue().toString());
        }
    }
    public void sort(){

        List<Map.Entry<Integer,Product>> list = new ArrayList<>();
        Collections.sort(list,(o1,o2)-> (int) (o1.getValue().getPrice() - o2.getValue().getPrice()));

    }
    public static void main(String[] args) {
        ProductTest pt = new ProductTest();
        pt.input();
        pt.sort();
        pt.display();
    }
}
