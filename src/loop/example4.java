package loop;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class example4 {

  public static void main(String[] args) throws IOException {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
     String input;
     while((input= br.readLine())!=null){
       StringTokenizer st = new StringTokenizer(input);

       if(!st.hasMoreTokens()) break;

       int a = Integer.parseInt(st.nextToken());
       int b= Integer.parseInt(st.nextToken());

       if(a==0&&b==0) break;

       bw.write((a+b) +"");
       bw.newLine();
     }

     bw.flush();
     bw.close();
  }
}
