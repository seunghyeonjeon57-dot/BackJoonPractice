package number;

public class Solution {
  public int solution(int num1, int num2){
    int answer = 0;
    double middle=(double)num1/num2;
    answer = (int)(middle*100);
    return answer;
  }

}
