package Lap;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Lab2 {
    public static void main(String[] args) {
        Set<String> list = new HashSet<>();
        Scanner s = new Scanner(System.in);
        System.out.print("Nhập n: ");
        int n= Integer.parseInt(s.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhập giá trị phần tử thứ %d: ",i+1);
            String value = s.nextLine();
            list.add(value);
        }
        System.out.print("List sau khi sắp xếp: ");
        for(String i: list){
            System.out.print(i + "  ");
        }
    }
}
