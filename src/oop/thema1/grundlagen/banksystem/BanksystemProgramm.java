package oop.thema1.grundlagen.banksystem;

public class BanksystemProgramm {

	public static void main(String[] args) {

		Bank bank = new Bank("Sparkasse");
		bank.setAnzahlKonten(2);
		bank.printBankInfo();
		
		Kunde kunde1 = new Kunde();
		kunde1.setName("Max Mustermann");
		kunde1.setAdresse("Mustermannstraße 1");
		
		Kunde kunde2 = new Kunde();
		kunde2.setName("Anna Meier");
		kunde2.setAdresse("Meierweg 2");
		
		System.out.println("Kundeninformationen:");
		System.out.println(kunde1);
		System.out.println(kunde2);
		
		
		// Teil 2
		Aktie aktie1 = new Aktie("AAPL123", "Apple Inc.", 150.0);
		Aktie aktie2 = new Aktie("MSFT456", "Microsoft Corp.", 280.0);
		
		System.out.println("Aktieninformationen:");
		System.out.println(aktie1);
		System.out.println(aktie2);
	}

}
