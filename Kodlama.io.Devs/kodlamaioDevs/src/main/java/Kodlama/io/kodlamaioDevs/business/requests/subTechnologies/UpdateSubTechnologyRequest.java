package Kodlama.io.kodlamaioDevs.business.requests.subTechnologies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateSubTechnologyRequest {

	private int programmingLanguageId;
	private String subTechnologyName;
}
