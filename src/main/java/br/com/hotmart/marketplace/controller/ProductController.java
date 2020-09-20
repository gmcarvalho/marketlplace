package br.com.hotmart.marketplace.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "Products Marketplace")
@Validated
@RestController
@RequestMapping(path = "/marketplace")
public class ProductController {


    @PostMapping("/create")
    @ApiOperation(value = "Product creation.",
            notes = "Product Market Creation.")
    public ResponseEntity createClient()   {
        return ResponseEntity.ok(null);
    }
}
