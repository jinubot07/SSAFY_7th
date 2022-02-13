// BOJ 2941 idea
// (역순으로 입력받을 때)- 나 = 가 붙어있으면 무조건 앞에 알파벳 까지 함께 먹는다.  c 와 c- 와 c= 는 서로 다른 문자
// lj, mj는 하나의 문자. li, mj는 두개의 문자.
// (역순으로 입력받을 때)j가 입력 될때, 그 앞의 문자가 l이나 m이면 하나의 문자로 판단, l이나 m이 아니면 2개의 개별 문자로 판단

// SUCCESS

package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

import java.io.StringReader;
import java.lang.management.BufferPoolMXBean;

public class BOJ_Solution_2941_크로아티아알파벳 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] word = br.readLine().split("");    // 입력받은 크로아티아 단어를 배열마다 입력


        // 크로아티아 알파벳 카운트하기(역순 읽어나가기)
        int cnt = 0;       // 알파벳 수(출력할 정답)
        for(int i=word.length-1; i>=0; i--){

            // -가 오면 항상 그 앞자리 알파벳까지 포함
             if(word[i].equals("-")) {
                 i--;
                 cnt++;
             }


            // =이 오면 항상 그 앞자리 알파벳까지 포함 (단, z= 와 dz= 구분)
            else if(word[i].equals("=")){
                i--;

                // z= dz= 구분
                if( word[i].equals("z") && i-1>=0 && word[i-1].equals("d") ) i--;

                cnt++;

             }

            // j가 올때 그 앞자리 알파벳가 n,l인지 아닌지
            else if(i-1>=0 && word[i].equals("j")){

                 // lj, nj는 하나의 문자로, 그외는 2개의 문자로 카운트
                 if( word[i-1].equals("l") || word[i-1].equals("n") ) i--;
             }

            // 일반적인 알파벳인 경우 (단어 맨 첫번 째 글자가 j인경우 포함)
            else cnt++;

        }

        //  정답 출력
        System.out.print(cnt);

    }
}
