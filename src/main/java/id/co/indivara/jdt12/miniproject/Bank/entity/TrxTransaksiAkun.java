package id.co.indivara.jdt12.miniproject.Bank.entity;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "Transaksi")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TrxTransaksiAkun {
    @Id
    @Column(name = "id_transaksi")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idTransaksi;
    
    @Column(name = "id_akun", updatable = false, insertable = false)
    private Integer idAkun;
    @JoinColumn(name = "Id_akun" )
    @ManyToOne(fetch = FetchType.LAZY)
    @OnDelete(action = OnDeleteAction.NO_ACTION)
    private MstAkun akun;
    
    
    @Column(name = "id_target_akun")
    private Integer idTargetAkun;
    @Column(name = "tipe_transaksi")
    private String tipeTransaksi;
    @Column(name = "tanggal_pembuatan_transaksi")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "UTC")
    private Instant tanggalPembuatanTransaksi;
    @Column(name = "jumlah_transaksi")
    private Integer jumlahTransaksi;
}