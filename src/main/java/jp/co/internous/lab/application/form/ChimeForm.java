package jp.co.internous.lab.application.form;

import java.io.Serializable;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class ChimeForm implements Serializable {

	private static final long serialVersionUID = -1L;

	@NotEmpty
	private int id;

	@NotEmpty
	private boolean stopChimeFlg;

}
