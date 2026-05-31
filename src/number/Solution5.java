package number;
//최빈값은 주어진 값 중에서 가장 자주 나오는 값을 의미합니다. 정수 배열 array가 매개변수로 주어질 때, 최빈값을 return 하도록 solution 함수를 완성해보세요. 최빈값이 여러 개면 -1을 return 합니다.
public class Solution5 {

  public int solution(int[] array) {

    int maxCount = 0;
    int mode = 0;
    boolean duplicated = false;

    // 최빈값 후보 찾기
    for (int i = 0; i < array.length; i++) {
      int cnt = 0;

      for (int j = 0; j < array.length; j++) {
        if (array[i] == array[j]) {
          cnt++;
        }
      }

      if (cnt > maxCount) {
        maxCount = cnt;
        mode = array[i];
      }
    }


    for (int i = 0; i < array.length; i++) {


      boolean alreadyChecked = false;

      for (int k = 0; k < i; k++) {
        if (array[i] == array[k]) {
          alreadyChecked = true;
          break;
        }
      }

      if (alreadyChecked) {
        continue;
      }

      int cnt = 0;

      for (int j = 0; j < array.length; j++) {
        if (array[i] == array[j]) {
          cnt++;
        }
      }

      if (array[i] != mode && cnt == maxCount) {
        duplicated = true;
        break;
      }
    }

    if (duplicated) {
      return -1;
    }

    return mode;
  }
}