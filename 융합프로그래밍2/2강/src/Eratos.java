package src;

public class Eratos {
    public static void main(String[] args) {
        System.out.println("에라토스 테네스의 체");
        int N = 100;
        
        boolean[] prime_flag = new boolean[200];

        for(int i=2; i<=N; i++){
            prime_flag[i] = true;
        }
        int sqrtN = (int)Math.sqrt(N);
        for(int i=2; i<=sqrtN; i++){
            if(prime_flag[i]){ // 소수만 배수를 거르는데 사용
                for(int j=i*i; j<=N; j+=i){
                    prime_flag[j] = false;
                }
            }
        }
        for(int i=2; i<=N; i++){
            if(prime_flag[i])
                System.out.print(i+" ");
        }
        System.out.println();
    }   
}
