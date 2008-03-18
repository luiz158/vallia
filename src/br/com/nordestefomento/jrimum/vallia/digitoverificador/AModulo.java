/*
 * Copyright 2007, JMatryx Group
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * <a href="http://www.apache.org/licenses/LICENSE-2.0">
 * http://www.apache.org/licenses/LICENSE-2.0 </a>
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 * 
 * Copyright 2007, Grupo JMatryx
 * 
 * Licenciado sob a licença da Apache, versão 2.0 (a “licença”); você não pode
 * usar este arquivo exceto na conformidade com a licença. Você pode obter uma
 * cópia da licença em
 * 
 * <a href="http://www.apache.org/licenses/LICENSE-2.0">
 * http://www.apache.org/licenses/LICENSE-2.0 </a>
 * 
 * A menos que seja requerido pela aplicação da lei ou esteja de acordo com a
 * escrita, o software distribuído sob esta licença é distribuído “COMO É”
 * BASE,SEM AS GARANTIAS OU às CONDIÇÕES DO TIPO, expresso ou implicado. Veja a
 * licença para as permissões sobre a línguagem específica e limitações quando
 * sob licença.
 * 
 * 
 * Created at / Criado em : 17/03/2007 - 17:42:07
 * 
 */

package br.com.nordestefomento.jrimum.vallia.digitoverificador;

import br.com.nordestefomento.jrimum.ACurbitaObject;

/**
 * 
 * <p>
 * Representa o módulo no contexto de autenticação, ou seja, uma rotina que auxilia no cálculo do dígito verificador.
 * </p>
 * <p>
 * As rotinas tradicionais são Módulo 10 e Módulo 11.
 * </p>
 * 
 * 
 * @author Gabriel Guimarães
 * @author <a href="http://gilmatryx.googlepages.com/">Gilmar P.S.L</a>
 * @author Misael Barreto 
 * @author Rômulo Augusto
 * @author <a href="http://www.nordeste-fomento.com.br">Nordeste Fomento Mercantil</a>
 * 
 * @since JMatryx 1.0
 * 
 * @version 1.0
 */
public abstract class AModulo extends ACurbitaObject{
	
	/**
	 * Mensagem da exceção lançada no método calcular.
	 */
	protected static final String O_ARGUMENTO_DEVE_CONTER_APENAS_NUMEROS = "O argumento deve conter apenas números !";

	private EnumModulo enumModulo;
	
	private int limiteMaximo;
	
	private int limiteMinimo;
	
	public AModulo() {
		super();
	}
	
	/**
	 * Calcula o módulo (no contexto da autenticação) do número passado.
	 * @param numero - número para ser calculado o módulo.
	 * @return módulo do número.
	 * @throws IllegalArgumentException caso a String não esteja em um formatador aceitável.
	 * (A String deve conter apenas números).
	 * 
	 */
	public abstract int calcular(String numero)	throws IllegalArgumentException;

	/**
	 * Calcula o módulo (no contexto da autenticação) do número passado.
	 * @param numero - número para ser calculado o módulo.
	 * @return módulo do número.
	 */
	public abstract int calcular(long numero);

	/**
	 * <p>
	 * Instancia o módulo que foi especificado pela enumeração de módulos.
	 * </p>
	 * <p>
	 * <code>A_Módulo módulo = A_Módulo.getInstance(E_Módulo.MÓDULO_11);</code>
	 * </p>
	 * @param enumModulo - enumeração de módulos.
	 * @return uma instância de módulo.
	 */
	public static AModulo getInstance(EnumModulo enumModulo)
	{
		AModulo aModulo = enumModulo.getModulo();		
		
		return aModulo;
	}

	/**
	 * <p>
	 * Recupera o valor do módulo.
	 * </p>
	 * <p>
	 * Ex.: Para o módulo 10, retorna <code>10</code>; para o módulo 11, <code>11</code>.
	 * </p>
	 * @return valor
	 */
	public int getValor(){
		return enumModulo.getValor();	
	}
		
	/**
	 * Recupera o limite máximo.
	 * @return limite máximo.
	 */
	public int getLimiteMaximo() {
		return limiteMaximo;
	}

	/**
	 * Modifica o limite máximo.
	 * @param limiteMaximo - limite máximo.
	 */
	public void setLimiteMaximo(int limiteMaximo) {
		this.limiteMaximo = limiteMaximo;
	}

	/**
	 * Recupera o limite mínimo.
	 * @return limite mínimo.
	 */
	public int getLimiteMinimo() {
		return limiteMinimo;
	}

	/**
	 * Modifica o limite mínimo.
	 * @param limiteMinimo - limite mínimo.
	 */
	public void setLimiteMinimo(int limiteMinimo) {
		this.limiteMinimo = limiteMinimo;
	}

	/**
	 * Recupera a enumeração de módulos.
	 * @return enumeração de módulos.
	 */
	public EnumModulo getE_Modulo() {
		return enumModulo;
	}

	/**
	 * Modifica a enumeração de módulos.
	 * @param enumModulo - enumeração de módulos.
	 */
	public void setE_Modulo(EnumModulo enumModulo) {
		this.enumModulo = enumModulo;
	}
			
}
