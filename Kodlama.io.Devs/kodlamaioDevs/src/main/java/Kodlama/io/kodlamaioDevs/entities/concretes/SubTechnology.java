package Kodlama.io.kodlamaioDevs.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "subtechnologies")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class SubTechnology {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "subtechnology_id")
	private int subTechnologyId;
	
	@Column(name = "subtechnology_name")
	private String subTechnologyName;
	
	@ManyToOne
	@JoinColumn(name = "programming_language_id")
	private ProgrammingLanguage programmingLanguage;
}
