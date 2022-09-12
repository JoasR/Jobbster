package com.example.demo.entity.model;

import com.example.demo.entity.DTO.TaskDTO;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String description;

    @ManyToOne
    @JoinColumn(name = "address_id")
    private Address address;

    @Enumerated(EnumType.STRING)
    private Category category;

    private String imageUrl;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDateTime postDate;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User taskPostUser;

    public Task() {
    }

    public Task(Long id, String title, String description, Address address, Category category, String imageUrl, LocalDateTime postDate, User user) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.address = address;
        this.category = category;
        this.imageUrl = imageUrl;
        this.postDate = postDate;
        this.taskPostUser = user;
    }

    public Task(String title, String description, Address address, Category category, String imageUrl, LocalDateTime postDate, User user) {
        this.title = title;
        this.description = description;
        this.address = address;
        this.category = category;
        this.imageUrl = imageUrl;
        this.postDate = postDate;
        this.taskPostUser = user;
    }

    public Task(String title, String description, Category category, String imageUrl, LocalDateTime postDate) {
        this.title = title;
        this.description = description;
        this.category = category;
        this.imageUrl = imageUrl;
        this.postDate = postDate;
    }

    public Task(Long id, String title, String description, Category category, String imageUrl, LocalDateTime postDate) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.category = category;
        this.imageUrl = imageUrl;
        this.postDate = postDate;
    }

    public Task(TaskDTO taskDTO){
        this.id = taskDTO.getId();
        this.title = taskDTO.getTitle();
        this.description = taskDTO.getDescription();
        this.category = taskDTO.getCategory();
        this.imageUrl = taskDTO.getImageUrl();
        this.postDate = taskDTO.getPostDate();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public LocalDateTime getPostDate() {
        return postDate;
    }

    public void setPostDate(LocalDateTime postDate) {
        this.postDate = postDate;
    }

    public User getTaskPostUser() {
        return taskPostUser;
    }

    public void setTaskPostUser(User taskPostUser) {
        this.taskPostUser = taskPostUser;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", address=" + address +
                ", category=" + category +
                ", imageUrl='" + imageUrl + '\'' +
                ", postDate=" + postDate +
                ", user=" + taskPostUser +
                '}';
    }
}
