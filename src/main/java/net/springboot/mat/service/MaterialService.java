package net.springboot.mat.service;
import java.util.List;

import org.springframework.data.domain.Page;

import net.springboot.mat.model.Material;

public interface MaterialService {
	List<Material> getAllMaterial();
	
	
/////////////////////Pagination//////////////////////////////////////////	
	Page < Material > findPaginated(int pageNo, int pageSize);


	List<Material> listAll(String keyword);
	
}
