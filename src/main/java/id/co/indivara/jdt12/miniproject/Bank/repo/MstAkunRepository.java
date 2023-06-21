package id.co.indivara.jdt12.miniproject.Bank.repo;
import id.co.indivara.jdt12.miniproject.Bank.entity.MstAkun;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface MstAkunRepository extends CrudRepository<MstAkun,Integer> {
    
}
