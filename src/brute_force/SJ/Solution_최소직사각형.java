package brute_force.SJ;

public class Solution_최소직사각형 {

  public int solution(int[][] sizes) {

    int rowMax = Integer.MIN_VALUE;
    int columMax = Integer.MIN_VALUE;

    int[][] card = new int[sizes.length][2];

    // 일단 다 가로로 눕혀본다..
    // 각각 가로에서 젤 큰거, 세로에서 젤 큰거 고르긔
    for (int i = 0; i < sizes.length; i++) {

      card[i][0] = Math.max(sizes[i][0], sizes[i][1]);
      if (rowMax < card[i][0]) {
        rowMax = card[i][0];
      }

      card[i][1] = Math.min(sizes[i][0], sizes[i][1]);
      if (columMax < card[i][1]) {
        columMax = card[i][1];
      }
    }
    return columMax * rowMax;
  }
}
