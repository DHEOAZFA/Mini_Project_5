package id.co.indivara.jdt12.miniproject.Bank.service;
import id.co.indivara.jdt12.miniproject.Bank.entity.MstPelanggan;
import id.co.indivara.jdt12.miniproject.Bank.repo.MstPelangganRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Objects;

@Service
public class MstPelangganService {

    @Autowired
    MstPelangganRepository mstPelangganRepository;
    public List<MstPelanggan> getAllCustomer() {return mstPelangganRepository.findAll();}
    public MstPelanggan savePelanggan(MstPelanggan pelanggan){return mstPelangganRepository.save(pelanggan);}
    public MstPelanggan UpdatePelanggan(MstPelanggan pelanggan, Integer idPelanggan){
        MstPelanggan plg= mstPelangganRepository.findById(idPelanggan).get();
        if (Objects.nonNull(pelanggan.getNamaPelanggan()) && !"".equalsIgnoreCase(pelanggan.getNamaPelanggan())) {
            plg.setNamaPelanggan(pelanggan.getNamaPelanggan());
        }
        if (Objects.nonNull(pelanggan.getNamaPelanggan()) && !"".equalsIgnoreCase(pelanggan.getNamaPelanggan())) {
            plg.setNamaPelanggan(pelanggan.getNamaPelanggan());
        }
        return mstPelangganRepository.save(plg);
    }
    public void deletePelanggan(Integer pelangganId){}
}
