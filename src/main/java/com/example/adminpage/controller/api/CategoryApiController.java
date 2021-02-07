package com.example.adminpage.controller.api;

import com.example.adminpage.controller.CrudController;
import com.example.adminpage.model.entity.Category;
import com.example.adminpage.model.network.request.CategoryApiRequest;
import com.example.adminpage.model.network.response.CategoryApiResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin/category")
public class CategoryApiController extends CrudController<CategoryApiRequest,CategoryApiResponse, Category> {
}
