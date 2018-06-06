
public class TablaSimbolos {
	
	public Simbolo simbolos[] = new Simbolo[1000];
	
	public TablaSimbolos() {}
	
	public int  Buscar(String v) {
		for (int i = 0; i < simbolos.length; i++) {
			if(simbolos[i].valor == v) {
				return i;
			}
		}
		return -1; 
	}
	
	public int Insertar(String v, int t) {
		for (int i = 0; i < simbolos.length; i++) {
			if (simbolos[i]== null){
				simbolos[i].valor = v;
				simbolos[i].tipo = t;
				return i;
			}
		}
		return -1;
	}
	
	public void FijarTipo(int i, int n_t) {
		simbolos[i].tipo = n_t;
	}
	
	public int IndicarTipo(int i) {
		return simbolos[i].tipo;
	}
	
	public String IndicarValor(int i) {
		return simbolos[i].valor;
	}
	
	public void ImprimeTS() {
		for(Simbolo s : simbolos) {
			System.out.println("(" + s.tipo + "," + s.valor + ")");
		}
	}
	
	public void Inicializa() {
		simbolos[0] = new Simbolo(1,"0");
		simbolos[1] = new Simbolo(1,"1");
		simbolos[2] = new Simbolo(1,"2");
		simbolos[3] = new Simbolo(1,"3");
		simbolos[4] = new Simbolo(1,"4");
		simbolos[5] = new Simbolo(1,"5");
		simbolos[6] = new Simbolo(1,"6");
		simbolos[7] = new Simbolo(1,"7");
		simbolos[8] = new Simbolo(1,"8");
		simbolos[9] = new Simbolo(1,"9");
		simbolos[10] = new Simbolo(2,"a");
		simbolos[11] = new Simbolo(2,"b");
		simbolos[12] = new Simbolo(2,"c");
		simbolos[13] = new Simbolo(2,"d");
		simbolos[14] = new Simbolo(2,"e");
		simbolos[15] = new Simbolo(2,"f");
		simbolos[16] = new Simbolo(2,"g");
		simbolos[17] = new Simbolo(2,"h");
		simbolos[18] = new Simbolo(2,"i");
		simbolos[19] = new Simbolo(2,"j");
		simbolos[20] = new Simbolo(2,"k");
		simbolos[21] = new Simbolo(2,"l");
		simbolos[22] = new Simbolo(2,"m");
		simbolos[23] = new Simbolo(2,"n");
		simbolos[24] = new Simbolo(2,"ñ");
		simbolos[25] = new Simbolo(2,"o");
		simbolos[26] = new Simbolo(2,"p");
		simbolos[27] = new Simbolo(2,"q");
		simbolos[28] = new Simbolo(2,"r");
		simbolos[29] = new Simbolo(2,"s");
		simbolos[30] = new Simbolo(2,"t");
		simbolos[31] = new Simbolo(2,"u");
		simbolos[32] = new Simbolo(2,"v");
		simbolos[33] = new Simbolo(2,"w");
		simbolos[43] = new Simbolo(2,"x");
		simbolos[44] = new Simbolo(2,"y");
		simbolos[45] = new Simbolo(2,"z");
		simbolos[46] = new Simbolo(2,"||");
		simbolos[47] = new Simbolo(2,"&&");
		simbolos[48] = new Simbolo(2,"!");
		simbolos[49] = new Simbolo(2,"!=");
		simbolos[50] = new Simbolo(2,"<");
		simbolos[51] = new Simbolo(2,">");
		simbolos[52] = new Simbolo(2,"<=");
		simbolos[53] = new Simbolo(2,">=");
		simbolos[54] = new Simbolo(2,"==");
		simbolos[55] = new Simbolo(3,"+");
		simbolos[56] = new Simbolo(3,"-");
		simbolos[57] = new Simbolo(3,"*");
		simbolos[58] = new Simbolo(3,"/");
		simbolos[59] = new Simbolo(3,"%");
		simbolos[60] = new Simbolo(0,"\n");
		simbolos[61] = new Simbolo(0,"\t");
		simbolos[62] = new Simbolo(0,"\b");
		simbolos[10] = new Simbolo(2,"A");
		simbolos[11] = new Simbolo(2,"B");
		simbolos[12] = new Simbolo(2,"C");
		simbolos[13] = new Simbolo(2,"D");
		simbolos[14] = new Simbolo(2,"E");
		simbolos[15] = new Simbolo(2,"F");
		simbolos[16] = new Simbolo(2,"G");
		simbolos[17] = new Simbolo(2,"H");
		simbolos[18] = new Simbolo(2,"I");
		simbolos[19] = new Simbolo(2,"J");
		simbolos[20] = new Simbolo(2,"K");
		simbolos[21] = new Simbolo(2,"L");
		simbolos[22] = new Simbolo(2,"M");
		simbolos[23] = new Simbolo(2,"N");
		simbolos[24] = new Simbolo(2,"Ñ");
		simbolos[25] = new Simbolo(2,"O");
		simbolos[26] = new Simbolo(2,"P");
		simbolos[27] = new Simbolo(2,"Q");
		simbolos[28] = new Simbolo(2,"R");
		simbolos[29] = new Simbolo(2,"S");
		simbolos[30] = new Simbolo(2,"T");
		simbolos[31] = new Simbolo(2,"U");
		simbolos[32] = new Simbolo(2,"V");
		simbolos[33] = new Simbolo(2,"W");
		simbolos[43] = new Simbolo(2,"X");
		simbolos[44] = new Simbolo(2,"Y");
		simbolos[45] = new Simbolo(2,"Z");
	}

}
