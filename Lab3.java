package Lap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Lab3 {
    public static void main(String[] args) {
        Map<Integer,String> list = new HashMap<>();
        Scanner s = new Scanner(System.in);
        System.out.print("Nhập n: ");
        int n=Integer.parseInt(s.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhập giá trị phần tử thứ %d: ",i+1);
            String value = s.nextLine();
            list.put(i+1,value);
        }
        System.out.println("List sau khi sắp xếp: ");
        for(Map.Entry<Integer,String> entrySet : list.entrySet()){
            int key = entrySet.getKey();
            String value = entrySet.getValue();
            System.out.println(key + " - " + value);
        }
    }
}
