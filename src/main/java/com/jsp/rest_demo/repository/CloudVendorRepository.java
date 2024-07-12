package com.jsp.rest_demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.rest_demo.entity.CloudVendor;

//first parameter is entity class , 2nd parameter is data type of Id
public interface CloudVendorRepository extends JpaRepository<CloudVendor, String>{

}
