/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ConexaoBanco;

import Exeption.FalhaAoConectaoComOBanco;
import Menu.MenuPrincipal;
import Notas.CadastrarNotas;
import Notas.EditarNota;
import Notas.Nota;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


/**
 *
 * @author Carina
 */
public class NotasDAO {
    public NotasDAO(){  super();   }
    Nota nota = new Nota();
    CadastrarNotas cadastrarNotas = new CadastrarNotas();
    MenuPrincipal menuPrincipal = new MenuPrincipal();

    public void InsertNotas(MenuPrincipal menuPrincipal) throws SQLException{
       PreparedStatement stmt = null;
       StringBuilder sql = new StringBuilder();
       sql.append("insert into notas(numNota,tipoPagamento,dataPagamento,valorPagamento,fornecedor)");
       sql.append(" values(?,?,?,?,?)");
       
       try{
        stmt = ConectionBd.getInstance().getConnection().prepareStatement(sql.toString());
        stmt.setString(1, cadastrarNotas.getCampo_NumNota().toString());
        stmt.setString(2, cadastrarNotas.getButton_TipoPagamento().toString());
        stmt.setString(3, cadastrarNotas.getCampo_DataPagamento().toString());
        stmt.setString(4, cadastrarNotas.getCampo_valor().toString());
        stmt.setString(5, cadastrarNotas.getCampo_SelectFornecedor().toString());
        stmt.executeUpdate();
        
        JOptionPane.showMessageDialog(null, "Inserido com sucesso!");
       }
        catch(Exception ex){
            
        }
    }
    public void UpdateNotas() throws SQLException{
        EditarNota editanota = new EditarNota();
        PreparedStatement stmt = null;
        StringBuilder sql = new StringBuilder();
        sql.append(("UPDATE notas SET numNota =")+ editanota.getCampoEdit_NumNota()+(",tipoPagamento = ")+editanota.getButtonEdit_TipoPagamento()+(",dataPagamento =")+editanota.getCampoEdit_DataPagamento()+(",valorPagamento =")+editanota.getCampoEdit_valor()+(",fornecedor= ")+editanota.getCampoEdit_SelectFornecedor()+(");"));
        sql.append("WHERE numNota = "+  menuPrincipal.getConteudoDApesquisa_da_tabela()+";");
    }
    }