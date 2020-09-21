package com.hotmart.marketplace.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@Api(value = "Category")
@RestController
@RequestMapping(path = "/category")
public class CategoryController {
    @PostMapping("/create")
    @ApiOperation(value = "Product Creation", notes = "Category creation method")
    public ResponseEntity<String> create() throws IOException {
        return ResponseEntity.ok("Teste OK!");
    }

    @GetMapping("/get")
    @ApiOperation(value = "Product Get", notes = "Category get method")
    public ResponseEntity<String> get() throws IOException {
        return ResponseEntity.ok("Teste OK!");
    }

    @PutMapping("/update")
    @ApiOperation(value = "Product Update", notes = "Category update method")
    public ResponseEntity<String> update() throws IOException {
        return ResponseEntity.ok("Teste OK!");
    }

    @DeleteMapping("/delete")
    @ApiOperation(value = "Product Delete", notes = "Category delete method")
    public ResponseEntity<String> delete() throws IOException {
        return ResponseEntity.ok("Teste OK!");
    }
}
