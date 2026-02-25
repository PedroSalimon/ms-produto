package com.github.cidarosa.ms.produto.service;

import com.github.cidarosa.ms.produto.dto.ProdutoDTO;
import com.github.cidarosa.ms.produto.entities.Produto;
import com.github.cidarosa.ms.produto.repositories.ProdutoRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    @Transactional
    public List <ProdutoDTO> findAllProdutos () {
        List < Produto> produtos = produtoRepository.findAll();
        return produtos.stream().map(ProdutoDTO::new).toList();
    }


}
