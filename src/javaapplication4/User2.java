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
class User2 {
    private String name,department,id;
     
     public User2(String name,String department,String id)
     {
         this.name=name;
         this.department=department;
         this.id=id;
         
         
     }
     public String getname(){
         return name;
     }
      public String getdepartment(){
         return department;
         
     } 
      public String getid(){
         return id;
     }
}
