/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.types;

/**
 *
 * @author Omen
 */
public class DataTypes {

    /**
     * @param args the command line arguments
     */
//**********************************************//
//JAVA - Data Types Lecture
//**********************************************//
    /*
     * Data Types
     * - Variables are "containers" for storing information
     * - JAVA supports the following data types:
     *      - Textual Types
     *          1) Character
     *          2) String
     *      - Integer Types
     *          1) Byte
     *          2) Short
     *          3) Int
     *          4) Long
     *      - Floating Point Types
     *          1) Float
     *          2) Double
     *      - Logical Type
     *          1) Boolean
     *
     * - Data types in java are divided into two groups:
     *      1) Primitive data types
     *      2) Non-Primitive data types
     */
//**********************************************//
//JAVA - Data Types Lecture
//**********************************************//
    /*  Data Types - Description Table
      *
       Data Type    |    Size       |    Description                    |       Values
      ==============|===============|===================================|================================================================
       byte	    |    1 byte	        |    Stores whole numbers           |       -128 to 127
       short	    |    2 bytes	|    Stores whole numbers           |       -32,768 to 32,767
       int	    |    4 bytes	|    Stores whole numbers           |       -2,147,483,648 to 2,147,483,647
       long	    |    8 bytes	|    Stores whole numbers           |       -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
       float	    |    4 bytes	|    Stores fractional numbers.     |       Sufficient for storing 6 to 7 decimal digits
       double	    |    8 bytes	|    Stores fractional numbers.     |       Sufficient for storing 15 decimal digits
       boolean	    |    1 bit	        |    Stores true or false values    |
       char	    |    2 bytes	|    Stores a single character/letter or ASCII values
      ================================================================================================================================
     */
    //**********************************************//
    //JAVA - Data Types - Primitive Types
    //**********************************************//
    /*
     * Data Types - Primitive Type
     * - Basic types provided by java
     * - Eight types:
     *      - Integers types
     *          1) byte
     *              - Size: 1 byte
     *              - Default value: 0
     *              - min value: (-128)
     *              - max value: (127)
     *              - Example: byte var;
     *          2) short
     *              - Size: 2 bytes
     *              - Default value: 0
     *              - min value: (-32,768)
     *              - max value: (32,767)
     *              - Example: short var;
     *          3) int
     *              - Size: 4 bytes
     *              - Default value: 0
     *              - min value: (-2,147,483,648)
     *              - max value: (2,147,483,647)
     *              - Example: int var;
     *          4) long
     *              - Size: 8 bytes
     *              - Default value: 0L
     *              - min value: (-9,223,372,036,854,775,808)
     *              - max value: (-9,223,372,036,854,775,807)
     *              - Example: long var;
     *
     *      - Floating Point types
     *          1) Float
     *              - Size: 4 bytes
     *              - Default value: 0.0f
     *              - Store 6 to 7 decimal digits
     *              - Example: float var;
     *          2) Double
     *              - Size: 8 bytes
     *              - Default value: 0.0d
     *              - Store 15 decimal digits
     *              - Example: double var;
     *
     *      - Textual type
     *          1) Character
     *              - Size: 2 bytes
     *              - Default value: '\u0000' unicode
     *              - Value surrounded in single quotes ''
     *              - Store only single character, number or symbol
     *              - Example: char var, char var = 'A';
     *
     *      - Logical type
     *          1) Boolean
     *              - Size: 1 bit
     *              - Default value: false
     *              - Example: boolean var;
     */
    //**********************************************//
 
    public static void main(String[] args) {
        // تعريف متغيرات بدون قيم 
/*        
     int a;
     int b;
     int c;
*/
/*
   int a , b , c ;
 */  
   
   // تعريف متغيرات لها قيم
   
    //  int a = 10;   //Assignment Operator
   // int b = 20;
  //  int c = 30;
    
  //     int a=10 , b=20 , c=30 ;
  
 /* 
        int age = 50;
        float average = 50.0f;
        double salary = 1250.55;
        boolean isRegistered = false;
        char gender = 'M';
        String name = "Ahmed";
        
        System.out.println("name: "+ name);
        
        System.out.println("name: " + name + "\n"
                + "Age: " + age + "\n"
                + "gender: " + gender + "\n"
                + "isRegistered: " + isRegistered + "\n"
                + "salary: " + salary + "\n"
                + "average: " + average + "\n"
        );
 */  
        //    ****  Arithmetic Operators  ****
        
        // Addition Operator +
     
        int numberOne = 10;
        int numberSecond = 20;
        int total;
        
        total = numberOne + numberSecond ;
        
        System.out.println("total= " + total);

       
        // Subtraction Operator -
     
        int firstNumber = 20;
        int SecondNumber = 14;
        int Subtraction;
        Subtraction = firstNumber - SecondNumber; 
        
        System.out.println("Subtraction :" + Subtraction);
    
        // Unary-Plus Operator +
/*
        int g = 10;
        int h =  +g;                    // g لقيمة UnaryPlus تحتوي على الـ h
        System.out.print( h + "\n" );
*/
 /*   
        int g = -10;
        int h = +g;                         // g لقيمة UnaryPlus تحتوي على الـ h
        System.out.print( h + "\n" );
 */   
        // Division Operator /
/*  
        int s =8;
        int d =5;
        int x = s / d;    //  1.6 ملاحظة لو تم تعريف المتغيرات دبل لكان الناتج  
         System.out.print( x + "\n" );
 */
         // Modulo Operator %   باقي القسمه
/*     
        int m = 8;
        int n = 5;
 
        int q = m % n;               // n على m تحتوي على الباقي من قسمة q
 
        System.out.print( q + "\n" );
 */    
        ///////////////////////////////
     
        int a = 10;
        int b = 20;
 
        a += b;        // a  =  a + b  =  10 + 20  =  30
 
       System.out.println( " a = " +a );
 
/*
       double x =(5.0+(3.0)/1.5)*(2/3);
        System.out.println("x="+x);
        
      
 */     
  

}
     }
