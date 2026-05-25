package number;

public class Solution3 {
  public int[] solution3(int[] numbers){
    int[] answer = new int[numbers.length];

    for(int i=1; i< numbers.length; i++){
      answer[i] = numbers[i]*2;
    }
    return answer;
  }

}
