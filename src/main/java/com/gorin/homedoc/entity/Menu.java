package com.gorin.homedoc.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@Entity
@Table
@NoArgsConstructor
public class Menu {
    @Id
    @Column(name = "id")
    private UUID id;

    @Column(name = "packedge_name")
    private UUID packedgeName;



}
