package fr.port.repository;

import java.util.List;

public interface Repository<T> {
	public void save(T object);
	public void delete(long id);
	public void findAll();
	public List<T> findById(long id);
	public void deleteAll();
	

}
