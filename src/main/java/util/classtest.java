package util;

import java.util.Scanner;

public class classtest {
    int year;
    int month;
    int day;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void classtest() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入年份（范围在1912-2050之间）：");
        year = scanner.nextInt();
        System.out.println("请输入月份（范围在1-12之间）：");
        month = scanner.nextInt();
        System.out.println("请输入年份（范围在1-31之间）：");
        day = scanner.nextInt();
        System.out.println("%d年%d月%d日的下一天是：" + year + month + day);
        System.out.println(year + month + day);
        System.out.println("pause");
    }

    public void nextdate() {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
                if (day > 0 && day <= 30) {
                    day = day + 1;
                    System.out.print(year+"年"+month+"月"+day+"日");
                } else {
                    month = month + 1;
                    day = 1;
                    System.out.print(year+"年"+month+"月"+day+"日");
                }
                break;
            case 12:
                if (day > 0 && day <= 30) {
                    day = day + 1;
                    System.out.print(year+"年"+month+"月"+day+"日");
                } else {
                    month = 1;
                    day = 1;
                    year = year + 1;
                    System.out.print(year+"年"+month+"月"+day+"日");
                }
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                if (day > 0 && day <= 29) {
                    day = day + 1;
                    System.out.print(year+"年"+month+"月"+day+"日");
                } else {
                    month = month + 1;
                    day = 1;
                    System.out.print(year+"年"+month+"月"+day+"日");
                }
                break;
            case 2:
                if (day > 0 && day <= 27) {
                    day = day + 1;
                    System.out.print(year+"年"+month+"月"+day+"日");
                } else if (!leap(year) && day == 28) {
                    day = 1;
                    month = month + 1;
                    System.out.print(year+"年"+month+"月"+day+"日");
                } else if (leap(year) && day == 29) {
                    day = 1;
                    month = month + 1;
                    System.out.print(year+"年"+month+"月"+day+"日");
                } else {
                    System.out.println("输入数据错误！");
                    return;
                }
        }
    }
    public boolean leap(int yy) {
        boolean b = yy % 400 == 0 || yy % 4 == 0 && yy / 100 != 0;
        return b;
    }
}

