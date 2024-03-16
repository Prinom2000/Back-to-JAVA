/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student;

/**
 *
 * @author User
 */
public class student {
    private int id;
    private double cg;
    private static int scount =0;
    student(){scount++;}
    student(int id, double cg)
    {
        this.id = id;
        this.cg=cg;
        scount++;
    }
    void setid(int id1)
    {
       this.id=id1; 
    }
    void setcg(double cg)
    {
       this.cg=cg; 
    }
    double getcg()
    {
       return this.cg; 
    }
     int getscount()
    {
       return this.scount; 
    }
    void display()
    {
        	System.out.println(id+" "+cg);
    }
    
}
