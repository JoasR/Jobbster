package com.example.demo.entity.model;

import com.example.demo.entity.DTO.AddressDTO;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String city;

    private String postcode;

    private String streetAndHouseNumber;

    @OneToMany(mappedBy = "address")
    private List<Task> taskList;

    public Address(){

    }

    public Address(Long id, String city, String postcode, String streetAndHouseNumber, List<Task> taskList) {
        this.id = id;
        this.city = city;
        this.postcode = postcode;
        this.streetAndHouseNumber = streetAndHouseNumber;
        this.taskList = taskList;
    }

    public Address(String city, String postcode, String streetAndHouseNumber, List<Task> taskList) {
        this.city = city;
        this.postcode = postcode;
        this.streetAndHouseNumber = streetAndHouseNumber;
        this.taskList = taskList;
    }

    public Address(Long id, String city, String postcode, String streetAndHouseNumber) {
        this.id = id;
        this.city = city;
        this.postcode = postcode;
        this.streetAndHouseNumber = streetAndHouseNumber;
    }

    public Address(String city, String postcode, String streetAndHouseNumber) {
        this.city = city;
        this.postcode = postcode;
        this.streetAndHouseNumber = streetAndHouseNumber;
    }

    public Address(AddressDTO addressDTO){
        this.id = addressDTO.getId();
        this.city = addressDTO.getCity();
        this.postcode = addressDTO.getPostcode();
        this.streetAndHouseNumber = addressDTO.getStreetAndHouseNumber();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getStreetAndHouseNumber() {
        return streetAndHouseNumber;
    }

    public void setStreetAndHouseNumber(String streetAndHouseNumber) {
        this.streetAndHouseNumber = streetAndHouseNumber;
    }

    public List<Task> getTaskList() {
        return taskList;
    }

    public void setTaskList(List<Task> taskList) {
        this.taskList = taskList;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", city='" + city + '\'' +
                ", postcode='" + postcode + '\'' +
                ", streetAndHouseNumber='" + streetAndHouseNumber + '\'' +
                ", taskList=" + taskList +
                '}';
    }
}
