package Kodlama.io.kodlamaioDevs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Kodlama.io.kodlamaioDevs.business.abstracts.ProgrammingLanguageService;
import Kodlama.io.kodlamaioDevs.business.requests.programmingLanguages.CreateProgrammingLanguageRequest;
import Kodlama.io.kodlamaioDevs.business.requests.programmingLanguages.DeleteProgrammingLanguageRequest;
import Kodlama.io.kodlamaioDevs.business.requests.programmingLanguages.UpdateProgrammingLanguageRequest;
import Kodlama.io.kodlamaioDevs.business.responses.programmingLanguages.GetAllProgrammingLanguagesResponse;
import Kodlama.io.kodlamaioDevs.business.responses.programmingLanguages.GetByIdProgrammingLanguageResponse;

@RestController
@RequestMapping("/api/programminglanguages")
public class ProgrammingLanguagesController {
	
	private ProgrammingLanguageService programmingLanguageService;

	@Autowired
	public ProgrammingLanguagesController(ProgrammingLanguageService programmingLanguageService) {

		this.programmingLanguageService = programmingLanguageService;
	}

	@GetMapping("/getall")
	public List<GetAllProgrammingLanguagesResponse> getAll() {
		return programmingLanguageService.getAll();
	}

	@GetMapping
	public GetByIdProgrammingLanguageResponse getById(int id) {
		return programmingLanguageService.getById(id);
	}

	@PostMapping("/add")
	public void add(CreateProgrammingLanguageRequest createProgrammingLanguageRequest) throws Exception {
		programmingLanguageService.add(createProgrammingLanguageRequest);
	}
	
	@PutMapping("/update")
	public void update(UpdateProgrammingLanguageRequest updateProgrammingLanguageRequest, int id) throws Exception {
		programmingLanguageService.update(updateProgrammingLanguageRequest, id);
	}
	
	@DeleteMapping
	public void delete(DeleteProgrammingLanguageRequest deleteProgrammingLanguageRequest, int id) {
		programmingLanguageService.delete(deleteProgrammingLanguageRequest, id);
	}
}
