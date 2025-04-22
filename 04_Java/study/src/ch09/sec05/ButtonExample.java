package ch09.sec05;

public class ButtonExample {
    public static void main(String[] args) {
        Button btnOk = new Button();

        class OKListener implements Button.ClickListener {
            @Override
            public void onClick() {
                System.out.println("Ok 버튼을 클릭했습니다.");
            }
        }
    }
}
