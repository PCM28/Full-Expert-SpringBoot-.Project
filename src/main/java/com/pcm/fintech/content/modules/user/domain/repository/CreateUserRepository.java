package com.pcm.fintech.content.modules.user.domain.repository;

import com.pcm.fintech.content.modules.user.domain.entity.User;

public interface CreateUserRepository {
    User create(User user); //throws NotFoundException <- ver si van así o con un global exception
    //Esto para otro usecase, también puede haber un 6th useCase: Booleab existsByEmail(String email);
}
