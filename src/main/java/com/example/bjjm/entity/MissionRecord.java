package com.example.bjjm.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Table(name = "mission_records")
public class MissionRecord extends BaseEntity {

    @Column(nullable = false)
    private int score;

    @OneToMany(mappedBy = "missionRecord", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<MissionRecordImage> imageFiles;

    @Column(nullable = false)
    private String content;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "mission_id", nullable = false)
    private Mission mission;

    public void setImageFiles(List<MissionRecordImage> imageFiles) {
        this.imageFiles = imageFiles;
    }
}
