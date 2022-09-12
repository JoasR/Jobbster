package com.example.demo.entity.DTO;

import com.example.demo.entity.model.Address;
import com.example.demo.entity.model.Task;

import java.util.List;

public class AddressDTO {
    private Long id;

    private String city;

    private String postcode;

    private String streetAndHouseNumber;

    private List<Task> taskList;

    public AddressDTO(Address address){
        this.id = address.getId();
        this.city = address.getCity();
        this.postcode = address.getPostcode();
        this.streetAndHouseNumber = address.getStreetAndHouseNumber();
        this.taskList = address.getTaskList();
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
        return "AddressDTO{" +
                "id=" + id +
                ", city='" + city + '\'' +
                ", postcode='" + postcode + '\'' +
                ", streetAndHouseNumber='" + streetAndHouseNumber + '\'' +
                ", taskList=" + taskList +
                '}';
    }
}
