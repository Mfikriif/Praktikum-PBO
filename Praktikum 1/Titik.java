/**
 * File     	 : Titik.java		21/02/24
 * Nama penulis  : Muhammad Fikri Firdaus
 * NIM           : 24060122140115
 * Deskripsi     : Kelas yang berisi body dari MTitik.java
 * 
 */

class Titik
{
	double absis;
	double ordinat;
	static double counterTitik;
	
	Titik()
	{

		absis = 0;
		ordinat = 0;
		counterTitik = counterTitik + 1;
	
	}

	Titik(double absis, double ordinat)
	{
		this.absis = absis;
		this.ordinat = ordinat;
		counterTitik = counterTitik + 1;	
	}
	
	
	void setAbsis(double abs){
		absis = abs;
	}
	
	double getAbsis(){
		return absis;
	}

	void setOrdinat(double ord){
		ordinat = ord;
	}
	
	double getOrdinat(){
		return ordinat;
	}
	
	static double getCounterTitik(){
		return counterTitik;
	}
	
	
}

