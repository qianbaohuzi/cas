package com.huzi.sso.infrastructure.entity;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public abstract class BaseEntity {

    private LocalDateTime updatedBy;

    private LocalDateTime createdBy;
}
