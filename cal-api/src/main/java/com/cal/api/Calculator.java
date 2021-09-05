package com.cal.api;

public class Calculator {
    private int val1;
    public  int result;

    public Calculator(int val1, int val2, int operator) {
        this.val1 = val1;
        this.val2 = val2;
        this.operator = operator;
        cal();
    }


    private int val2;
    private int operator;
    private int cal(){
        System.out.println("operator:"+operator);
        switch (operator){
            case (1):
                result = sum(val1,val2);
                break;
            case (2):
                result =  sub(val1,val2);
                break;
            case (3):
                result = mul(val1,val2);
                break;
            case (4):
              result = div(val1,val2);
              break;
            default:
               result = 0;


        }
        return result;
    }



    public  int sum(int a,int b){
        return a + b;

    }
    public  int sub(int a,int b){
        return a - b;

    }
    public  int mul(int a,int b){
        return a * b;

    }
    public  int div(int a,int b){
        return a / b;

    }
}