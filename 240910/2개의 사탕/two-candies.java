import java.util.*;
public class Main {
    public void bfs(){
        //
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        scanner.nextLine(); // 줄바꿈 문자 소비

        // N x M 상태를 저장할 2차원 배열
        char[][] map = new char[N][M];

        // N개의 줄에 걸쳐 상태 입력
        for (int i = 0; i < N; i++) {
            String line = scanner.nextLine();
            for (int j = 0; j < M; j++) {
                map[i][j] = line.charAt(j);
            }
        }

        // 디버깅용으로 map 출력
        System.out.println("N = " + N);
        System.out.println("M = " + M);
        System.out.println("Map:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(map[i][j]);
            }
            System.out.println();
        }

        scanner.close();
    }
}