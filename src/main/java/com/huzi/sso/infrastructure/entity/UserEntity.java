package com.huzi.sso.infrastructure.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Accessors(chain = true)
@Getter
@Setter
@Entity
public class UserEntity {

    @Id
    private String id;

    private String username;

    private String nickname;
}
