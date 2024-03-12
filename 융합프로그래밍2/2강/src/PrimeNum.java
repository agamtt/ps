package src;

import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("> ");
        int N = sc.nextInt();

        int sqrtN = (int) Math.sqrt(N);

        boolean prime_flag = true;
        for(int i=2; i<sqrtN; i++){ // sqrtN 과 N 을 1000099999 (소수) 를 넣어 소요시간을 통해 성능 평가 가능.
            if((N%i) == 0){
                prime_flag = false;
                break;
            }
        }
        if(prime_flag)
            System.out.println(N+"는(은) 소수");
        else
            System.out.println(N+"는(은) 합성수");
        sc.close();
    }

} 
