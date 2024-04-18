package exam01;

public class Board {
   private static Board instance = new Board();

   private Board(){}

   public static Board getInstance() {
       if (instance == null) { // 필요한 시점 최소 1번 생성
           instance = new Board();
       }
       return instance;
   }
}
