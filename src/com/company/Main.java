package com.company;

import java.util.*;

public class Main {
    private Chemical read(Scanner sc) {
        System.out.println("Please enter");
        int t = sc.nextInt();
        int e = sc.nextInt();
        int r = sc.nextInt();
        return new Chemical(t,e,r);
    }
    private void run() {
        List<Chemical> list = new ArrayList<Chemical>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0;i<5;i++) {
            list.add(read(sc));
        }
        sort(list);
    }
    private void sort(List<Chemical> list) {
        Collections.sort(list);
        for (Chemical obj : list) {
            System.out.println("1.7 * " + obj.getT() + " + 5.4 * " + obj.getE() + " + 4.9 *" + obj.getR() + " = " + obj.getChDanger());
        }
    }
    public static void main(String[] args) {
        new Main().run();
    }
}
