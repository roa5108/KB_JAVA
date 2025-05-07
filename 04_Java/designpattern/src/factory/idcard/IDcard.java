package factory.idcard;

import factory.framework.Product;

public class IDcard extends Product {
    private final String owner;

    public IDcard(String owner) {
        System.out.println(owner + "의 카드를 만듭니다.");
        this.owner = owner;
    }


    @Override
    public void use() {
        System.out.println(this + "을 사용합니다.");
    }

    @Override
    public String toString() {
        return "[IDcard: " + owner + "]";
    }
}
