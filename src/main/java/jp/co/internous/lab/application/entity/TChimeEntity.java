package jp.co.internous.lab.application.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Entity
@Data
@Table(name="chime_info")
public class TChimeEntity {

	@Id
	private int id;

	@Column
	private String chimeFlg;

}
