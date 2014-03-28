package com.winelandsoft.jeroglificos.lib.app;

import com.android.volley.RequestQueue;
import com.winelandsoft.jeroglificos.lib.JeroglificosDataService;
import com.winelandsoft.jeroglificos.lib.beans.Jeroglifico;

public class JerglificosManager implements JeroglificosDataService {
	RequestQueue requestQueue;
	
	public JerglificosManager(){
		requestQueue = MyVolley.getRequestQueue();
	}

	@Override
	public Jeroglifico GetJeroglificoActualUsuario() {
		
		return null;
	}

	@Override
	public Jeroglifico GetJeroglificosPendientesUsuario() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Jeroglifico GetJeroglificosCompletadosUsuario() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Jeroglifico GetJeroglificosFavoritosUsuario() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Jeroglifico GetJeroglificosLikesUsuario() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Jeroglifico GetJeroglificoById() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Jeroglifico IniciarNuevoJeroglificoUsuario() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Jeroglifico DejarJeroglificoPendienteUsuario() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Jeroglifico RecuperarJeroglificoPendienteUsuario() {
		// TODO Auto-generated method stub
		return null;
	}

}
