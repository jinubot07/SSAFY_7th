// 테두리에서 바라봤을 때 읽은 배열의 값이 (0,1)인 경우 cnt를 증가시킴
// 테두리는 따로 세준다. 테두리값이 1이면 cnt 증가
// (정정) 읽은 태두리는 2로 초기화해서, 꼭지점부분에서 중복카운트 방지 -> 중복해서 카운트해야함
// 동서남북 4방향이므로 4번 반복

package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_Solution_2567_색종이2 {
    static int N;   // 색종이 장수
    static int[][] board = new int[100][100];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        for(int i=0; i<N; i++){
            String[] str = br.readLine().split(" ");
            int r = Integer.parseInt(str[0]);
            int c = Integer.parseInt(str[1]);
            cover(r,c);
        }



        int cnt = 0;
        //북쪽에서 봤을때 색종이의 테두리 값
        for(int i=10; i<100; i++){         // 도화지 맨 아래에 위치한 색종이의 경계는 10보다 아래 있을 수 없음. (색종이가 도화지를 넘어가지 않기 떄문에)
            for(int j=0; j<100; j++){
                if(board[i-1][j] == 1 && board[i][j]==0) {
                    cnt++;
                    //board[i][j] = 2;
                }
            }
        }

        //남쪽에서 봤을때 색종이의 테두리 값
        for(int i=0; i<90; i++){         // 도화지 맨 위에 위치한 색종이의 경계는 90보다 위로 갈 수 없음. (색종이가 도화지를 넘어가지 않기 떄문에)
            for(int j=0; j<100; j++){
                if(board[i][j] == 0 && board[i+1][j]==1) {
                    cnt++;
                    //board[i+1][j] = 2;
                }
            }
        }

        //서쪽에서 봤을때 색종이의 테두리 값
        for(int i=0; i<100; i++){         // 도화지 맨 오른쪽에 위치한 색종이의 경계는 보다 우로 갈 수 없음. (색종이가 도화지를 넘어가지 않기 떄문에)
            for(int j=0; j<90; j++){
                if(board[i][j] == 0 && board[i][j+1] == 1 ) {
                    cnt++;
                    //board[i][j] = 2;
                }
            }
        }

        //동쪽에서 봤을때 색종이의 테두리 값
        for(int i=0; i<100; i++){         // 도화지 맨 왼쪽에 위치한 색종이의 경계는 10보다 좌로 갈 수 없음. (색종이가 도화지를 넘어가지 않기 떄문에)
            for(int j=10; j<100; j++){
                if(board[i][j-1] == 1 && board[i][j] == 0 ) {
                    cnt++;
                    //board[i][j+1] = 2;
                }
            }
        }

        // 테두리까지 둘러쌓인 경우
        for(int i=0; i<100; i++){
            if(board[99][i]==1) cnt++;      // 북쪽테두리
            if(board[0][i]==1) cnt++;       // 남쪽 테두리
            if(board[i][0]==1) cnt++;       // 서쪽 테두리
            if(board[i][99]==1) cnt++;      // 동쪽 테두리

        }

        System.out.println(cnt);
    }

    // (r,c)에서 10 x 10 짜리의 색종이로 도화지를 덮는 함수
    private static void cover(int r, int c) {

        for(int i=0; i<10; i++){
            for(int j=0; j<10; j++){
                board[r+i][c+j] = 1;
            }
        }

    }
}
