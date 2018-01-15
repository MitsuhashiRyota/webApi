package jp.co.internous.lab.application.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MLoginUserResponse {

	private int loginId;

	private String loginPassword;

	private String userName;
}