/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2minggu2;
class person{
    int ages;
    String name;
    
    public person(String name,int ages){
        this.ages=ages;
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return ages;
    }
}
public class managingPople {
    public static void main(String[] args) {
        person p1 = new person("Agha",19);
        person p2 = new person("Andika", 35);
        
        if(p1.getAge()==p2.getAge()){
            System.out.println(p1.getName()+" is the same age"+p2.getName());
        }else{
            System.out.println(p1.getName()+" is NOT the same age"+p2.getName());
        }
    }
  
}
