package com.softmaster;

import lombok.Data;

@Data
public class Empresa {
private Long id;
private String razonSocial;
private int Nit;
private String telefono;
 //privada o publica
public enum tipoEmpresa{
	PUBLICA, PRIVADA, MIXTA
}

}
