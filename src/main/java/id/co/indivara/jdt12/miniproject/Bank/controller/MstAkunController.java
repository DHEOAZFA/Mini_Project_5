package id.co.indivara.jdt12.miniproject.Bank.controller;
import id.co.indivara.jdt12.miniproject.Bank.entity.MstAkun;
import id.co.indivara.jdt12.miniproject.Bank.service.MstAkunService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
@RestController
public class MstAkunController{
@Autowired
    MstAkunService mstAkunService;
    @GetMapping("/akun")
    public List<MstAkun> getAllakun(){
        return mstAkunService.getAllAkun();
    }
    
    @PostMapping("/simpanakun")
    public String saveAkun(@RequestBody MstAkun akun){ return mstAkunService.saveAkun(akun);}

    
}
