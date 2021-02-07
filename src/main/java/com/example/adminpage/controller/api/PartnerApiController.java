package com.example.adminpage.controller.api;


import com.example.adminpage.controller.CrudController;
import com.example.adminpage.model.entity.Partner;
import com.example.adminpage.model.network.request.PartnerApiRequest;
import com.example.adminpage.model.network.response.PartnerApiResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin/partner")
public class PartnerApiController extends CrudController<PartnerApiRequest, PartnerApiResponse, Partner> {

}
