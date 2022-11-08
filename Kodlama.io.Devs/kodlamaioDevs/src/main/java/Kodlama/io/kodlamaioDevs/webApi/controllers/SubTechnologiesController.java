package Kodlama.io.kodlamaioDevs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Kodlama.io.kodlamaioDevs.business.abstracts.SubTechnologyService;
import Kodlama.io.kodlamaioDevs.business.requests.subTechnologies.CreateSubTechnologyRequest;
import Kodlama.io.kodlamaioDevs.business.requests.subTechnologies.DeleteSubTechnologyRequest;
import Kodlama.io.kodlamaioDevs.business.requests.subTechnologies.UpdateSubTechnologyRequest;
import Kodlama.io.kodlamaioDevs.business.responses.subTechnologies.GetAllSubTechnologiesResponse;

@RestController
@RequestMapping("/api/subtechnologies")
public class SubTechnologiesController {

	private SubTechnologyService subTechnologyService;

	@Autowired
	public SubTechnologiesController(SubTechnologyService subTechnologyService) {
		
		this.subTechnologyService = subTechnologyService;
	}
	
	@GetMapping("/getall")
	public List<GetAllSubTechnologiesResponse> getAll(){
		return subTechnologyService.getAll();
	}
	
	@PostMapping
	public void add(CreateSubTechnologyRequest createSubTechnologyRequest) {
		this.subTechnologyService.add(createSubTechnologyRequest);
	}
	
	@PutMapping
	public void update(UpdateSubTechnologyRequest updateSubTechnologyRequest, int id) {
		this.subTechnologyService.update(updateSubTechnologyRequest, id);
	}
	
	@DeleteMapping
	public void delete(DeleteSubTechnologyRequest deleteSubTechnologyRequest, int id) {
		this.subTechnologyService.delete(deleteSubTechnologyRequest, id);
	}
}
