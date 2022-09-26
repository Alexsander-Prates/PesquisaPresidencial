package viewTable;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import model.Candidato;

public class TableModels extends AbstractTableModel {
	
	private static final long serialVersionUID = 1L;
	private static final int COL_NOME = 0;
	private static final int COL_CODIGO = 1;
	
	private List<Candidato> valores;
	
	
	public TableModels(List<Candidato> valores) {
		this.valores = new ArrayList<Candidato>(valores);
	}
	
	@Override
	public int getRowCount() {
		return valores.size();
		//retornando o tamanho da linhas da List valores com size
	}

	@Override
	public int getColumnCount() {
		//vai retornar 2 colunas
		return 2;
	}
	
	public String getColumnName(int column) {
		//determinando o nome das colunas.
		if(column == COL_NOME) return "Nome";
		if(column == COL_CODIGO) return "Código";
		return "";
	}
	
	public Object getValueAt(int rowIndex, int columnIndex) {
		//retornando os valores das colunas e linhas.
		Candidato candidato = valores.get(rowIndex);
		if (columnIndex == COL_NOME) 
			return candidato.getNome();
		else 
			if (columnIndex == COL_CODIGO) 
				return candidato.getCodigo();
			
		return ""; //Nunca deve ocorrer.
		
	}
	
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
		Candidato candidato = valores.get(rowIndex);
		//Vamos alterar o valor da coluna columnIndex na linha rowIndex com o valor aValue passado no parï¿½metro.
		//Note que vc poderia alterar 2 campos ao invï¿½s de um sï¿½.
		if (columnIndex == COL_NOME)
			candidato.setNome(aValue.toString());
		else 
			if (columnIndex == COL_CODIGO) 
				candidato.setCodigo(Integer.parseInt(aValue.toString()));
	}

	public Class<?> getColumnClass(int columnIndex) {
		//Qual a classe das nossas colunas? Como estamos exibindo texto, ï¿½ string.
		return String.class;
	}

	public boolean isCellEditable(int rowIndex, int columnIndex) {
		//Indicamos se a célula da rowIndex e da columnIndex é editável. Nossa tabela toda ï¿½.
		return true;
	}
	//Já que esse tableModel é de candidatos, vamos fazer um get que retorne um objeto candidato inteiro.
	//Isso elimina a necessidade de chamar o getValueAt() nas telas. 
	public Candidato get(int row) {
		return valores.get(row);
	}
	
	

}
