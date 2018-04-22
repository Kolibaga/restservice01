package info.econsim.restservice01.service;


import org.springframework.data.repository.CrudRepository;

import info.econsim.restservice01.data.EsUser;

public interface Users  extends CrudRepository<EsUser, String> {

    public EsUser findByName(String name);
    public Iterable<EsUser> findByEmail(String email);

}