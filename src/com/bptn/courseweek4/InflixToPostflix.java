package com.bptn.courseweek4;

import java.util.*;

class Team4InflixToPostflix {

    //Determining precedence of all the operators
    static int operatorPrecedence(char ch) {  //use of char as it stores a single character 
    
        switch(ch) {
                //multiplication & division
                case '*':
                case '/':
                    return 2;
                //addition & subtraction
                case '+':
                case '-':
                    return 1;
                //exponent
                case '^':
                    return 10;
               
                default:
                    return 0; 
        }
     
    } 

    static String infixToPostFix (String expression){

        String result = new String (""); //our given empty string for result 
        
        Stack <Character> operatorStack = new Stack<>(); //calling our empty stack 

        // scan the characters of the expression
        for (int i = 0; i < expression.length(); i++) {
            char tempChar = expression.charAt(i); //stores character at index (i) in c

            // append scanned character to result
            if (Character.isLetterOrDigit(tempChar)) {
                result += tempChar;
               // System.out.println(result); //for our understanding
            }
            else if (tempChar == '(') {
                operatorStack.push(tempChar);   
               // System.out.println("pushed ( to the stack"); //for our understanding
            } 
            else if (tempChar == ')') {
                while (!operatorStack.isEmpty()
                       && operatorStack.peek() != '(') {
                    result += operatorStack.peek();
                    operatorStack.pop();
                   //System.out.println(result); //for our understanding
                    //System.out.println("pop out " + operatorStack.peek() +" from the stack"); //for our understanding
                }
                operatorStack.pop();
               // System.out.println("pop out " + operatorStack.peek() +" from the stack"); //for our understanding
            }
            else
                {
                while (!operatorStack.isEmpty() 
                       && operatorPrecedence(tempChar) <= operatorPrecedence(operatorStack.peek())) {
                    result += operatorStack.peek();
                   // System.out.println(result);//for our understanding
                  //  System.out.println("pop out " + operatorStack.peek() +" from the stack"); //for our understanding
                    operatorStack.pop();
                    
                }
                operatorStack.push(tempChar); 
                //System.out.println("pushed " + tempChar + " to the stack"); //for our understanding
                }

    
        }  
        
        while (!operatorStack.isEmpty()){
                if (operatorStack.peek() == '(')
                    return "Invalid Expression";
                result += operatorStack.peek();
                operatorStack.pop();
        }
   
        return result;
    
    }
}
 
public class InflixToPostflix {
    

    public static void main(String[] args) {

        String expression = "a+b*(c^d-e)^(f+g*h)-i";//the infix
        
//        Team4InflixToPostflix obj = new Team4InflixToPostflix(); //creating an object

        String postFix = Team4InflixToPostflix.infixToPostFix(expression); //calling our method/function

        System.out.println("The postfix of: " +  expression + " = " + "\n" + postFix); 
      
       
    }

}

