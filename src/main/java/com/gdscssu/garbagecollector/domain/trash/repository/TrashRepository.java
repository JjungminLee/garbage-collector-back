package com.gdscssu.garbagecollector.domain.trash.repository;

import com.gdscssu.garbagecollector.domain.trash.entity.Trash;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrashRepository extends JpaRepository<Trash,Long> {


}