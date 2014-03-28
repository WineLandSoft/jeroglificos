package com.winelandsoft.jeroglificos.lib;

import com.winelandsoft.jeroglificos.lib.beans.Jeroglifico;

public interface JeroglificosDataService {
	public abstract Jeroglifico GetJeroglificoActualUsuario();
	public abstract Jeroglifico GetJeroglificosPendientesUsuario();
	public abstract Jeroglifico GetJeroglificosCompletadosUsuario();
	public abstract Jeroglifico GetJeroglificosFavoritosUsuario();
	public abstract Jeroglifico GetJeroglificosLikesUsuario();
	public abstract Jeroglifico GetJeroglificoById();
	public abstract Jeroglifico IniciarNuevoJeroglificoUsuario();
	public abstract Jeroglifico DejarJeroglificoPendienteUsuario();
	public abstract Jeroglifico RecuperarJeroglificoPendienteUsuario();
}
