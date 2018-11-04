package conceicao.financas.core.lancamento;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;


@Entity
@Table(name = "lancamento")
@EntityListeners(AuditingEntityListener.class)
public class Lancamento implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private Double valor;

    @NotNull
    private Integer tomador;

    @NotNull
    private Integer beneficiario;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Integer getTomador() {
        return tomador;
    }

    public void setTomador(Integer tomador) {
        this.tomador = tomador;
    }

    public Integer getBeneficiario() {
        return beneficiario;
    }

    public void setBeneficiario(Integer beneficiario) {
        this.beneficiario = beneficiario;
    }
}
