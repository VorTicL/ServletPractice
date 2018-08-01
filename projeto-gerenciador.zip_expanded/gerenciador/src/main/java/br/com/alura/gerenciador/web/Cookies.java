package br.com.alura.gerenciador.web;

import javax.servlet.http.Cookie;

public class Cookies {
	
	private Cookie [] cu;
	
	public Cookies(Cookie [] cu) {
		if(cu != null)
			this.cu = cu;
	}
	
	public Cookie isLoged() {
		if(this.cu == null)
			return null;
		
		for(Cookie cu : this.cu) {
			if (cu.getName().equals("usuario")) {
                return cu;
            }
		}
		
		return null;
	}
}
