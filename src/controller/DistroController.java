package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class DistroController 
{
	public DistroController()
	{
		super();
	}
	
	private String os()
	{
		String os=System.getProperty("os.name");
		return os;
	}
	public void exibeDistro()
	{
		String so=os();
		if(so.contains("Linux"))
		{
			String proc="cat /etc/os-release";
			String[]arrProc=proc.split(" ");
			try {
				Process p =Runtime.getRuntime().exec(arrProc);
				InputStream fluxo =p.getInputStream();
				InputStreamReader leitor=new InputStreamReader(fluxo);
				BufferedReader buffer =new BufferedReader(leitor);
				String linha =buffer.readLine();
				
				while(linha!=null)
				{	
					if(linha.contains("stretch")&&linha.contains("9"))
					System.out.println(linha);
					linha=buffer.readLine();
				}
				buffer.close();
				leitor.close();
				fluxo.close();
			} catch (IOException e) {
				System.err.println(e);
			}
		}
		else
		{
			System.err.println("Sistema não suportado");
		}
	}
	
	
}
