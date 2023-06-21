package id.co.indivara.jdt12.miniproject.Bank.service;
import id.co.indivara.jdt12.miniproject.Bank.entity.TrxSaldoRekening;
import id.co.indivara.jdt12.miniproject.Bank.repo.TrxSaldoRekeningRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TrxSaldoRekeningService {
    @Autowired
    static
    TrxSaldoRekeningRepository trxSaldoRekeningRepository;
    public static Integer cekSaldo(Integer idAkun){
        TrxSaldoRekening trxSaldoRekening = trxSaldoRekeningRepository.findById(idAkun).orElse(null);
        return trxSaldoRekening.getSaldo();
    }
}