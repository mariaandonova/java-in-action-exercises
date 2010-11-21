package jia.begins.exercises.basics.maria.porlidalieva;

import java.math.BigInteger;

/**
 * Created by IntelliJ IDEA.
 * User: mariap
 * Date: Nov 21, 2010
 * Time: 11:07:35 AM
 * To change this template use File | Settings | File Templates.
 */
public class Exersize4 {

     public static void main(String[] args) {
         BigInteger result = BigInteger.ONE;
       for (int i=1;i<100;i++){
           result = result.multiply(new BigInteger(String.valueOf(i)));
       }
        String strResult = result.toString();

         int sum = 0;

         for(int i=0;i<strResult.length();i++ ){
                  sum+=Integer.parseInt(String.valueOf(strResult.charAt(i)));
         }

        System.out.println(sum);
    }
}
