package hieulc.spring.ssm.repository;

import hieulc.spring.ssm.domain.Payment;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
