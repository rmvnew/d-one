package br.com.done.done.repository;

import br.com.done.done.model.RepasseIpva;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RepasseIpvaRepository extends JpaRepository<RepasseIpva, Long> {

    List<RepasseIpva> findByRepasseIdAndRemovidoFalse(long repasseId);
}
