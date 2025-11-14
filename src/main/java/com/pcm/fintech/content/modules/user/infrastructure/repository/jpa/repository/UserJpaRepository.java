package com.pcm.fintech.content.modules.user.infrastructure.repository.jpa.repository;

import com.pcm.fintech.content.modules.user.infrastructure.repository.jpa.entity.UserJpa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserJpaRepository extends JpaRepository<UserJpa, Long> {
    //Aquí pueden ir las custom queries
}
