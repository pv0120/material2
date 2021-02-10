package net.springboot.mat.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import net.springboot.mat.model.Material;

public interface MaterialRepository extends JpaRepository<Material, String>{

	
	//for keyword Search
	@Query
	("SELECT m FROM Material m WHERE "
	 +"CONCAT( m.cartnumber, ' ', m.containerid ,' ', m.dateproduced ,' ', m.timeproduced )"
     + "LIKE %?1%")			

	public List <Material> findAll(String Keyword);
}
