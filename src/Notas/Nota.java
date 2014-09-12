/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Notas;


/**
 *
 * @author Carina
 */
public class Nota {
        private Float numNota; 
	private String dataPagamento;
	private float valorPagamento;
        private String TipoPagamento;
	private String data_pag_efetuado;
	private float valor_pago;
	private String fornecedor;

    public float getNumNota() {
        return numNota;
    }

    public void setNumNota(float numNota) {
        this.numNota = numNota;
    }

    public String getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(String dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public float getValorPagamento() {
        return valorPagamento;
    }

    public void setValorPagamento(float valorPagamento) {
        this.valorPagamento = valorPagamento;
    }

    public String getTipoPagamento() {
        return TipoPagamento;
    }

    public void setTipoPagamento(String TipoPagamento) {
        this.TipoPagamento = TipoPagamento;
    }

    public String getData_pag_efetuado() {
        return data_pag_efetuado;
    }

    public void setData_pag_efetuado(String data_pag_efetuado) {
        this.data_pag_efetuado = data_pag_efetuado;
    }

    public float getValor_pago() {
        return valor_pago;
    }

    public void setValor_pago(float valor_pago) {
        this.valor_pago = valor_pago;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

}
