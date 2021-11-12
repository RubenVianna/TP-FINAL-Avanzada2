/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import controlador.Controlador;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Area;
import modelo.Cliente;
import modelo.CondicionPrioritaria;
import modelo.EstadoTurno;
import modelo.TipoCliente;
import modelo.Tramite;
import modelo.UsuarioWeb;

/**
 *
 * @author RUBEN
 */
@WebServlet(name = "Iniciar", urlPatterns = {"/Iniciar"})

public class Iniciar extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    
    }

}
