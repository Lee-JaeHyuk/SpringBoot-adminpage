package com.example.adminpage.repository;

import com.example.adminpage.AdminpageApplicationTests;
import com.example.adminpage.model.entity.Partner;
import com.example.adminpage.model.network.Header;
import com.example.adminpage.model.network.response.PartnerApiResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

public class PartnerRepositoryTest extends AdminpageApplicationTests {

    @Autowired
    private PartnerRepository partnerRepository;

    @Test
    @Transactional
    void read(){
        System.out.println(partnerRepository.findById(1L).map(partner -> response(partner)));

    }

    private Header<PartnerApiResponse> response(Partner partner){
        PartnerApiResponse body = PartnerApiResponse.builder()
                .id(partner.getId())
                .name(partner.getName())
                .status(partner.getStatus())
                .address(partner.getAddress())
                .callCenter(partner.getCallCenter())
                .partnerNumber(partner.getPartnerNumber())
                .businessNumber(partner.getBusinessNumber())
                .ceoName(partner.getCeoName())
                .registeredAt(partner.getRegisteredAt())
                .unregisteredAt(partner.getUnregisteredAt())
                .categoryId(partner.getCategory().getId())
                .build();
        return Header.OK(body);
    }

}
