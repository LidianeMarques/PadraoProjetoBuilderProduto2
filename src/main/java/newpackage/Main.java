/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import com.mycompany.padraoprojetobuilderproduto2.Produto;
import com.mycompany.padraoprojetobuilderproduto2.ProdutoBuilder;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;



/**
 *
 * @author Lidiane
 */
public class Main {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
     
        Produto produto = new ProdutoBuilder()
                .id(1)
                .codigoEan("123")
                .urlFoto("urlFoto")
                .descricao("Celular")
                .marca("Xiaomi")
                .modelo("Pocophone")
                .categoria("Importados")
                .preco(2800)
                .estoque(10)
                .dataUltimaAtualizacao(LocalDate.now())
                .build();
  

        System.out.println(produto);
    }
    
}
