package access.ex;

public class ShoppingCart {

    private Item[] items = new Item[10];
    private int itemCount;

    //TODO 나머지 코드를 완성해라.

    public void addItem(Item item) {

        // 검증 로직
        if (itemCount >= items.length) {
            System.out.println("장바구니가 가득 찼습니다.");
            return;
        }
        // 실행 로직
        items[itemCount] = item;
        itemCount++;
    }

    public void displayItems() {
        System.out.println("장바구니 상품 출력");
        for (int i = 0; i < itemCount; i++) {
            Item item = items[i];
            System.out.println("상품명: " + item.getName() + ", 합계: " + item.getTotalPrice());
        }
        System.out.println(calculateTotalPrice());
    }

    private int calculateTotalPrice() { // 내부 메서드로 활용하기 때문에 private로 접근제한
        int totalPrice = 0;
        for (int i = 0; i < itemCount; i++) {
            Item item = items[i];
            totalPrice += item.getTotalPrice();
        }
        return totalPrice;
    }
}