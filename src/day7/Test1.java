package day7;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入机票的原价");
        int ticket = sc.nextInt();
        System.out.println("请输入当前的月份");
        int month = sc.nextInt();
        System.out.println("请输入当前买的仓位 0 头等舱 1 经济舱");
        int seat = sc.nextInt();
        if (month >= 5 && month <= 10) {
            ticket = getTicket(ticket, seat, 0.9, 0.85);
        } else if ((month >= 1 && month <= 4) || (month >= 11 && month <= 12)) {
            ticket = getTicket(ticket, seat, 0.7, 0.65);
        } else {
            System.out.println("键盘录入的月份不合法");
        }
        System.out.println(ticket);
        sc.close();
    }

    public static int getTicket(int ticket, int seat, double v, double v2) {
        if (seat == 0) {
            ticket = (int) (ticket * v);
        } else if (seat == 1) {
            ticket = (int) (ticket * 2);
        } else {
            System.out.println("没有这个舱位");
        }
        return ticket;
    }
}
