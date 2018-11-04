package conceicao.financas.core.lancamento;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/lancamento")
public class LancamentoController {

    @Autowired
    LancamentoRepository lancamentoRepository;

    @GetMapping("/all")
    public List<Lancamento> getAll() {
        return lancamentoRepository.findAll();
    }

    @PostMapping("/salvar")
    public Lancamento save(@RequestBody Lancamento lancamento) {
        return lancamentoRepository.save(lancamento);
    }
}
