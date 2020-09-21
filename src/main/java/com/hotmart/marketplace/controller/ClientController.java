package com.hotmart.marketplace.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@Api(value = "Client")
@RestController
@RequestMapping(path = "/client")
public class ClientController {
    @PostMapping("/create")
    @ApiOperation(value = "Product Creation", notes = "Client creation method")
    public ResponseEntity<String> create() throws IOException {
        return ResponseEntity.ok("Teste OK!");
    }

    @GetMapping("/get")
    @ApiOperation(value = "Product Get", notes = "Client get method")
    public ResponseEntity<String> get() throws IOException {
        return ResponseEntity.ok("Teste OK!");
    }

    @PutMapping("/update")
    @ApiOperation(value = "Product Update", notes = "Client update method")
    public ResponseEntity<String> update() throws IOException {
        return ResponseEntity.ok("Teste OK!");
    }

    @DeleteMapping("/delete")
    @ApiOperation(value = "Product Delete", notes = "Client delete method")
    public ResponseEntity<String> delete() throws IOException {
        return ResponseEntity.ok("Teste OK!");
    }
}
