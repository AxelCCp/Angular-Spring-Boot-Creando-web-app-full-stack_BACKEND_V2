package spring.back.apirest.model.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import spring.back.apirest.model.entity.Cliente;
import spring.back.apirest.model.entity.Region;

public interface IClienteDao extends JpaRepository<Cliente,Long> {

	@Query("from Region")
	public List<Region>findAllRegiones();
	
}
