package com.dimitrios_papakonstantinou.restdemo.controller;

import com.dimitrios_papakonstantinou.restdemo.model.CloudVendor;
import org.springframework.web.bind.annotation.*;

//In terms of the Spring Boot Project Architecture(for REST APIs) this Would be the Controller Layer
//this handler supports json by default
//ThisClass handles routes and requests for /cloudvendor
@RestController
@RequestMapping("/cloudvendor")
public class CloudVentorAPIService {

    CloudVendor cloudVendor;

    //GET API
    //vendor id is the parameter added at the end of an url ex. api/:id. the param is called query I think
    @GetMapping("{vendorId}")
    public CloudVendor getCloudVenorDetails(String vendorId) {
        return cloudVendor;
    }

    //POST API
    //Maps Post request body to CloudVendor Object
    @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {

        this.cloudVendor = cloudVendor;
        return "CloudVendor was Created Successfully";
    }

    //PUT API
    @PutMapping
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {

        this.cloudVendor = cloudVendor;
        return "CloudVendor was Updated Successfully";
    }

    //DELETE API
    @DeleteMapping("{vendorId}")
    public String deleteCloudVendorDetails(String vendorId) {

        this.cloudVendor = null;
        return "CloudVendor was Deleted Successfully";
    }
}
