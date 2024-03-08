/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.singletonpattern;

/**
 *
 * @author vygir
 */
public class SingletonPattern {

    public static void main(String[] args) {
        CompanyInfo companyInfo = CompanyInfo.getInstance();
        
        companyInfo.displayInfo();
        
        companyInfo.setCompanyName("EIU-Đại học Quốc tế Miền Đông");
        companyInfo.setAddress("3M38+6F3, Nam Kỳ Khởi Nghĩa, Định Hòa, Thủ Dầu Một, Bình Dương");
        companyInfo.setPhoneNumber("(+84) 0274 222 0372");
        
        companyInfo.displayInfo();
    }
}
