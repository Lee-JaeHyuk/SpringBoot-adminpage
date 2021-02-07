package com.example.adminpage.model.entity;

import lombok.*;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString(exclude = {"orderGroup", "item"})
@Accessors(chain = true)
@EntityListeners(AuditingEntityListener.class)
@Entity
public class OrderDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String status;
    private LocalDateTime arrivalDate;
    private Integer quantity;
    private BigDecimal totalPrice;
    @CreatedDate
    private LocalDateTime createdAt;

    @CreatedBy
    private String createdBy;

    @LastModifiedDate
    private LocalDateTime updatedAt;

    @LastModifiedBy // by가 들어가는건 감시자에 영향을 끼친다.
    private String updatedBy;

    //private Long itemId;

    //OrderDetail:Item = N:1

    @ManyToOne
    private Item item;

    //private Long orderGroupId;

    //OrderDetail:OrderGroup = N:1
    @ManyToOne
    private OrderGroup orderGroup;
}
