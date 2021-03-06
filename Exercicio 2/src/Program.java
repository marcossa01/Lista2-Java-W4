import java.text.ParseException;
import java.text.SimpleDateFormat;

import Domain.Empresa;

public class Program {
	
	// Em 2021 uma startup de tecnologia, denominada de “Empresa X” é avaliada em
	// R$ 1,13 milhão e possui uma média de crescimento anual de 148%. Uma concorrente do ramo,
	// “Empresa Y”, é avaliada em R$ 18,4 milhões e com sua média de crescimento anual em 32%.
	
	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		
		Empresa e1 = new Empresa("Empresa 1", sdf.parse("01/01/2021 00:00"), 1130000.00, 148);
		Empresa e2 = new Empresa("Empresa 2", sdf.parse("01/01/2021 00:00"), 184000000.00, 32);
		
		Integer anos = 0;
		
		while(e1.getValorEmpresa() < e2.getValorEmpresa()) {
			e1.CrescimentoEmpresa();
			e2.CrescimentoEmpresa();
			anos++;
		}
		
		System.out.printf("Valor Empresa 1: %.2f", e1.getValorEmpresa());
		System.out.println();
		System.out.printf("Valor Empresa 2: %.2f", e2.getValorEmpresa());
		System.out.println();
		
		System.out.println("Quantidade de anos: " + anos);
		
		
	}

}
