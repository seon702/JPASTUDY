package hellojpa;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
//@Inheritance(strategy = InheritanceType.JOINED) 조인타입 전략
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE) 단일테이블 전략
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS) // 구현 클래스마다 테이블 전략
@DiscriminatorColumn
public abstract class Item {
    @Id @GeneratedValue
    private Long id;

    private String name;
    private int price;
}
//public class Item { 조인 단일테이블
//    @Id @GeneratedValue
//    private Long id;
//
//    private String name;
//    private int price;
//}
