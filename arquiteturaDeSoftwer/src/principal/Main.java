package principal;

import java.util.Date;

import controller.ClienteController;
import controller.PedidoController;
import model.Cliente;
import model.Pedido;
import model.Produto;

public class Main {

	public static void main(String[] args) {
		
		ClienteController clienteController = new ClienteController();
		Cliente cliente = clienteController.criarCliente(1,"will","wilsonneto@.br");
		clienteController.exibirCliente(cliente);
		
		Produto produto = new Produto(101, "Pc", 3.999);
	
		Date data = new Date();
		
		PedidoController pedidoController = new PedidoController();
	
		Pedido pedido = pedidoController.criarPedido(1, cliente, produto, 1, data);
	
		pedidoController.exibirDetalhesPedido(pedido);
	
	}

}
