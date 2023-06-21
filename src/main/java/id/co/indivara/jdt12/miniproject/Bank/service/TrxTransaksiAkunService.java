package id.co.indivara.jdt12.miniproject.Bank.service;
import id.co.indivara.jdt12.miniproject.Bank.repo.TrxTransaksiAkunRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TrxTransaksiAkunService {
    @Autowired
    TrxTransaksiAkunRepository trxTransaksiAkunRepository;
    
}
