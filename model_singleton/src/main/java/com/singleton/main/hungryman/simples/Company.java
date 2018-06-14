package com.singleton.main.hungryman.simples;

import com.singleton.main.PrintUtil;
import java.util.ArrayList;
import java.util.List;

/**
 *公司类
 */
public class Company {
    private List<Staff> mStaffList=new ArrayList<>();
    public void addStaff(Staff staff){
        mStaffList.add(staff);
    }

    public void showAllList(){
        for (Staff staff : mStaffList) {
            staff.work();
        }
    }
}
