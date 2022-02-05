package com.ecodation.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AdminDto implements Serializable {
	private static final long serialVersionUID = -5787824793296421403L;

	private int adminId;
	private String adminName;
	private String adminSurname;

}
