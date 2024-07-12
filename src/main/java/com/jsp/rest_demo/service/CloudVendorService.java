package com.jsp.rest_demo.service;

import java.util.List;

import com.jsp.rest_demo.entity.CloudVendor;

public interface CloudVendorService {

	//write method
 public CloudVendor getCloudVendorDetails(String vendorId);
 public String createCloudVendorDeatils(CloudVendor cloudVendors);
 public String updateCloudVendorDeatils(CloudVendor cloudVendors);
 public String deleteCloudVendorDeatils(String vendorId ) ;
 
 //list<object Type>
 public List<CloudVendor> getAllCloudVendors();

}
