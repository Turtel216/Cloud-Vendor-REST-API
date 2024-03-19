package com.dimitrios_papakonstantinou.restdemo;

import com.dimitrios_papakonstantinou.restdemo.model.CloudVendor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CloudVendorRepository  extends JpaRepository<CloudVendor, String> {

}
