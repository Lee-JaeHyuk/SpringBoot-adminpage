package com.example.adminpage.model.network.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderGroupApiResponse {
    private Long id;
    private String status;
    private String orderType;
    private String revAddress;
    private String revName;
    private String paymentType; // 카드/현금
    private BigDecimal totalPrice;
    private Integer totalQuantity;
    private LocalDateTime orderAt;
    private LocalDateTime arrivalDate;

    private Long userId;

    private List<ItemApiResponse> itemApiResponseList;
}
