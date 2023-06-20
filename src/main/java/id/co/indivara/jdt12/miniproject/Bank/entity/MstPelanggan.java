package id.co.indivara.jdt12.miniproject.Bank.entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@Entity
@Table(name= "mst_pelanggan")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MstPelanggan {
    @Id
    @Column(name = "id_pelanggan")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idPelanggan;
    @Column(name = "nama_pelanggan")
    private String namaPelanggan;
    @Column(name = "username")
    private String userName;
    @Column(name = "password")
    private String password;
    @Column(name = "no_ktp")
    private String noKtp;
    @Column(name = "no_telp")
    private String noTelp;
    @Column(name = "email")
    private String email;
    @Column(name = "alamat")
    private String alamat;
}