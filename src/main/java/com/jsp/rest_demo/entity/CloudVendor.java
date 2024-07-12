package com.jsp.rest_demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cloud-vendor-info")
public class CloudVendor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int vendorId;
	private String vendorName;
	private String Address;
	private String vendorPhoneNumber;
	
}
