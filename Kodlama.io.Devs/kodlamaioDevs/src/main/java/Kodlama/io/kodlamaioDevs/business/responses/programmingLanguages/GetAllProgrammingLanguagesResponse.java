package Kodlama.io.kodlamaioDevs.business.responses.programmingLanguages;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllProgrammingLanguagesResponse {

	private int programmingLanguageId;
	private String programmingLanguageName;
}
