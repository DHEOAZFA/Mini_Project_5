package id.co.indivara.jdt12.miniproject.Bank.repo;
import id.co.indivara.jdt12.miniproject.Bank.entity.MstAkun;
import id.co.indivara.jdt12.miniproject.Bank.entity.MstPelanggan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MstPelangganRepository extends JpaRepository<MstPelanggan,Integer> {
}