package br.com.pauloleitecosta.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.pauloleitecosta.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
