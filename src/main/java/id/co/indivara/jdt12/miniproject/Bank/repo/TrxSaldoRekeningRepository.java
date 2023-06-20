package id.co.indivara.jdt12.miniproject.Bank.repo;

import id.co.indivara.jdt12.miniproject.Bank.entity.TrxSaldoRekening;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrxSaldoRekeningRepository extends JpaRepository<TrxSaldoRekening,Integer> {
    
}
