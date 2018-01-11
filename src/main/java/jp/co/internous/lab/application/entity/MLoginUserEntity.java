package jp.co.internous.lab.application.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.Data;

@Entity
@Component
@Data
@Table(name="login_user")
public class MLoginUserEntity {

	@Id
	private int id;

	@Column
	private String loginId;

	@Column
	private String loginPassword;

	@Column
	private String userName;
}
