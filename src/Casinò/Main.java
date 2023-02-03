package Casinò;
import java.util.Scanner;
public class Main {

	public static void main(String []args) {
		Scanner sint= new Scanner(System.in);
		Scanner sdouble= new Scanner(System.in);
		Scanner sstring= new Scanner(System.in);
		String r="si";
		ContoCorrente c= new ContoCorrente ();
while(0==0) {
		if(r.toLowerCase()=="si") {
			
			if(c.getSaldo()>0) {
				System.out.println("Inserisci il numero del dado su cui vuoi puntare:");
				int n=sint.nextInt();
				System.out.println("Inserisci la cifra da puntare:");
				double p=sdouble.nextDouble();
				c.Dado(n, p);
				System.out.println("Vuoi rigiocare? (digita si o no)");
				r=sstring.nextLine();
				
			}else {
				System.out.println("Il tuo saldo è pari a 0! La Sisal ha vinto anche questa volta.");
				break;
			}
	}else {
		System.out.println("Te ne vai con "+c.getSaldo()+"€ \nTORNA PRESTO!");
		break;
	}
}
		
		
	}
}
