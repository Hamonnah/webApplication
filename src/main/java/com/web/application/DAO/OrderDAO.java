package com.web.application.DAO;

import com.web.application.domain.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
@Transactional
public interface OrderDAO extends CrudRepository<Order, Long> {

    List<Order> findByDateOut(LocalDate dateOut);

    @Override
    Optional<Order> findById(Long id);

}
