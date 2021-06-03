package br.com.pauloleitecosta.hruser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.pauloleitecosta.hruser.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByEmail(String email);
}
