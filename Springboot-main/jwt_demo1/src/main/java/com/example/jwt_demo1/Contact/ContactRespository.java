package com.example.jwt_demo1.Contact;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRespository extends JpaRepository<Contact,Long> {
}
