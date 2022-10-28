/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.main;

/**
 *
 * @author abdulla
p */
public class  Main{
 public static void main (String[]args){
    //       0  1 2 3 4 5 6 7 8
 //int [] y ={1,2,3,4,6,7,8};
 //System.out.print(y[2]);
 int [] [] grades={{70,80,90,98}, {55,77,85,100},{60,80,75,95},{55,77,88,93}};
 int max=grades[0][0];
  for(int i=0;i<grades.length;i++){
     for(int j=0;j<grades.length;j++)
  if(grades[i][j]>max)
      max=grades[i][j];
     System.out.print(" your maximum number is "  +max);
    max=0;
      }

 }
 
 }
 
 
 

 
 


 



 



 

 
 
 

    
    
    
   
   
        
    
    
 

 

    
    

        
        
        
        
        
    
   
    
    

   

