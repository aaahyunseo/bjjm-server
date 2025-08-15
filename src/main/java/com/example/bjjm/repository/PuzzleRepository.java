package com.example.bjjm.repository;

import com.example.bjjm.entity.Puzzle;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PuzzleRepository extends JpaRepository<Puzzle, UUID> {
}
