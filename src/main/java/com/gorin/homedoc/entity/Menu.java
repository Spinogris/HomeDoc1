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
@NoArgsConstructor
@Table(name = "Menu")
public class Menu {
    @Id
    @Column(name = "package_id")
    private UUID id;

    @Column(name = "package")
    private UUID packageName;

    @Column(name = "size")
    private UUID size;



}
