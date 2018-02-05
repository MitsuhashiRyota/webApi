package jp.co.internous.lab.application.entity;


import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Entity
@Data
@Table(name="t_user_info")
public class TUserInfoEntity {

	@Id
	private int id;

	@Column(name="user_first_name_kana", columnDefinition="varchar(255)")
	private String userFirstNameKana;

	@Column
	private String userLastNameKana;

	@Column
	private String userFirstName;

	@Column
	private String userLastName;

	@Column
	private String telNumber;

	@Column
	private String mailAddress;

	@Column
	private int visitCount;

	@Column
	private Date lastVisitDate;

	@Column
	private String memo;

	@Column
	private Date insertDate;
}
