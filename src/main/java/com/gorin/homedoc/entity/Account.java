package com.gorin.homedoc.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "Login")
@NoArgsConstructor
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private UUID id;

    @OneToOne
    @Column(name = "login")
    private String name;

    @OneToOne
    @Column(name = "pass")
    private String password;

    @OneToOne
    @Column(name = "email")
    private String eMail;

    @OneToOne
    @Column(name = "stat")
    private String status;

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

}


enum Pass{
    ID, LOGIN, PASS, STAT;
//    Тут нужно описать правило ввода пароля(латинские символы, 1 цифра, 1 знак)
}