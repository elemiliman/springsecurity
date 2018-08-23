package com.linnelservices.restws.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;

import org.springframework.security.access.AccessDeniedException;

public class SecurityExceptionMapper implements ExceptionMapper<AccessDeniedException> {

	@Override
	public Response toResponse(AccessDeniedException e) {
		
		return Response.status(Response.Status.FORBIDDEN).build();
	}

}
