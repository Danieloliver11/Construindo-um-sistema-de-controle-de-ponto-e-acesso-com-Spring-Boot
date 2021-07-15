package com.dio.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dio.demo.Model.JornadadTrabalho;
import com.dio.demo.Repository.JornadaRepository;

@Service
public class JornadaService {
		
	

		JornadaRepository workdayRepository;

	    @Autowired
	    public JornadaService(JornadaRepository workdayRepository){
	        this.workdayRepository = workdayRepository;
	    }

	    public JornadadTrabalho save(JornadadTrabalho workday){
	       return workdayRepository.save(workday);
	    }

	    public List<JornadadTrabalho> findAll() {
	        return workdayRepository.findAll();
	    }

	    public Optional<JornadadTrabalho> findById(Long id) {
	        return workdayRepository.findById(id);
	    }

	    public JornadadTrabalho update(JornadadTrabalho workday){
	        return workdayRepository.save(workday);
	    }

	    public void deleteWorkday(Long id) {
	        workdayRepository.deleteById(id);
	    }

}
