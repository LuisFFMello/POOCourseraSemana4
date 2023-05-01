package org.example;

import java.util.HashMap;
import java.util.Map;

public class CarrinhoDeCompras {
    private Map<Produto, Integer> chart = new HashMap<>();
    private static double total= 0;
    private static int qtChart;

    public void addProd(Produto p, int qtde)
    {
        if (chart.containsKey(p))
        {
            chart.put(p, qtde+=qtde);
        }
        else chart.put(p, qtde);
        qtChart += qtde;
    }
    public void delProd(Produto p, int qtde)
    {
        if (chart.containsKey(p))
        {
            chart.remove(p);
            qtChart -= qtde;
        }
    }

    public double getChartPrice()
    {
        for(Produto p : chart.keySet() )
        {
            total = p.getPreco() * qtChart;
        }
        return total;
    }
    public HashMap<Produto, Integer> getChart() {
        return (HashMap<Produto, Integer>) chart;
    }
    public void setChart(HashMap<Produto, Integer> chart) {
        this.chart = chart;
    }
    public static int getQtChart() {
        return qtChart;
    }
    public static void setQtChart(int qtChart) {
        CarrinhoDeCompras.qtChart = qtChart;
    }

}