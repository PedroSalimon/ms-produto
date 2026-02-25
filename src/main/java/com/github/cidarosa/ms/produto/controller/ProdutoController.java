package com.github.cidarosa.ms.produto.controller;

import com.github.cidarosa.ms.produto.dto.ProdutoDTO;
import com.github.cidarosa.ms.produto.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping
    public ResponseEntity<List<ProdutoDTO>> getAllProdutos(){
        List <ProdutoDTO> list = produtoService.findAllProdutos();
        return ResponseEntity.ok(list);
    }
}
