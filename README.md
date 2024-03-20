# Cloud-Vendor-REST-API

## About
This is a small and simple implementation of a CloudVendorAPI using Java's Spring Boot and MySQL.

## Features
The API provides services which include:
  - Create a cloud vendor entity which contains an ID, a Name, an Address, and the Vendor's Phone number. By creating this entity, the service also saves the cloud vendor's information to the MySQL database (**POST** /cloudvendor).
  - Get the information of a cloud vendor of a specific id (**GET** /cloudvendor/{id}).
  - Get the information of all cloud vendors (**GET** /cloudvendor).
  - Delete a cloud vendor with a specific id from the database (**DELETE** /cloudvendor/{id}).
  - Update a cloud vendor (**PUT** /cloudvendor).

The passing of information uses the JSON text format. Here is an example of the JSON file layout which is used:

      {
          "vendorID": "C1",
          "vendorName": "Vendor 1",
          "vendorAddress": "Address 1",
          "vendorPhoneNumber": "1"
    }
