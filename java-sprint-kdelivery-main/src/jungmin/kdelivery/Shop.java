package jungmin.kdelivery;

import java.util.Scanner;

public class Shop {
  Scanner scanner = new Scanner(System.in);
  /**
   * 등록 가능한 음식 수, 음식 초기화 변수, 가격 필드 생성
   * 매장명, 메뉴명, 가격 필드 생성
   */
  private static final int FOOD_MAX = 5;
  private static final String EMPTY_FOOD = "";
  private static final int EMPTY_PRICE = 0;
  private String shopName;
  private String[] foodNames;
  private int[] prices;


  /**
   * @Shop() : 생성자 정의
   * 매장만 먼저 입력받도록 합니다.
   * 나머지 변수는 initValues() 에서 정의합니다.
   */



 public Shop (){
    this.shopName = shopName;

  }

  public void getShopName(){
      System.out.println("[안내] 반갑습니다. 가맹주님!");
    System.out.println("[안내] 음식점 상호는 무엇인가요?");

  }
  public String outPutShopName() {
   String getShopName = scanner.nextLine();
  return getShopName;
 }


//  public String Shop() {
//  System.out.println("[안내] 반갑습니다. 가맹주님!");
//  System.out.println("[안내] 음식점 상호는 무엇인가요?");
//  //여기서 위에 shop 값 가져와서 할 것인가 아닌가
//  //일단 그냥
//  this.shopName = shopName;
//  shopName = scanner.nextLine();
//  return shopName;
//}


  /**
   * @return
   * @initValues() : 메뉴명와 가격정보를 담는 배열 생성 및 초기화
   * EMPTY_FOOD = "", EMPTY_PRICE = 0
   */

  //for 문 돌아서 비어있는 배열 만나면 들어가게 하기

    public String initValues() {
      Scanner scanner = new Scanner(System.in);
      System.out.println("[안내] 대표 메뉴 이름은 무엇인가요?");
      String bestFood = scanner.nextLine();
      System.out.println("[안내] 해당 메뉴 가격은 얼마인가요?");
      int prices = Integer.parseInt(scanner.nextLine());
      do {
        if (bestFood.equals(EMPTY_FOOD)) {
          System.out.println("빈 메뉴 이름은 추가 할 수 없습니다.");
        }
        while (bestFood.equals(EMPTY_FOOD));
        if (prices == EMPTY_PRICE) {
          System.out.println("0원은 설정하실 수 없습니다 \n" + "다시 입력해주세요");

        }
      } while (bestFood.equals(EMPTY_FOOD) || prices == 0);
      //다음에 for문을 넣어서 돌면서 빈 배열에 넣어야함
      this.foodNames[0] = bestFood; //foodNames 에 배열 0번에 넣는 것
      this.prices[0] = prices; //prices 배열 0번에 넣는 것
      return this.shopName + "에 음식 (" + bestFood + "," + prices + ") 가 추가되었습니다.";
      //

    }


      /**
       * @addFood() : 위 코드에서 정의된 변수를 받아 출력과 객체에 저장합니다.
       */


//      public void addFood() {
//        getShopName();
//        String store = outPutShopName();
//        initValues(store);
//
//      }

  public void setShopName(String shopName) {
    this.shopName = shopName;
  }
  //setter

}

