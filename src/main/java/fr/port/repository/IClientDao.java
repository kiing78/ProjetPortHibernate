package fr.port.repository;

import org.springframework.data.repository.CrudRepository;

import fr.port.entity.Client;

public interface IClientDao extends CrudRepository<Client,Long> {

}
