package tp1_desenv_web.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tp1_desenv_web.domain.Usuario;
import tp1_desenv_web.repository.UsuarioRepository;


public class CadastroController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public CadastroController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("cadastro.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Usuario usuario = new Usuario();
		usuario.setNome(request.getParameter("nome"));
		usuario.setEmail(request.getParameter("email"));
		usuario.setSenha(Integer.valueOf(request.getParameter("senha")));
		UsuarioRepository.adicionar(usuario);

		
		request.setAttribute("nome", usuario.getNome());
		request.setAttribute("lista", UsuarioRepository.getLista());
		
		if(usuario.getSenha() == 123) {
			request.getRequestDispatcher("adicionado.jsp").forward(request, response);
		}else {
			request.getRequestDispatcher("erro.jsp").forward(request, response);
		}
	}
}
