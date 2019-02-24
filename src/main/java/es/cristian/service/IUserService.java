package es.cristian.service;

import es.cristian.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserService extends JpaRepository<User, Integer> {

}
