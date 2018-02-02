package jp.co.internous.lab.application.response;



import java.sql.Date;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TUserInfoResponse {

	private int id;

	private String userFirstNameKana;

	private String userLastNameKana;

	private String userFirstName;

	private String userLastName;

	private String telNumber;

	private String mailAddress;

	private int visitCount;

	private Date lastVisitDate;

	private String memo;

	private Date insertDate;
}
