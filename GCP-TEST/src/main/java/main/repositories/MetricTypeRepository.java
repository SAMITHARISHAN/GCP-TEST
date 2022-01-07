package main.repositories;

import main.models.MetricType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MetricTypeRepository extends JpaRepository<MetricType,Long> {

    List<MetricType> findAll();
}
