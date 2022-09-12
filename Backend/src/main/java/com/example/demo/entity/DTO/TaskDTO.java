package com.example.demo.entity.DTO;

import com.example.demo.entity.model.Address;
import com.example.demo.entity.model.Category;
import com.example.demo.entity.model.Task;
import com.example.demo.entity.model.User;

import java.time.LocalDateTime;
import java.util.Date;

public class TaskDTO {
    private Long id;

    private String title;

    private String description;

    private Address address;

    private Category category;

    private String imageUrl;

    private LocalDateTime postDate;

    private User taskPostUser;
    public TaskDTO(Task task) {
        this.id = task.getId();
        this.title = task.getTitle();
        this.description = task.getDescription();;
        this.address = task.getAddress();
        this.category = task.getCategory();
        this.imageUrl = task.getImageUrl();
        this.postDate = task.getPostDate();
        this.taskPostUser = task.getTaskPostUser();
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
        return "TaskDTO{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", address=" + address +
                ", category=" + category +
                ", imageUrl='" + imageUrl + '\'' +
                ", postDate=" + postDate +
                ", taskPostUser=" + taskPostUser +
                '}';
    }
}
