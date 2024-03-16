/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package student;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class main {

    
    public static void displaystubycg(student[] stu)
    {
         for(int i=0;i<stu.length;i++){
             if(stu[i].getcg()>3.50){
                 stu[i].display();
             }
         }
    }
    
    public static void main(String[] args) {
        int id;
	    double cg;
	    Scanner inp = new Scanner(System.in);
	    student s1= new student();
	    s1.setid(184);
	    s1.setcg(3.95);
	    s1.display();
	    student[] stu= new student[2];
	    for(int i=0;i<stu.length;i++){
	        id=inp.nextInt();
	        cg=inp.nextDouble();
	        stu[i] = new student(id,cg); 
	    }
	    displaystubycg(stu);
	    
	}
        
}
