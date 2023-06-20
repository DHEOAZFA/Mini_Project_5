package id.co.indivara.jdt12.miniproject.Bank.entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import javax.persistence.*;

@Entity 
@Table(name="Mst_akun") 
@Data 
@NoArgsConstructor 
@AllArgsConstructor 
@Builder 
public class MstAkun {
    @Id
    @Column(name = "Id_akun")
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    private Integer idAkun; 

    @Column(name = "Id_Pelanggan", updatable = false, insertable = false)
    private Integer pelangganId;
    @JoinColumn(name = "Id_Pelanggan" ) 
    @ManyToOne(fetch = FetchType.LAZY)
    @OnDelete(action = OnDeleteAction.NO_ACTION) 
    private MstPelanggan pelanggan;

    @Column (name = "no_akun")
    private Integer noAkun;
    @Column (name = "pin")
    private Integer pin;
}