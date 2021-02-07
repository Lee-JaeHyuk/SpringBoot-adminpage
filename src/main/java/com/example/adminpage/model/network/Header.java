package com.example.adminpage.model.network;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Header<T> {
    // api 통신시간, 일반적으로 camel -> snake로 바꿔야 한다. 바꾸는 방법 1 JsonProperty("transaction_time") 2. 리소스 아래 application.properties에 sprin.jackson.property-naming-star~~snamke하면된다.
    //@JsonProperty("transaction_time")
    private LocalDateTime transactionTime; //ISO, YYYY-MM-DD 이런식으로 매칭하는 방법들이 있지만 기본 DEFAULT에 맞추겠다.

    // api 응답코드
    private String resultCode;

    // api 부가설명
    private String description;

    private Pagination pagination;

    private T data; // 계속해서 바뀌는 데이터는 제네릭 타입으로

    // OK - connection
    public static<T> Header<T> OK(){
        return (Header<T>)Header.builder()
                .transactionTime(LocalDateTime.now())
                .resultCode("OK")
                .description("OK")
                .build();
    }
    // Data OK
    public static <T> Header<T> OK(T data){
        return (Header<T>)Header.builder()
                .transactionTime(LocalDateTime.now())
                .resultCode("OK")
                .description("OK")
                .data(data)
                .build();

    }

    // Data OK
    public static <T> Header<T> OK(T data,Pagination pagination){
        return (Header<T>)Header.builder()
                .transactionTime(LocalDateTime.now())
                .resultCode("OK")
                .description("OK")
                .data(data)
                .pagination(pagination)
                .build();

    }

    // error
    public static<T> Header<T> ERROR(String description){
        return (Header<T>)Header.builder()
                .transactionTime(LocalDateTime.now())
                .resultCode("ERROR")
                .description(description)
                .build();
    }

}
