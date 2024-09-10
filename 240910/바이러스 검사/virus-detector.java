import java.util.*;
public class Main {
    public static void main(String[] args) {
        //검사자 수를 좁히면서 특정. 
        //검사자의 수는 최소: N개, 최대: 모든 식당의 손님의 합
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] customers = new int[n];
        int[] inspectors = new int[2]; 
        for(int i=0;i<n;i++){
            customers[i] = sc.nextInt();
        }
        inspectors[0] = sc.nextInt();
        inspectors[1] = sc.nextInt();
        
        int answer = n; //팀장의 수
        for(int cus: customers){
            cus-=inspectors[0]; //팀장검사
            if(cus>0){
                answer+=(cus+inspectors[1]-1) / inspectors[1];
            }
        }
        System.out.println(answer);
    }
}