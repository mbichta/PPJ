package PPJ; 

public class ZadanieDomowe {

	public static void main(String[] args) {
		
		int licznik = Integer.parseInt(args[0]);
		int a = 0;
		int[]tab = new int[licznik];
		for(int i = 0; i < licznik; i++) {
			tab[a++] = i;
		}
for(int i = 0; i <licznik; i++) {
	System.out.print(tab[i]+", ");
}
	}

}
