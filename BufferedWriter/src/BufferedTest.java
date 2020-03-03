import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;



public class BufferedTest {
	public static void main(String[] args) {
		File file = new File("arquivo.txt");
		
		
		try {
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			
			bw.write("Escrevendo uma mensagem no arquivo");
			bw.newLine();
			bw.write("E pulando uma linha");
			bw.flush();
			bw.close();
			
			
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String s = null;
			while((s=br.readLine())!= null ) {
				System.out.println(s);
			}
			fr.close();
			 
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
