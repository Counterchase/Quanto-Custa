package quantocusta.servicos;



import javax.inject.Inject;
import quantocusta.Modelo.Cliente;
import quantocusta.Repositorio.Clientes;
import quantocusta.utilidades.Transacional;

public class ClienteService {
    @Inject
    private Clientes clientes;
    
    @Transacional
    public void salvar(Cliente cliente){
        clientes.salvar(cliente);
    }
    
    @Transacional
    public void excluir(Cliente cliente){
        clientes.excluir(cliente);
    }
    
}
