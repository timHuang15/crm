package com.tocean.crm.jwt;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tocean.crm.common.base.baseObject.Response;
import org.springframework.util.AntPathMatcher;
import org.springframework.util.PathMatcher;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class JwtAuthenticationFilter extends OncePerRequestFilter {
    private final String protectUrlPattern;
    private static final PathMatcher pathMatcher = new AntPathMatcher();

    public JwtAuthenticationFilter(String protectUrlPattern) {
        this.protectUrlPattern = protectUrlPattern;
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {

        try {
            if(pathMatcher.match(protectUrlPattern, request.getServletPath())) {
                request = JwtUtil.validateTokenAndAddUserIdToHeader(request);
            }
        } catch (Exception e) {
            HttpServletResponse httpResponse = (HttpServletResponse) response;
            httpResponse.setCharacterEncoding("UTF-8");
            httpResponse.setContentType("application/json; charset=utf-8");
            httpResponse.setStatus(HttpServletResponse.SC_UNAUTHORIZED);

            ObjectMapper mapper = new ObjectMapper();

            Response resp =Response.fail("invalid token!");
            httpResponse.getWriter().write(mapper.writeValueAsString(resp));
            return;
        }
        filterChain.doFilter(request, response);
    }

}