package jp.co.internous.lab.application.form;

import java.io.Serializable;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class TUserInfoFrom implements Serializable {

	private static final long serialVersionUID = -1L;

	@NotEmpty
	private int id;

	@NotEmpty
    private String userFirstNameKana;

	@NotEmpty
	private String userLastNameKana;

	@NotEmpty
	private String userFirstName;

	@NotEmpty
	private String userLastName;

	@NotEmpty
	private String telNumber;

	@NotEmpty
	private String mailAddress;

	@NotEmpty
	private int visitCount;

//	@NotEmpty
//	private Date lastVisitDate;

	@NotEmpty
	private String memo;
}
