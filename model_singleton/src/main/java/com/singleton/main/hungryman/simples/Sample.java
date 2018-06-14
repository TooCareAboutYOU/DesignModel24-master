package com.singleton.main.hungryman.simples;

/**
 *
 */
public class Sample {

    public static void main(String[] args) {
        Company company=new Company();
        for (int i = 0; i < 3; i++) {
            //CEO对象只能通过getCEO获取
            Staff staff=CEO.getCEO();
            company.addStaff(staff);
        }
        for (int i = 0; i < 3; i++) {
            //通过new 创建VP对象
            Staff staff=new VP();
            company.addStaff(staff);
        }
        for (int i = 0; i < 3; i++) {
            //通过new 创建Staff对象
            Staff staff=new Staff();
            company.addStaff(staff);
        }
        company.showAllList();
    }
}
