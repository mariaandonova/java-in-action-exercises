package jia.begins.exercises.basics.maria.porlidalieva;

/**
 * Created by IntelliJ IDEA.
 * User: mariap
 * Date: Nov 21, 2010
 * Time: 11:04:24 AM
 * To change this template use File | Settings | File Templates.
 */
public class Exersize3 {
     public static void main(String[] args) {
        int sum = 0;
        for (int i=0;i<1000;i++){
           if(i%3==0 ||i%5==0){
               sum+=i;
           }
        }

        System.out.println(sum);
    }

}
