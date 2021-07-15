package com.dio.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dio.demo.Model.JornadadTrabalho;

@Repository
public interface JornadaRepository extends JpaRepository<JornadadTrabalho, Long>{

}
