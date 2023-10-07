package com.thinkconstructive.rest.demo.controller;

import com.thinkconstructive.rest.demo.model.CloudVendor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorAPIService {
    CloudVendor cloudVendor;
    @GetMapping("{id}")
   public CloudVendor getCloudVendorDetails(String id)
   {
       return cloudVendor;
     //  return new CloudVendor("C1","Vendor 1","Address One","xxxxx");

   }
   @PostMapping
   public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor)
   {
       this.cloudVendor = cloudVendor;
       return "Cloud Vendor Created Successfully";
   }
   @PutMapping
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor)
    {
        this.cloudVendor = cloudVendor;
        return "Cloud Vendor Updated Successfully";
    }
    @DeleteMapping("{vendorId}")
    public String deleteCloudVendorDetails(String vendorId)
    {
        this.cloudVendor = null;
        return "Cloud Vendor Deleted Successfully";
    }
}
