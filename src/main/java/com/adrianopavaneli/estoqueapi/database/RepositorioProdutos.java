package com.adrianopavaneli.estoqueapi.database;


import org.springframework.data.jpa.repository.JpaRepository;

import com.adrianopavaneli.estoqueapi.entities.Produtos;

public interface RepositorioProdutos extends JpaRepository<Produtos,Long> {
    
}
