/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

/**
 *
 * @author Abhi
 */
class User {
     private String patient_name,sex,address,city,date;
     
     public User(String patient_name,String sex,String address,String city,String date)
     {
         this.patient_name=patient_name;
         this.sex=sex;
         this.address=address;
         this.city=city;
         this.date=date;
         
     }
     public String getname(){
         return patient_name;
     }
      public String getsex(){
         return sex;
         
     } 
      public String getaddress(){
         return address;
     } public String getcity(){
         return city;
     }
     public String getdate(){
         return date;
     }
     
}
