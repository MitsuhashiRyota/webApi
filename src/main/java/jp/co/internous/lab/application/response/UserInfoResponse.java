package jp.co.internous.lab.application.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserInfoResponse {

	private int id;

	private String name;

	private String age;

}
