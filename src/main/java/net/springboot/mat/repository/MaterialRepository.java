package net.springboot.mat.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import net.springboot.mat.model.Material;

public interface MaterialRepository extends JpaRepository<Material, String>{

	
	//for filter/Search
//	@Query("SELECT M from Material where m.dateproduced Like %?1%" )
//	public List <Material> findall(String keyword);
}
