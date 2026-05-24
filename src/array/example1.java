package array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class example1 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int N = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());
    int count = 0;
    int[] a = new int[N];
    for (int i = 0; i < N; i++) {
      a[i] = Integer.parseInt(st.nextToken());
    }
    int b = Integer.parseInt(br.readLine());

    for (int i = 0; i < N; i++) {
      if (b == a[i])
        count++;
    }

  bw.write(String.valueOf(count));
    bw.flush();
    bw.close();
    br.close();
  }
}