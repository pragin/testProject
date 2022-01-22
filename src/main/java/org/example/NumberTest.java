package org.example;

public class NumberTest {

    int digit, sum = 0;

   public void setSum(int number) {
       if(number < 0){
           number = number * -1;
       }

        while (number > 0) {
            digit = number % 10;
            sum = sum + digit;
            number = number / 10;
        }
        System.out.println(sum);

    }

    public int getSum() {
        return sum;
    }
}
