package Kodlama.io.kodlamaioDevs.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Kodlama.io.kodlamaioDevs.business.abstracts.ProgrammingLanguageService;
import Kodlama.io.kodlamaioDevs.business.requests.programmingLanguages.CreateProgrammingLanguageRequest;
import Kodlama.io.kodlamaioDevs.business.requests.programmingLanguages.DeleteProgrammingLanguageRequest;
import Kodlama.io.kodlamaioDevs.business.requests.programmingLanguages.UpdateProgrammingLanguageRequest;
import Kodlama.io.kodlamaioDevs.business.responses.programmingLanguages.GetAllProgrammingLanguagesResponse;
import Kodlama.io.kodlamaioDevs.business.responses.programmingLanguages.GetByIdProgrammingLanguageResponse;
import Kodlama.io.kodlamaioDevs.dataAccess.abstracts.ProgrammingLanguageRepository;
import Kodlama.io.kodlamaioDevs.entities.concretes.ProgrammingLanguage;

@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService {
	
	private ProgrammingLanguageRepository programmingLanguageRepository;

	@Autowired
	public ProgrammingLanguageManager(ProgrammingLanguageRepository programmingLanguageRepository) {

		this.programmingLanguageRepository = programmingLanguageRepository;
	}

	@Override
	public List<GetAllProgrammingLanguagesResponse> getAll() {

		List<ProgrammingLanguage> programmingLanguages = programmingLanguageRepository.findAll();
		List<GetAllProgrammingLanguagesResponse> programmingLanguagesResponse = new ArrayList<GetAllProgrammingLanguagesResponse>();

		for (ProgrammingLanguage programmingLanguage : programmingLanguages) {
			GetAllProgrammingLanguagesResponse responseItem = new GetAllProgrammingLanguagesResponse();
			responseItem.setProgrammingLanguageId(programmingLanguage.getProgrammingLanguageId());
			responseItem.setProgrammingLanguageName(programmingLanguage.getProgrammingLanguageName());
			programmingLanguagesResponse.add(responseItem);
		}
		return programmingLanguagesResponse;
	}

	@Override
	public GetByIdProgrammingLanguageResponse getById(int id) {

		ProgrammingLanguage programmingLanguage = programmingLanguageRepository.findById(id).get();
		GetByIdProgrammingLanguageResponse getByIdProgrammingLanguagesResponse = new GetByIdProgrammingLanguageResponse();
		getByIdProgrammingLanguagesResponse.setProgrammingLanguageName(programmingLanguage.getProgrammingLanguageName());
		
		return getByIdProgrammingLanguagesResponse;
	}

	@Override
	public void add(CreateProgrammingLanguageRequest createProgrammingLanguageRequest) throws Exception {
		
		ProgrammingLanguage programmingLanguage = new ProgrammingLanguage();

		for (ProgrammingLanguage pLanguage : this.programmingLanguageRepository.findAll()) {
			if (createProgrammingLanguageRequest.getProgrammingLanguageName().equals(pLanguage.getProgrammingLanguageName())) {
				throw new Exception("Program ismi mevcut!");
			} else if (createProgrammingLanguageRequest.getProgrammingLanguageName() == null) {
				throw new Exception("Program ismi boş bırakılamaz!");
			} else {
				programmingLanguage.setProgrammingLanguageName(createProgrammingLanguageRequest.getProgrammingLanguageName());
				programmingLanguageRepository.save(programmingLanguage);
			}
		}
	}

	@Override
	public void update(UpdateProgrammingLanguageRequest updateProgrammingLanguageRequest, int id) throws Exception {
		
		ProgrammingLanguage programmingLanguage = programmingLanguageRepository.findById(id).get();
		programmingLanguage.setProgrammingLanguageName(updateProgrammingLanguageRequest.getProgrammingLanguageName());
		for (ProgrammingLanguage pLanguage : this.programmingLanguageRepository.findAll()) {
			if (updateProgrammingLanguageRequest.getProgrammingLanguageName().equals(pLanguage.getProgrammingLanguageName())) {
				throw new Exception("Program ismi mevcut!");
			} else if (updateProgrammingLanguageRequest.getProgrammingLanguageName() == null) {
				throw new Exception("Program ismi boş bırakılamaz!");
			} else {
				programmingLanguageRepository.save(programmingLanguage);
			}
		}
	}

	@Override
	public void delete(DeleteProgrammingLanguageRequest deleteProgrammingLanguageRequest, int id) {
		programmingLanguageRepository.deleteById(deleteProgrammingLanguageRequest.getProgrammingLanguageId());
	}
}
