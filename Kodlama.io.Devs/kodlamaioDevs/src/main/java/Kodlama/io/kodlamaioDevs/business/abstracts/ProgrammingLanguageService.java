package Kodlama.io.kodlamaioDevs.business.abstracts;

import java.util.List;

import Kodlama.io.kodlamaioDevs.business.requests.programmingLanguages.CreateProgrammingLanguageRequest;
import Kodlama.io.kodlamaioDevs.business.requests.programmingLanguages.DeleteProgrammingLanguageRequest;
import Kodlama.io.kodlamaioDevs.business.requests.programmingLanguages.UpdateProgrammingLanguageRequest;
import Kodlama.io.kodlamaioDevs.business.responses.programmingLanguages.GetAllProgrammingLanguagesResponse;
import Kodlama.io.kodlamaioDevs.business.responses.programmingLanguages.GetByIdProgrammingLanguageResponse;

public interface ProgrammingLanguageService {

	List<GetAllProgrammingLanguagesResponse> getAll();

	GetByIdProgrammingLanguageResponse getById(int id);

	void add(CreateProgrammingLanguageRequest createProgrammingLanguageRequest) throws Exception;

	void update(UpdateProgrammingLanguageRequest updateProgrammingLanguageRequest, int id) throws Exception;

	void delete(DeleteProgrammingLanguageRequest deleteProgrammingLanguageRequest,int id);
}
