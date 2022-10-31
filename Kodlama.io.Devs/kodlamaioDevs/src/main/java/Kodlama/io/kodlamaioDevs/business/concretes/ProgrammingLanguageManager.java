package Kodlama.io.kodlamaioDevs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Kodlama.io.kodlamaioDevs.business.abstracts.ProgrammingLanguageService;
import Kodlama.io.kodlamaioDevs.dataAccess.abstracts.ProgrammingLanguageRepository;
import Kodlama.io.kodlamaioDevs.entities.concretes.ProgrammingLanguage;

@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService{
	private ProgrammingLanguageRepository programmingLanguageRepository;
	
	@Autowired
	public ProgrammingLanguageManager(ProgrammingLanguageRepository programmingLanguageRepository) {
		
		this.programmingLanguageRepository = programmingLanguageRepository;
	}

	@Override
	public List<ProgrammingLanguage> getAll() {
		
		return programmingLanguageRepository.getAll();
	}

	@Override
	public void add(ProgrammingLanguage programmingLanguage) throws Exception {
		for (ProgrammingLanguage pLanguage : this.programmingLanguageRepository.getAll()) {
			if (programmingLanguage.getName() == pLanguage.getName()) {
				throw new Exception("Kurs ismi mevcut!");
			}else if (programmingLanguage.getName() == null) {
				throw new Exception("Kurs ismi boş bırakılamaz!");
			}
		}
		
	}

	@Override
	public void update(ProgrammingLanguage programmingLanguage) throws Exception {
		for (ProgrammingLanguage pLanguage : this.programmingLanguageRepository.getAll()) {
			if (programmingLanguage.getName() == pLanguage.getName()) {
				throw new Exception("Kurs ismi mevcut!");
			}else if (programmingLanguage.getName() == null) {
				throw new Exception("Kurs ismi boş bırakılamaz!");
			}
		}
	}

	@Override
	public void delete(ProgrammingLanguage programmingLanguage) {
		programmingLanguageRepository.delete(programmingLanguage);
		
	}

	@Override
	public ProgrammingLanguage geById(int id) {
		return programmingLanguageRepository.getById(id);
	}

}
