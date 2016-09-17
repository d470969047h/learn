package com.am.jlfu.authorizer.impl;


import com.am.jlfu.authorizer.Authorizer;
import com.am.jlfu.fileuploader.exception.AuthorizationException;
import com.am.jlfu.fileuploader.web.UploadServletAction;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.util.UUID;



/**
 * Default {@link Authorizer} that never throws an {@link AuthorizationException}.
 * 
 * @author antoinem
 * 
 */
@Component
public class DefaultAuthorizer
		implements Authorizer {

	@Override
	public void getAuthorization(HttpServletRequest request, UploadServletAction action, UUID clientId, UUID... optionalFileId) {
		// by default, all calls are authorized
	}

}
