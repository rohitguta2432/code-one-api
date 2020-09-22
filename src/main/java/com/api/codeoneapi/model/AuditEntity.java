package com.api.codeoneapi.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@NoArgsConstructor
@Data
@SuperBuilder
public abstract class AuditEntity {

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_on")
    @CreatedDate
    protected Date createOn;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updated_on")
    @LastModifiedDate
    protected Date updatedOn;

}
