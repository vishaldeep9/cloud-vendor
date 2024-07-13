package com.jsp.rest_demo.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.rest_demo.entity.CloudVendor;
import com.jsp.rest_demo.response.ResponseHandler;
import com.jsp.rest_demo.service.CloudVendorService;

@RestController
@RequestMapping("/cloud-vender")
public class CloudVendorController  {

	CloudVendorService service;

	public CloudVendorController(CloudVendorService service) {
		super();
		this.service = service;
	}

	@GetMapping("{vendorId}")
	public ResponseEntity<Object>  getCloudVendorDetails(@PathVariable String vendorId) {	
		
		//since we are handling positive scenario thati's why status code is OK
	return	ResponseHandler.responseBuilder("Requested vendor details are given here ", HttpStatus.OK, service.getCloudVendorDetails(vendorId));
		
	}
	
	@GetMapping
	public List<CloudVendor> getAllCloudVendors() {	
		return service.getAllCloudVendors();	
	}
	
	@PostMapping
	public String createCloudVendorDeatils(@RequestBody CloudVendor cloudVendors) {
		service.createCloudVendorDeatils(cloudVendors);
		return "cloud vendor object gets created succesfully";
}
	//whatever the cloudVendor details supposed to be updated should be passed as a RequestBody
	@PutMapping
	public String updateCloudVendorDeatils(@RequestBody CloudVendor cloudVendors) {
		service.updateCloudVendorDeatils(cloudVendors);
		return "cloud vendor object gets updated succesfully";
}
	@DeleteMapping("{vendorId}")
	public String deleteCloudVendorDeatils(@PathVariable String vendorId ) {
		service.deleteCloudVendorDeatils(vendorId);
		return "cloud vendor object gets deleted succesfully";
}
	}


