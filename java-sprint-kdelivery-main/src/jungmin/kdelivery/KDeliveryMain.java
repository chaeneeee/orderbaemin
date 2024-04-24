package jungmin.kdelivery;

import java.util.Arrays;
import java.util.Scanner;

// 클래스를 정의 합니다.
public class KDeliveryMain {
  /**
   * 음식점 등록 개수, 음식 주문 가능 횟수, 리뷰 등록 가능 횟수 정의
   * */
  private static int SHOP_MAX = 5;
  private static int ORDER_MAX= 5;
  private static int FEEDBACK_MAX = ORDER_MAX;


  /**
   * 배열을 담을 수 있는 객체 생성
   * 사용 범위, 객체 타입, 객체 이름
   */
 public Shop[] shops;
  public Order[] orders;
  public Feedback[] feedbacks;

  // 해당 변수를 제어하는 Idx변수를 정의하고 초기화

//  Shop[] shop = new Shop[5];
  Shop[] shop = new Shop[]{};
  Order[] order = new Order[]{};
Feedback[] feedback = new Feedback[]{};

  private Scanner s; // 사용자의 입력을 받는 객체 생성

  //객체 생성하고 feedback [1].shop = "adf"
  Scanner scanner = new Scanner(System.in);

  /**
   * @KDeliveryMainV1() : 매장 정보, 주문 정보, 리뷰 정보 초기화
   * initValues() 메서드 사용
   */


  public void KDeliveryMainV1(){
    //매장 정보, 주문 정보, 리뷰 정보 초기화
     this.shops = shop;
    this.orders = order;
    this.feedbacks =feedback;


  }

  public void initValues(){
    int SHOP_MAX = 5;
    int ORDER_MAX= 5;
    int FEEDBACK_MAX = ORDER_MAX;
  }


  /**
   * @initValues() : 객체에 저장될 수 있는 크기 지정
   * SHOP_MAX, ORDER_MAX, FEEDBACK_MAX = 5
   * */


  /**
   * @close() : 프로그램 종료를 위해 사용되는 메서드
   * 사용자가 종료를 선언하면 동작합니다.
   * main()에서 활용됩니다.
     * */

      public static void close(){
        System.out.println("이용해주셔서 감사합니다 ");
        return;

      }

  /**
   * selectMainMenu() : 기능을 나열하며, 사용자가 원하는 기능을 정수로 받습니다.
   * */

  public static void selectMainMenuMessage(){

    System.out.println("[치킨의 민족 프로그램 V1]");
    System.out.println("-".repeat(30));
    System.out.println("1) [사장님 용] 음식점 등록하기\n"+ "2) [고객님과 사장님 용] 음식점 별점 조회하기\n"+"3) [고객님 용] 음식 주문하기\n"
    +"4) [고객님 용] 별점 등록하기\n" +"5) 프로그램 종료하기" );
    System.out.println("-".repeat(30));
    System.out.println("[시스템] 무엇을 도와드릴까요?");
    //정수로 받으면


//   int firstChoiceMenu  = Integer.parseInt(scanner.nextLine());
   //스트링 타입을 int 로 바꿔주는 메서드 Integer.parseInt
//      return firstChoiceMenu;
  }

  public static void selectMainMenu()  {
    Scanner scanner = new Scanner(System.in);
    int firstMenu = 0;
    firstMenu = Integer.parseInt(scanner.nextLine());
    switch (firstMenu) {
      case  1 :
        Shop currentShop = new Shop();
        currentShop.getShopName();
        String showName = currentShop.outPutShopName();
        currentShop.setShopName(showName);
        currentShop.initValues();

        break;
      case 2:

      case 3:
        selectOrderMenu();

      case 5 :
        close();

    }
  }

//이 가게 이 메뉴 어떻게 찾을땐?
  /**
   * @selectAddShopMenu() : 음식점의 정보를 등록합니다.
   * @shops   : 가게 정보를 저장합니다.
   * @shopIdx : 가게 정보의 인덱스
   * */

public void selectAddShopMenu() {





}



  public void selectAddShopMenu(String shop) {

    System.out.println("[안내] 대표 메뉴 이름은 무엇인가요?");
    String menuName = scanner.nextLine();
    System.out.println("[안내] 해당 메뉴 가격은 얼마인가요?");
    int menuPrice = Integer.parseInt(scanner.nextLine());

    /**
     * @Shop.java 의 Shop 클래스를 활용한 객체 생성
     * @public 클래스 : 동일 패키지 및 다른 패키지에서 사용가능
     * @addFood() : Shop.java 의 Shop 클래스의 addFood() 메서드
     * 해당 메서드는 매장명, 음식명, 가격을 입력받아 객체에 저장
     * 값이 저장될 때 마다 shopIdx 값 증가
     */

  }








  /**
   * @selectDashboardMenu() : 해당 메서드는 등록된 가게 정보를 출력합니다.
   * Feedback.java 파일의 클래스 및 메서드를 활용합니다.
   * */

  public void selectDashboardMenu(){

  }

  Order Order = new Order();

  /**
   * @selectOrderMenu() : 주문 기능
   * 사용자의 입력을 받아 orders 객체에 저장
   * */



  public static void selectOrderMenu() {
 Scanner scanner = new Scanner(System.in);
    System.out.println("[안내] 고객님! 메뉴 주문을 진행하겠습니다!\n" + "안내] 주문자 이름을 알려주세요!");
    String userName = scanner.nextLine();
    System.out.println("[안내] 주문할 음식점 상호는 무엇인가요?");
    String orderStore = scanner.nextLine();
    System.out.println("[안내] 주문할 메뉴 이름을 알려주세요!");
    String orderMenu = scanner.nextLine();
    System.out.println( " [안내]"+ userName + "님!\n" + "[안내] " + orderStore +"매장에 " +
           orderMenu +"주문이 완료되었습니다.");

  }





  /**
   * @selectFeedbackMenu() : 메뉴의 피드백을 입력받는 기능
   * */



  public static void main(String[] args) {
    selectMainMenuMessage();
    selectMainMenu() ;


  }
}