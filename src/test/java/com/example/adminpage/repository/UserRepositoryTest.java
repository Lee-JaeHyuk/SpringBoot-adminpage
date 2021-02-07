package com.example.adminpage.repository;

import com.example.adminpage.AdminpageApplication;
import com.example.adminpage.AdminpageApplicationTests;
import com.example.adminpage.model.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

public class UserRepositoryTest extends AdminpageApplicationTests {

    @Autowired
    private UserRepository userRepository;

    @Test
    @Transactional
    public void read(){

        User user = userRepository.findFirstByPhoneNumberOrderByIdDesc("010-3333-3333");
        //Assert.assertNotNull(user);
        System.out.println(user);
        if(user!=null){
            user.getOrderGroupList().stream().forEach(orderGroup->{
                System.out.println("-----주문묶음-----");
                System.out.println("수령인: " + orderGroup.getRevName());
                System.out.println("수령지: " + orderGroup.getRevAddress());
                System.out.println("총금액: " + orderGroup.getTotalPrice());
                System.out.println("총수량: " + orderGroup.getTotalQuantity());

                System.out.println("-----주문상세-----");
                orderGroup.getOrderDetailList().forEach(orderDetail->{
                    System.out.println("파트너사 이름: " + orderDetail.getItem().getPartner().getName());
                    System.out.println("파트너사 카테고리: " + orderDetail.getItem().getPartner().getCategory().getTitle());
                    System.out.println("주문 상품: " + orderDetail.getItem().getName());
                    System.out.println("고객센터 번호: " + orderDetail.getItem().getPartner().getCallCenter());
                    System.out.println("주문의 상태: "+ orderDetail.getStatus());
                    System.out.println("도착예정일자: "+ orderDetail.getArrivalDate());

                });

            });

        }
    }
}
