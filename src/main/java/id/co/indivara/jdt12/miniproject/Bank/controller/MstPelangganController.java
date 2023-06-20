package id.co.indivara.jdt12.miniproject.Bank.controller;
import id.co.indivara.jdt12.miniproject.Bank.entity.MstPelanggan;
import id.co.indivara.jdt12.miniproject.Bank.service.MstPelangganService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class MstPelangganController {
    @Autowired
    MstPelangganService mstPelangganService;

    @GetMapping("/customer")
    public List<MstPelanggan> getAllCustomer(){
        return mstPelangganService.getAllCustomer();
    }
    
    @PostMapping("/simpancustomer")
    public MstPelanggan savePelanggan(@RequestBody MstPelanggan pelanggan){ return mstPelangganService.savePelanggan(pelanggan);}
    
}
