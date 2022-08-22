package com.adrianopavaneli.estoqueapi;


import java.util.List;

import com.adrianopavaneli.estoqueapi.database.RepositorioProdutos;
import com.adrianopavaneli.estoqueapi.entities.Produtos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/estoque")
public class ProdutosRest {
  
  @Autowired  
  private RepositorioProdutos repositorio; 
    
      @GetMapping
      public List<Produtos> listar(){
        return repositorio.findAll();
       }
       @PostMapping
       public void salvar(@RequestBody Produtos produtos){
        repositorio.save(produtos);
       }
       
        @PutMapping
    public void alterar(@RequestBody Produtos produtos){
        if(produtos.getId() > 0)
            repositorio.save(produtos);
    }
      @DeleteMapping("/{id}") 
       public void excluir(@PathVariable Long id) {
        repositorio.deleteById(id);
        
       }
      
      
}
