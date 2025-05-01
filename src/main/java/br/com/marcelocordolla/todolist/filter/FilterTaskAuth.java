package br.com.marcelocordolla.todolist.filter;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;
import java.util.Arrays;
import java.util.Base64;

@Component
public class FilterTaskAuth extends OncePerRequestFilter {

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {

        // pegar autenticacão usuario e senha
        var authorization = request.getHeader("Authorization");

        var authEncoder = authorization.substring("Basic".length()).trim();

        byte[] authDecoder = Base64.getDecoder().decode(authEncoder);

        var authString = new String(authDecoder);

        String[] credentials = authString.split(":");
        String username = credentials[0];
        String password = credentials[1];

        System.out.println(username);
        System.out.println(password);

        // validar usuario

        // validar a senha

        // seguir viagem


        filterChain.doFilter(request, response);
    }
}
