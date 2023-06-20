package id.co.indivara.jdt12.miniproject.Bank.service;
import id.co.indivara.jdt12.miniproject.Bank.entity.MstAkun;
import id.co.indivara.jdt12.miniproject.Bank.repo.MstAkunRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class MstAkunService {
@Autowired
MstAkunRepository mstAkunRepository;

public List<MstAkun> getAllAkun(){return (List<MstAkun>) mstAkunRepository.findAll();}

public String saveAkun(MstAkun akun) {
    MstAkun cst = mstAkunRepository.save(akun);
    if (Objects.nonNull(cst) && cst.getIdAkun() != null) {
        return "akun " + cst.getIdAkun() + " Berhasil Dibuat";
    } else {
        return "Gagal Insert Customer";
    }
}


}
