package com.example.CodeInitLoginBackend.Repo;

import com.example.CodeInitLoginBackend.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepo extends JpaRepository<Cart, Long> {
}
