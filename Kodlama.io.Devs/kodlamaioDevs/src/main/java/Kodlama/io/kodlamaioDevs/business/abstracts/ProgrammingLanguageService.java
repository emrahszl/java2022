package Kodlama.io.kodlamaioDevs.business.abstracts;

import java.util.List;

import Kodlama.io.kodlamaioDevs.entities.concretes.ProgrammingLanguage;

public interface ProgrammingLanguageService {
	List<ProgrammingLanguage> getAll();
	
	void add(ProgrammingLanguage programmingLanguage) throws Exception;
	void update(ProgrammingLanguage programmingLanguage) throws Exception;
	void delete(ProgrammingLanguage programmingLanguage);
	ProgrammingLanguage geById(int id);
}
