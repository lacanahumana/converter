import java.util.*;
public class convertirbinario {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int  numero_decimal;
		int c; //cociente
		int r;
		int i;
		int r1, r2, r3, r4, r5, r6, r7, r8;
		
		r1 = 0;
		r2 = 0;
		r3 = 0;
		r4 = 0;
		r5 = 0;
		r6 = 0;
		r7 = 0;
		r8 = 0;
		i = 0;
		System.out.println("ingrese un numero decimal");
		numero_decimal = sc.nextInt();
		
		c = numero_decimal / 2;
		
		r = numero_decimal % 2;
		r1 = r;
		System.out.print(r);
		while(true) {
		    
			c = c / 2;
			
			r = c % 2;

			i++;
			if (i == 1) {r2 = r;}
			if (i == 2) {r3 = r;}
			if (i == 3) {r4 = r;}
			if (i == 4) {r5 = r;}
			if (i == 5) {r6 = r;}
			if (i == 6) {r7 = r;}
			if (i == 7) {r8 = r;}
						
		    
		    if (c == 0) { break;}
		}
		System.out.print("" + r8 + "" + r7 + "" + r6 + "" + r5 + "" + r4 + "" + r3 + "" + r2 + "" + r1 + "" );

	}

}
