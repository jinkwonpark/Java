package enumeration.ref1;

public class DiscountService {

    public int discount(ClassGrade classGrade, int price) {
        /*
        int discountPercent = classGrade.getDiscountPercent();
        return price * discountPercent / 100;  // discountPercent에서 Ctrl + Alt + N: 메소드 인라인화(Inline variable): 변수 선언문 제거하고 식 직접 넣어줌
         */  // 아래 한 줄과 동일
        return price * classGrade.getDiscountPercent() / 100;
    }
}
