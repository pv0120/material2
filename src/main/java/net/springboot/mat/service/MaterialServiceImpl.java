package net.springboot.mat.service;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import net.springboot.mat.model.Material;
import net.springboot.mat.repository.MaterialRepository;

@Service
public class MaterialServiceImpl implements MaterialService {

	@Autowired
	private MaterialRepository materialRepository;
	@Override
	public List<Material> getAllMaterial() {
		// TODO Auto-generated method stub
		return  materialRepository.findAll();
		
	}
	
	//Pagination
	@Override
	public Page<Material> findPaginated(int pageNo, int pageSize) {
	 PageRequest pageable = PageRequest.of(pageNo - 1, pageSize);
	 return this.materialRepository.findAll(pageable);
	}
	

}
