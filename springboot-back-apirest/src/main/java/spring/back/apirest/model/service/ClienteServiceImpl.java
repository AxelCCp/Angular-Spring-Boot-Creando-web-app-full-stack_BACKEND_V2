package spring.back.apirest.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import spring.back.apirest.model.dao.IClienteDao;
import spring.back.apirest.model.entity.Cliente;
import spring.back.apirest.model.entity.Region;

@Service
public class ClienteServiceImpl implements IClienteService{

	@Override
	@Transactional(readOnly = true)
	public List<Cliente> findAll() {
		return (List<Cliente>) clienteDao.findAll();
	}
	
	
	@Override
	@Transactional(readOnly = true)
	public Page<Cliente> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return clienteDao.findAll(pageable);
	}

	@Override
	@Transactional(readOnly = true)
	public Cliente findById(Long id) {
		// TODO Auto-generated method stub
		return clienteDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Cliente save(Cliente cliente) {
		// TODO Auto-generated method stub
		return clienteDao.save(cliente);
	}

	@Override
	@Transactional
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		clienteDao.deleteById(id);	
	}
	
	@Override
	public List<Region> findAllRegiones() {
		// TODO Auto-generated method stub
		return clienteDao.findAllRegiones();
	}
	
	@Autowired
	private IClienteDao clienteDao;

	

	


}
