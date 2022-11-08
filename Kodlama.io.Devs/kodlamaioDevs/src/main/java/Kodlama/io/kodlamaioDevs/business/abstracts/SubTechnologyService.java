package Kodlama.io.kodlamaioDevs.business.abstracts;

import java.util.List;

import Kodlama.io.kodlamaioDevs.business.requests.subTechnologies.CreateSubTechnologyRequest;
import Kodlama.io.kodlamaioDevs.business.requests.subTechnologies.DeleteSubTechnologyRequest;
import Kodlama.io.kodlamaioDevs.business.requests.subTechnologies.UpdateSubTechnologyRequest;
import Kodlama.io.kodlamaioDevs.business.responses.subTechnologies.GetAllSubTechnologiesResponse;

public interface SubTechnologyService {

	List<GetAllSubTechnologiesResponse> getAll();

	void add(CreateSubTechnologyRequest createSubTechnologyRequest);

	void update(UpdateSubTechnologyRequest updateSubTechnologyRequest, int id);

	void delete(DeleteSubTechnologyRequest deleteSubTechnologyRequest, int id);
}
