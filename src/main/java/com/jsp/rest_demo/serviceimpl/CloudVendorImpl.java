package com.jsp.rest_demo.serviceimpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jsp.rest_demo.entity.CloudVendor;
import com.jsp.rest_demo.exception.CloudVendorNotFoundException;
import com.jsp.rest_demo.repository.CloudVendorRepository;
import com.jsp.rest_demo.service.CloudVendorService;



@Service
public class CloudVendorImpl implements CloudVendorService{

	CloudVendorRepository repository;
	
	public CloudVendorImpl(CloudVendorRepository repository) {
		super();
		this.repository = repository;
	}
	
	 
	@Override
	public CloudVendor getCloudVendorDetails(String vendorId) {
		//More Business Logic
		
		if(repository.findById(vendorId).isEmpty()) throw new CloudVendorNotFoundException("No cloud vendor exist by this cloudVendorId");
	
		//since it return optional so, i will call one more method so that i will give me the required object
		return repository.findById(vendorId).get();
	}

	@Override
	public String createCloudVendorDeatils(CloudVendor cloudVendors) {
		//More Business Logic
		
       repository.save(cloudVendors);
		return "Sucessfully created clound vendor object";
	}

	@Override
	public String updateCloudVendorDeatils(CloudVendor cloudVendors) {
		//More Business Logic
		
       repository.save(cloudVendors);
		return "Sucessfully updated clound vendor object";
	}

	//delete is sensitive so, we have to be careful
	@Override
	public String deleteCloudVendorDeatils(String vendorId) {
		//More Business Logic
		
		repository.deleteById(vendorId);
		return "sucessfully deleted cloud vendor object by Id ";
	}

	@Override
	public List<CloudVendor> getAllCloudVendors() {
		//More Business Logic
		
		return repository.findAll();
	}

	

}
