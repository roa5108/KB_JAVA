package ch17.sec04;

import lombok.*;

@AllArgsConstructor
@Data
@Getter
@Setter
@ToString

public class Product {
    private int pno;
    private String name;
    private String company;
    private int price;
}
