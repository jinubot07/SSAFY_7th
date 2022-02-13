// BOJ 2941 idea
// (순차적으로 입력받을 때)c,d,s,z가 왔을 때 뒤에 - 나 = 가 오면 하나의 단어로 판단, -나 = 아무것도 안오면 2개의 개별 문자로 판단
// lj, mj는 하나의 문자. li, mj는 두개의 문자.
// (순차적으로 입력받을 때)l,m 왔을 때, j가 따라오면 한 문자로 판단, j가 아니면 개별 문자로 판단

// CLEAR
package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_Solution_2941_크로아티아알파벳_inorder {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] word = br.readLine().split("");    // 입력받은 크로아티아 단어를 배열마다 입력


        // 크로아티아 알파벳 카운트하기(순서대로 읽어나가기)
        int cnt = 0;       // 알파벳 수(출력할 정답)
        for(int i=0; i<word.length; i++){
            //System.out.println("현재까지 i값:"+ i);

            if(i+1<word.length && word[i].equals("c")){
                // "c=" 이거나 "c-"인경우
                if( word[i+1].equals("=") || word[i+1].equals("-")){
                    i++;
                }
                cnt++;
               // System.out.println("현재까지 cnt값:"+ cnt);


            }else if(word[i].equals("d")){
                // "d-"인경우
                if(i+1<word.length && word[i+1].equals("-")){
                    i++;
                }
                // "dz=인경우"
                else if(i+2<word.length && (word[i+1].equals("z") && word[i+2].equals("="))){
                    i = i+2;
                }
                cnt++;
               //  System.out.println("현재까지 cnt값:"+ cnt);


            }else if(i+1<word.length && (word[i].equals("l") || word[i].equals("n") )){
                // "lj"이거나 "nj"인 경우
                if(word[i+1].equals("j")){
                    i++;
                }
                cnt++;
                // System.out.println("현재까지 cnt값:"+ cnt);


            }else if(i+1<word.length && ( word[i].equals("s") || word[i].equals("z") ) ){
                // "s="이거나 "z="인 경우
                if(word[i+1].equals("=")){
                    i++;
                }
                cnt++;
               // System.out.println("현재까지 cnt값:"+ cnt);
            }


            //  일반적인 알파벳인 경우 (i+1 < word.length && : 맨마지막에 오는 알파벳)
            else{
                cnt++;
               // System.out.println("현재까지 cnt값:"+ cnt);
            }
        }


        //  정답 출력
        System.out.print(cnt);
    }
}