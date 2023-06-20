package id.co.indivara.jdt12.miniproject.Bank.entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "trx_saldo_akun")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TrxSaldoRekening {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;
    @Column(name = "id_akun",updatable = false, insertable = false)
    private Integer idAkun;
    
    @JoinColumn(name = "Id_akun" ) //buat join kolom foreign key
    @OneToOne(fetch = FetchType.LAZY)
    private MstAkun akun;

    @Column(name = "saldo")
    private Integer Saldo;
}