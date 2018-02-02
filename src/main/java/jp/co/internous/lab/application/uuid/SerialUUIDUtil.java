package jp.co.internous.lab.application.uuid;

import java.util.UUID;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class SerialUUIDUtil {

	private UUID serialUUID = UUID.randomUUID();

}

