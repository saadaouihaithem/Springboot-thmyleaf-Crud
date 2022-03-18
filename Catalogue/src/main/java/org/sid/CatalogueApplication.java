package org.sid;

import org.sid.DAO.ProduitRepository;
import org.sid.entity.Produit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CatalogueApplication {

	public static void main(String[] args) {
		
		  ApplicationContext ctx = SpringApplication
					.run(CatalogueApplication.class,
							args); 
									  ProduitRepository produitRepository=ctx.getBean(ProduitRepository.class);
									  produitRepository.save(new Produit("Hp",9100,90)); produitRepository.save(new
									  Produit("mac4325",800,90)); produitRepository.save(new
									  Produit("win4325",600,90)); produitRepository.save(new
									  Produit("toshiba22",325,670));
									  produitRepository.findAll().forEach(p->System.out.println(p.getDesignation())
									  );
									 
	}

}
