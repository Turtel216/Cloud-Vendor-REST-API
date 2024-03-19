package com.dimitrios_papakonstantinou.restdemo.controller;

import com.dimitrios_papakonstantinou.restdemo.model.CloudVendor;
import com.dimitrios_papakonstantinou.restdemo.service.CloudVendorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//In terms of the Spring Boot Project Architecture(for REST APIs) this Would be the Controller Layer
//this handler supports json by default
//ThisClass handles routes and requests for /cloudvendor
@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorController {

    private final CloudVendorService cloudVendorService;

    public CloudVendorController(CloudVendorService cloudVendorService) {
        this.cloudVendorService = cloudVendorService;
    }



    //GET API
    //vendor id is the parameter added at the end of an url ex. api/:id. the param is called query I think
    // Read Specific Cloud Vendor Details
    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendorDetails(@PathVariable("vendorId") String vendorId) {

        return cloudVendorService.getCloudVendor(vendorId);
    }

    //Read all Cloud Vendors Detail
    @GetMapping()
    public List<CloudVendor> getAllCloudVendorDetails() {

        return cloudVendorService.getAllCloudVendors();
    }

    //POST API
    //Maps Post request body to CloudVendor Object
    @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {

        cloudVendorService.createCloudVendor(cloudVendor);
        return "CloudVendor was Created Successfully";
    }

    //PUT API
    @PutMapping
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {

        cloudVendorService.updateCloudVendor(cloudVendor);
        return "CloudVendor was Updated Successfully";
    }

    //DELETE API
    @DeleteMapping("{vendorId}")
    public String deleteCloudVendorDetails(@PathVariable("vendorId") String vendorId) {

        cloudVendorService.deleteCloudVendor(vendorId);
        return "CloudVendor was Deleted Successfully";
    }
}
