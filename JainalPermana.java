import java.util.Scanner;

class JainalPermana{
	
	public static void main(String[]args){
		Scanner scan= new Scanner(System.in);
		
		System.out.print("Masukan Nama Kamu:");
		String nama= scan.nextLine();
		
		System.out.print("Masukan Kelas Juga :");
		String kelas= scan.nextLine();
		
		if (nama.equals("Agung")&& kelas.equals("XIRPL2")){
			System.out.println("pulang!");
		}else{
		System.out.println("yaaaaaahh,ga boleh pulang...!");
	 }
  }	
}	