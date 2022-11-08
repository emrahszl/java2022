package Kodlama.io.kodlamaioDevs.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Kodlama.io.kodlamaioDevs.business.abstracts.SubTechnologyService;
import Kodlama.io.kodlamaioDevs.business.requests.subTechnologies.CreateSubTechnologyRequest;
import Kodlama.io.kodlamaioDevs.business.requests.subTechnologies.DeleteSubTechnologyRequest;
import Kodlama.io.kodlamaioDevs.business.requests.subTechnologies.UpdateSubTechnologyRequest;
import Kodlama.io.kodlamaioDevs.business.responses.subTechnologies.GetAllSubTechnologiesResponse;
import Kodlama.io.kodlamaioDevs.dataAccess.abstracts.ProgrammingLanguageRepository;
import Kodlama.io.kodlamaioDevs.dataAccess.abstracts.SubTechnologyRepository;
import Kodlama.io.kodlamaioDevs.entities.concretes.ProgrammingLanguage;
import Kodlama.io.kodlamaioDevs.entities.concretes.SubTechnology;

@Service
public class SubTechnologyManager implements SubTechnologyService {

	private SubTechnologyRepository subTechnologyRepository;
	private ProgrammingLanguageRepository programmingLanguageRepository;

	
	@Autowired
	public SubTechnologyManager(SubTechnologyRepository subTechnologyRepository,
			ProgrammingLanguageRepository programmingLanguageRepository) {
		
		this.subTechnologyRepository = subTechnologyRepository;
		this.programmingLanguageRepository = programmingLanguageRepository;
	}

	@Override
	public List<GetAllSubTechnologiesResponse> getAll() {

		List<SubTechnology> subTechnologies = subTechnologyRepository.findAll();
		List<GetAllSubTechnologiesResponse> subTechnologiesResponse = new ArrayList<GetAllSubTechnologiesResponse>();

		for (SubTechnology subTechnology : subTechnologies) {
			GetAllSubTechnologiesResponse responseItem = new GetAllSubTechnologiesResponse();
			responseItem.setSubTechnologyName(subTechnology.getSubTechnologyName());
			subTechnologiesResponse.add(responseItem);
		}
		return subTechnologiesResponse;
	}

	@Override
	public void add(CreateSubTechnologyRequest createSubTechnologyRequest){
		
		SubTechnology subTechnology = new SubTechnology();
		ProgrammingLanguage programmingLanguage = programmingLanguageRepository.findById(createSubTechnologyRequest.getProgrammingLanguageId()).get();
		subTechnology.setSubTechnologyName(createSubTechnologyRequest.getSubTechnologyName());
		subTechnology.setProgrammingLanguage(programmingLanguage);
		subTechnologyRepository.save(subTechnology);
			}

	@Override
	public void update(UpdateSubTechnologyRequest updateSubTechnologyRequest, int id){
		
		SubTechnology subTechnology = subTechnologyRepository.findById(id).get();
		ProgrammingLanguage programmingLanguage = programmingLanguageRepository.findById(updateSubTechnologyRequest.getProgrammingLanguageId()).get();
		subTechnology.setSubTechnologyName(updateSubTechnologyRequest.getSubTechnologyName());
		subTechnology.setProgrammingLanguage(programmingLanguage);
		subTechnologyRepository.save(subTechnology);
			}

	@Override
	public void delete(DeleteSubTechnologyRequest deleteSubTechnologyRequest, int id) {
		subTechnologyRepository.deleteById(deleteSubTechnologyRequest.getSubTechnologyId());

	}

}
