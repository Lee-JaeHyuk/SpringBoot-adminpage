package com.example.adminpage.controller.api;

import com.example.adminpage.controller.CrudController;
import com.example.adminpage.model.entity.Item;
import com.example.adminpage.model.network.request.ItemApiRequest;
import com.example.adminpage.model.network.response.ItemApiResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin/item")
public class ItemApiController extends CrudController<ItemApiRequest, ItemApiResponse, Item> {

}
