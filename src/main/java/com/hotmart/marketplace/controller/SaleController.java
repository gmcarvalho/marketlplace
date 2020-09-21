package com.hotmart.marketplace.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@Api(value = "Sales")
@RestController
@RequestMapping(path = "/sale")
public class SaleController {
    @PostMapping("/create")
    @ApiOperation(value = "Product Creation", notes = "Sales creation method")
    public ResponseEntity<String> create() throws IOException {
        return ResponseEntity.ok("Teste OK!");
    }

    @GetMapping("/get")
    @ApiOperation(value = "Product Get", notes = "Sales get method")
    public ResponseEntity<String> get() throws IOException {
        return ResponseEntity.ok("Teste OK!");
    }

    @PutMapping("/update")
    @ApiOperation(value = "Product Update", notes = "Sales update method")
    public ResponseEntity<String> update() throws IOException {
        return ResponseEntity.ok("Teste OK!");
    }

    @DeleteMapping("/delete")
    @ApiOperation(value = "Product Delete", notes = "Sales delete method")
    public ResponseEntity<String> delete() throws IOException {
        return ResponseEntity.ok("Teste OK!");
    }
}
